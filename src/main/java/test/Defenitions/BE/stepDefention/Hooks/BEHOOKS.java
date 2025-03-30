package test.Defenitions.BE.stepDefention.Hooks;

import configSetup.ConfigurationsHnadling;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import test.Defenitions.BE.testDefenition.BECommonTestDefenition;
import test.Helpers.ReportSetup;

public class BEHOOKS {
    private static final String configPath = "configrations/configBE.properties";
    @Before("@BE")
    public static void readConfigFile(){
        ConfigurationsHnadling.initializeOfConfiguration(configPath);
        BECommonTestDefenition.setProperties(ConfigurationsHnadling.getProperties());
    }
    //shared between E2E and BE scripts
    @BeforeAll
    public static void setupReports(){
        ReportSetup.setupReport();
    }
    //shared between E2E and BE scripts
    @AfterAll
    public static void generateReport(){
        ReportSetup.generateReport();
    }
}
