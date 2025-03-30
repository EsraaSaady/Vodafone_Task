package test.Defenitions.E2E.stepDefenetion;

import io.cucumber.java.en.And;
import test.Defenitions.E2E.testDefenition.DetailsTestDefinition;
import test.Defenitions.E2E.testDefenition.SearchTestDefinition;

public class SearchStepDefinition {
    private final SearchTestDefinition searchTestDefinition = new SearchTestDefinition();
    private final DetailsTestDefinition detailsTestDefinition = new DetailsTestDefinition();
    @And("I add the product to cart")
    public void iSearchForProductWithName(){
        searchTestDefinition.clickOnItem();
        detailsTestDefinition.addItemToCart();
    }
}
