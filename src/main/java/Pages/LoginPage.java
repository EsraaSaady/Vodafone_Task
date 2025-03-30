package Pages;

import org.openqa.selenium.By;

public class LoginPage extends PageObject{
    private static final By userNameTextField = By.id("username");
    private static final By passwordTextField = By.id("password");
    private static final By loginButton = By.id("submitBtn");

    public void enterUserName(String userName){
        sendText(userNameTextField, userName);
    }
    public void enterPassword(String password){
        sendText(passwordTextField,password);
    }
    public void clickOnLoginButton(){
        clickOn(loginButton);
    }
}
