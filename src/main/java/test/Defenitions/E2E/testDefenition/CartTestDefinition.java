package test.Defenitions.E2E.testDefenition;

import Pages.CartPage;

public class CartTestDefinition {
    private final CartPage cartPage = new CartPage();

    public String getNumberOfItems(){
        return cartPage.getNumberOfItems();
    }
    public void deleteAllItems(){
        cartPage.clickOnRemoveIcons();
    }
}
