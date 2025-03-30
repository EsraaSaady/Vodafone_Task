package test.Defenitions.E2E.testDefenition;

import Pages.DetailsPage;
import org.junit.Assert;

public class DetailsTestDefinition {
    private final DetailsPage detailsPage = new DetailsPage();

    public void addItemToCart(){
        detailsPage.clickOnAddToCartButton();
        Assert.assertEquals("Item Added To Cart Successfully!",detailsPage.getSuccessMessage());
        detailsPage.clickOnCloseIconInSuccessMessage();
    }

    public boolean getStatusOfAddToCartButton(){
        return detailsPage.getAddToCartStatus();
    }
}
