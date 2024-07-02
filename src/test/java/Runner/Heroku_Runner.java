package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Heroku/Heroku.feature",glue = "steps")

public class Heroku_Runner extends AbstractTestNGCucumberTests{

	
}
