package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/java/featurefiles"},
        glue= {"Steps"},
        monochrome=true,
		tags="",
		plugin={"pretty","html:target/cucumber-reports/cucumber.html","json:target/cucumber-reports/cucumber.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)
		

public class MainRunner {
	
	
	public static void test() {
	
	}

}
