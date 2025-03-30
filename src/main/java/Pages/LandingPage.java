package Pages;

import org.openqa.selenium.By;

public class LandingPage extends PageObject{
    private static final By homePageButton = By.id("home-button-1");
    private static final By acceptCookiesButton = By.id("onetrust-accept-btn-handler");
    private static final By profileIconButton = By.xpath("//button[@aria-label=\"profile menu button\"]//img");

    public void clickOnHomePageButton(){
        clickOn(homePageButton);
    }
    public void clickOnAcceptCookiesButton(){
        clickOnAndWaitForDisappear(acceptCookiesButton);
    }

    public void clickOnProfileIcon(){
        clickOn(profileIconButton);
    }
}
