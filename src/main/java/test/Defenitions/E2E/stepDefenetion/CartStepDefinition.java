package test.Defenitions.E2E.stepDefenetion;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import test.Defenitions.E2E.testDefenition.CartTestDefinition;
import test.Defenitions.E2E.testDefenition.HomePageTestDefinition;

public class CartStepDefinition {
    private final HomePageTestDefinition homePageTestDefinition = new HomePageTestDefinition();
    private final CartTestDefinition cartTestDefinition = new CartTestDefinition();
    @Then("I verify that numbers of items equals {string} in cart")
    public void iVerifyTheNumberOfItems(String numberOfItems){
        homePageTestDefinition.clickOnCartIcon();
        Assert.assertEquals(numberOfItems,cartTestDefinition.getNumberOfItems());
    }
    @And("I delete all items in cart")
    public void iDeleteAllItemsInCart(){
        cartTestDefinition.deleteAllItems();
    }
}
