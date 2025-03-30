package test.Defenitions.E2E.stepDefenetion.Hooks;

import configSetup.ConfigurationsHnadling;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import test.Helpers.Driver;

public class E2EHooks {
    private static final String configPath = "configrations/configE2E.properties";
    @Before("@E2E")
    public static void startDriver(){
        ConfigurationsHnadling.initializeOfConfiguration(configPath);
        if(ConfigurationsHnadling.getProperties().get("browser").toString().equalsIgnoreCase("Chrome")){
            String url = ConfigurationsHnadling.getProperties().get("targetUrl").toString();
            String driverPath = ConfigurationsHnadling.getProperties().get("driverPath").toString();
            Driver.startChromeDriver(url,driverPath);
        }
    }
    @After("@E2E")
    public static void closeDriver(){
        Driver.closeDriver();
    }
}
