package cucumberTest;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
/*
 * @CucumberOptions( features = "Features", glue = {"stepDefinitions"}, tags =
 * "@activity1_1", strict = true )
 */

/*
 * @CucumberOptions( features = "Features", glue = {"stepDefinitions"}, tags =
 * "@activity1_2" )
 */

/*
 * @CucumberOptions( features = "Features", glue = {"stepDefinitions"}, tags =
 * "@SmokeTest", strict = true )
 */


/*
 * @CucumberOptions( features = "Features", glue = {"stepDefinitions"}, tags =
 * "@activity1_3", strict = true )
 */
 
/*
 * @CucumberOptions( features = "Features", glue = {"stepDefinitions"}, tags =
 * "@activity2_4", strict = true )
 */

/*
 * @CucumberOptions( features = "Features", glue = {"stepDefinitions"}, tags =
 * "@activity2_5", strict = true )
 */


/*
 * @CucumberOptions( features = "Features", glue = {"stepDefinitions"}, tags =
 * "@SimpleAlert", strict = true, plugin = {"pretty"}, monochrome = true )
 */



/*
 * @CucumberOptions( features = "Features", glue = {"stepDefinitions"}, tags =
 * "@SimpleAlert", strict = true, plugin = {"html: test-reports"}, monochrome =
 * true )
 */

@CucumberOptions( features = "Features", 
glue = {"stepDefinitions"},
tags = "@CRMProjectActivity4",
plugin = { "pretty", "html:target/cucumber-reports/reports" , "json: target/cucumber-reports/json-report.json"},
monochrome = true, publish = true	   
)

public class ActivitiesRunner {}


	
