package test.Defenitions.BE.stepDefention;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import test.Defenitions.BE.testDefenition.BECommonTestDefenition;
public class BECommonStepDefenition {
    BECommonTestDefenition beCommonTestDefenition=new BECommonTestDefenition();

    @Given("I set end point {string}")
    public void setEndPoint(String endPoint){
        beCommonTestDefenition.setUrlAndEndPoint(endPoint);
    }

    @And("I get params for Api call from {string} for {string}")
    public void iGetParamsForAPICall(String fileName, String key){
        beCommonTestDefenition.buildParams(fileName,key);
    }
    @And("I perform {string} request")
    public void iPerformXreqest(String method){
        beCommonTestDefenition.performXrequest(method);
    }
    @Then("I verify that the status code is {string}")
    public void iVerifyThatTheStatusCodeIs(String statusCode){
        Assert.assertEquals(Integer.parseInt(statusCode),beCommonTestDefenition.getStatusCode());
    }

    @And("I verify that number of jokes is {string}")
    public void iVerifySizeOfResponse(String size){
        Assert.assertEquals(beCommonTestDefenition.getSizeOfResponse(),Integer.parseInt(size));
    }
    @And("I verify that the type of joke is {string}")
    public void verifyTypeOfJoke(String jokeType){
        Assert.assertEquals("["+jokeType+"]", beCommonTestDefenition.getJokeType());
    }

}
