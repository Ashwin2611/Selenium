package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"C:\\Users\\ashwin.murugan\\eclipse-workspace\\sample\\src\\test\\java\\Feature\\login.feature"},
		glue= {"StepDefinition"},
		plugin= {"pretty"},
		monochrome=true
		)
public class TestRunner {

}
