package DSTPSAutomation.HybridDesktopGUI.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(CucumberRunner.class)
@CucumberOptions(
		features = {"classpath:features/HybridDesktopGUI/ClaimInquiry_GUI.feature" }, 
			tags = {"@SmokeTest"}, 
			glue= {"classpath:DSTPSAutomation.HybridDesktopGUI.stepDefinitions",					
					"classpath:DSTPSAutomation.HybridDesktopGUI.Apps.common",
					"classpath:DSTPSAutomation.HybridDesktopGUI.pages",
					"classpath:DSTPSAutomation.HybridDesktopGUI.runners",
					"classpath:DSTPSAutomation.HybridDesktopGUI.steps"},
			plugin =  {"pretty","html:target/html", "json:claiminquiry.json", "rerun:src/test/resources/rerun.txt"},
			strict=true
)

public class ClaimInquiryFeature_TestRunner extends AbstractTestNGCucumberTests {
	
}
