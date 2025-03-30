package test.Defenitions.E2E.stepDefenetion;

import io.cucumber.java.en.And;
import test.Defenitions.E2E.testDefenition.HomePageTestDefinition;
import test.Defenitions.E2E.testDefenition.SearchTestDefinition;

public class HomePageStepDefinition {
    private final HomePageTestDefinition homePageTestDefinition = new HomePageTestDefinition();
    @And("I add {string} to cart from home page")
    public void iAddToCartFromHomePage(String numberOfItems){
        homePageTestDefinition.clickOnItems(numberOfItems);
    }
    @And("I search for product with name {string}")
    public void iSearchForProductWithName(String productName){
        homePageTestDefinition.searchWithProductName(productName);
    }
}
