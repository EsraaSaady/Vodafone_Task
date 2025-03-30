package test.Defenitions.E2E.testDefenition;

import Pages.SearchPage;

public class SearchTestDefinition {
    private final SearchPage searchPage = new SearchPage();

    public void clickOnItem(){
        searchPage.clickOnItem();
    }
}
