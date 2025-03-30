package test.Defenitions.E2E.testDefenition;
import Pages.HomePage;


public class HomePageTestDefinition {
    private final HomePage homePage = new HomePage();
    private final DetailsTestDefinition detailsTestDefinition = new DetailsTestDefinition();


    public void clickOnItems(String numberOfItems) {
        int numOfSelectedItems = 0;
        int i = 1;
        while(numOfSelectedItems < Integer.parseInt(numberOfItems)){
            homePage.clickOnItem(i);
            if(detailsTestDefinition.getStatusOfAddToCartButton()){
                detailsTestDefinition.addItemToCart();
                homePage.clickOnVFIcon();
                numOfSelectedItems++;
            }
            i++;
        }
    }

    public void searchWithProductName(String productName){
        homePage.typeProductNameInSearchBar(productName);
        homePage.selectFirstSuggestion();
    }

    public void clickOnCartIcon(){
        homePage.clickOnCartIconButton();
    }

}
