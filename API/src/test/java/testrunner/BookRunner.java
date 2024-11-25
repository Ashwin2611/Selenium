package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.core.backend.CucumberBackendException;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"C:\\Users\\ashwin.murugan\\eclipse-workspace\\API\\src\\test\\java\\Features\\Books.feature"},
		glue = {"StepDefinition"},
		monochrome = true
		)
public class BookRunner {

}
