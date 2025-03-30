package test.Defenitions.BE.testDefenition;

import com.google.gson.Gson;
import io.cucumber.cienvironment.internal.com.eclipsesource.json.JsonArray;
import io.cucumber.cienvironment.internal.com.eclipsesource.json.JsonObject;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import test.Helpers.JSONHelper;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class BECommonTestDefenition {

    private static Properties properties;
    private static Map<String, String> headersMap = new HashMap<String, String>();
    private static RequestSpecification requestSpecification;
    private static Response response;
    private String endPoint;
    private JSONObject jsonBody;
    private JSONObject params;
    private String paramsString;
    private Gson gson = new Gson();
    JSONHelper jsonHelper = new JSONHelper();
    public static void setProperties (Properties properties1){
        properties=properties1;
    }

    public void setUrlAndEndPoint(String endPointPath){
        endPoint = properties.getProperty(endPointPath);
    }

    public void buildParams(String fileName, String key){
        params = jsonHelper.readJson(fileName);
        paramsString = params.get(key).toString();
    }
    public void performXrequest(String method){
        RestAssured.baseURI = endPoint;
        requestSpecification = RestAssured.given().headers(headersMap);
        if(method.equalsIgnoreCase("Post")){
            response = requestSpecification.body(gson.toJson(jsonBody)).post(endPoint);
        }
        else if(method.equalsIgnoreCase("Delete")){
            response = requestSpecification.body(jsonBody).delete(endPoint);
        }
        else if(method.equalsIgnoreCase("GET")){
            response = requestSpecification.when().pathParams("val",paramsString.split("/")[0], "val2",paramsString.split("/")[1]).get(endPoint+"{val}/{val2}");
        }
    }
    public int getStatusCode(){
        return response.getStatusCode();
    }
    public int getSizeOfResponse(){
        return response.body().jsonPath().getList("").size();
    }
    public String getJokeType(){
        return response.body().jsonPath().get("type").toString();
    }
}
