package Pages;

import org.openqa.selenium.By;

public class HomePage extends PageObject{
    private static final String item = "(//div[@id=\"Deals\"]//vf-product-box)[%s]//div[1]";
    private static final By vfIcon = By.xpath("//img[@id=\"sl-nav-bar-img=1\"]");
    private static final By searchBar = By.id("searchInput");
    private static final By firstOptionInDropDownForSearch = By.id("category-0");
    private static final By cartIconButton = By.id("sl-nav-bar-btn=3");

    public void clickOnItem(int iterator){
        System.out.println(item);
        System.out.println(iterator);
        clickOnByJavaScript(By.xpath(item.replaceAll("%s",Integer.toString(iterator))));
    }
    public void clickOnVFIcon(){
        clickOn(vfIcon);
    }

    public void typeProductNameInSearchBar(String productName){
        sendText(searchBar,productName);
    }
    public void selectFirstSuggestion(){
        clickOn(firstOptionInDropDownForSearch);
    }
    public void clickOnCartIconButton(){
        clickOn(cartIconButton);
    }

}
