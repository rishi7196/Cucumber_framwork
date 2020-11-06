package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="E:\\cucumber\\Framwork\\src\\main\\java\\feature\\taging.feature"
		,glue = {"stepDefination"},//the path of the step definition files
		format = {"pretty","html:test-output"},// to generate the different types of reporting
		monochrome=true,//display the console output in a proper readable format 
		strict =true,// it will check if any step is not define in step definatone file 
		dryRun =false,	//to check the mapping is proper between features file and step def file 
		tags = {"@smoketest"}
		
		)


public class TestRunner {

}
