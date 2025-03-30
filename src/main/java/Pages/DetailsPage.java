package Pages;

import org.openqa.selenium.By;

public class DetailsPage extends PageObject {
    private static final By addToCartButton = By.xpath("//button[@class=\"add-to-cart\"]");
    private static final By successMessage = By.xpath("//div[@class=\"alert-box-container system-alert\"]");
    private static final By closeIconInSuccessMessage = By.xpath("//img[@alt=\"close btn\"]");
    public boolean getAddToCartStatus(){
       return isElementIsClickable(addToCartButton);
    }

    public void clickOnAddToCartButton(){
        clickOn(addToCartButton);
    }

    public String getSuccessMessage(){
        return getText(successMessage);
    }

    public void clickOnCloseIconInSuccessMessage(){
        clickOnAndWaitForDisappear(closeIconInSuccessMessage);
    }

}
