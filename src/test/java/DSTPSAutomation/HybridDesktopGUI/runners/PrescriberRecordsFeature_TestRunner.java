package DSTPSAutomation.HybridDesktopGUI.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(CucumberRunner.class)
@CucumberOptions(
		features = {"classpath:features/HybridDesktopGUI/PrescriberRecords_GUI.feature" }, 
			tags = {"@SmokeTest"}, 
			glue= {"classpath:DSTPSAutomation.HybridDesktopGUI.stepDefinitions",					
					"classpath:DSTPSAutomation.HybridDesktopGUI.Apps.common",
					"classpath:DSTPSAutomation.HybridDesktopGUI.pages",
					"classpath:DSTPSAutomation.HybridDesktopGUI.runners",
					"classpath:DSTPSAutomation.HybridDesktopGUI.steps"},
			plugin =  {"pretty","html:target/html", "json:prescriberrecords.json", "rerun:src/test/resources/rerun.txt"},
			strict=true
)

public class PrescriberRecordsFeature_TestRunner extends AbstractTestNGCucumberTests {
	
}
