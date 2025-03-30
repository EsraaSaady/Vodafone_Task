package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage extends PageObject {
    private static final By numberOfItems = By.xpath("//span[contains(text(),\"Items\")]");
    private static final By removeIcon = By.xpath("//p[contains(text(),\"Remove\")]");

    public String getNumberOfItems(){
        return getText(numberOfItems).split(" ")[1];
    }
    public void clickOnRemoveIcons(){
        List<WebElement> removeIcons = getListOfElemensts(removeIcon);
        for(int i = 0 ; i < removeIcons.size(); i++){
            clickOn(removeIcons.get(i));
        }
    }

}
