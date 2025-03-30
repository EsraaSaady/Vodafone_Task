package test.Defenitions.E2E.testDefenition;

import Pages.LandingPage;
import Pages.LoginPage;

public class LoginTestDefinition {

    private final LoginPage loginPage = new LoginPage();
    private final LandingPage landingPage = new LandingPage();
    public void login(String userName, String password) {
        landingPage.clickOnHomePageButton();
        landingPage.clickOnAcceptCookiesButton();
        landingPage.clickOnProfileIcon();
        loginPage.enterUserName(userName);
        loginPage.enterPassword(password);
        loginPage.clickOnLoginButton();
    }
}
