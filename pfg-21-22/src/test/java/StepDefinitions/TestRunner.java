package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features=
	"C:\\Users\\Victor\\git_projects\\MC030\\eclipse_workspace\\pfg-21-22\\src\\test\\resources\\Features", glue= {"StepDefinitions"} 	)
public class TestRunner {

}
