package StepDefinitions;

import Pages.Locaters;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


public class _06_AddToCartListSteps {

    Locaters pl = new Locaters();

    @And("Click to Dresses")
    public void clickToDresses() {
        pl.myClick(pl.dresses);
    }

    @And("Click to Add to card and continue shopping")
    public void clickToAddToCardAndContinueShopping() {
        int random1=random();
        pl.myClickScript(pl.AllProuducts.get(random1));
        pl.myClick(pl.continueShopping);
        pl.added.add(pl.AllProuducts.get(random1).getAttribute("data-id-product"));

        int random2=random();
        while (random1==random2){
            random2=random();
        }
        pl.myClickScript(pl.AllProuducts.get(random2));
        pl.myClickScript(pl.continueShopping);
        pl.added.add(pl.AllProuducts.get(random2).getAttribute("data-id-product"));

        int random3=random();
        while (random3==random1 || random3==random2){
            random3=random();
        }
        pl.myClickScript(pl.AllProuducts.get(random3));
        pl.myClick(pl.continueShopping);
        pl.added.add(pl.AllProuducts.get(random3).getAttribute("data-id-product"));

        pl.myClick(pl.card);

    }

    @Then("Verify products and product amount")
    public void verifyProductsAndProductAmount() {
        int a=1;
        for (int i = 0; i <pl.inCardProuducts.size() ; i++) {
            for (int j = 0; j <pl.added.size(); j++) {
                if(pl.inCardProuducts.get(i).getText().contains(pl.added.get(j))){
                    System.out.println(a+". Ürün Eşleşti! Ürün kodu: "+pl.added.get(j));
                    a++;
                }
            }
        }
        pl.verifyContainsText(pl.productAmount,"3");
       }

        public int random(){
        return (int) (Math.random() * pl.AllProuducts.size());
    }
}


