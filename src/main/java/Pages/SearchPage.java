package Pages;

import org.openqa.selenium.By;

public class SearchPage extends PageObject{
    private static final By item = By.xpath("(//vf-product-box//img)[1]");

    public void clickOnItem(){
        clickOn(item);
    }
}
