package SwiggyDemo.TestSteps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class TestRunner {
	@CucumberOptions(
			features="feature//Order_Swiggy.feature",
			glue="SwiggyDemo.TestSteps"
			)
			public class testRunner extends AbstractTestNGCucumberTests
			{
			
			}


}
