package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.Helpers.Driver;

import java.time.Duration;
import java.util.List;

public class PageObject {

    public PageObject(){
        driver = Driver.getDriver();
        wait = new WebDriverWait(driver,MAXIMUM);
    }
    private static WebDriver driver;
    private static final Duration MAXIMUM = Duration.ofSeconds(60) ;
    public  WebDriverWait wait;

    public WebElement clickOn(By element){
        WebElement webElement = wait.until(ExpectedConditions.elementToBeClickable(element));
        webElement.click();
        return webElement;
    }
    public WebElement clickOnAndWaitForDisappear(By element){
        WebElement webElement = wait.until(ExpectedConditions.elementToBeClickable(element));
        webElement.click();
        wait.until(ExpectedConditions.invisibilityOf(webElement));
        return webElement;
    }
    public WebElement sendText(By element , String text){
        WebElement webElement = wait.until(ExpectedConditions.presenceOfElementLocated(element));
        webElement.clear();
        webElement.sendKeys(text);
        return webElement;
    }
    public String getText(By element){
        WebElement webElement = wait.until(ExpectedConditions.presenceOfElementLocated(element));
        return webElement.getText();
    }
    public boolean isElementIsClickable(By element){
        WebElement webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        return webElement.isEnabled();
    }
    public void clickOnByJavaScript(By element){
        WebElement webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", webElement);
    }
    public List<WebElement> getListOfElemensts(By element){
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(element));
    }
    public void clickOn(WebElement webElement){
        wait.until(ExpectedConditions.visibilityOf(webElement)).click();
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }

}
