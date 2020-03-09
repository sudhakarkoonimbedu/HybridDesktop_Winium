package DSTPSAutomation.HybridDesktopGUI.stepDefinitions;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_GUI_Utility;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_SharedResource;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.LandingPage_Steps;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.LaunchPage_Steps;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.RxNova_Utlilty;
import DSTPSAutomation.HybridDesktopGUI.steps.GUI_PharmacySimulation_LandingPage_Steps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinitionPharmacySimulation_GUI {

	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	private HybridDesktop_GUI_Utility guiutils;
	
	public LaunchPage_Steps launchPage_Steps;
	public LandingPage_Steps landingPage_Steps;
	public GUI_PharmacySimulation_LandingPage_Steps gui_PharmacySimulation_LandingPage_Steps;
	
	public StepDefinitionPharmacySimulation_GUI(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils, HybridDesktop_GUI_Utility guiutils) throws Throwable{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;		
		this.guiutils = guiutils;
		init();		
	}
	
	public void init() throws Throwable
	{
		// Initialize the step classes here
		launchPage_Steps = new LaunchPage_Steps(SharedResource,utils);
		landingPage_Steps= new LandingPage_Steps(SharedResource,utils);
		gui_PharmacySimulation_LandingPage_Steps  = new GUI_PharmacySimulation_LandingPage_Steps(SharedResource, utils,guiutils);
	}
	
//	@Given("^the user access the Hybrid Desktop Application$")
//	public void user_can_access_the_Hybrid_desktop_application(Map<String,String> LoginDetails) throws Throwable{		
//		if(SharedResource.performLaunchAndLoginAgain){
//		launchPage_Steps.PerformLogin(LoginDetails);}
//	}
//	
//	@Given("^User in Landing Page, he selects the application from menu$")
//	public void the_user_selects_the_application_from_menu_options(Map<String,String> MenuDetails) throws Throwable{		
//		//landingPage_Steps.SelectApplication(MenuDetails);
//		guiutils.GUI_UserGoToApplicationBaseState(MenuDetails);
//		guiutils.select_GUI_application(MenuDetails);
//	}	
	
	@Then("^Verify Simulated Pharmacy Rate Retrieval Facility window should be displayed$")
	public void verify_simulated_pharmacy_rate_retrieval_facility_details() throws Throwable{		
		gui_PharmacySimulation_LandingPage_Steps.verifyPharmacySimulationDetails();		
	}
	
	@And("^Click on Cancel button in Simulated Pharmacy Rate Retrieval Facility window$")
	public void click_on_cancel_button() throws Throwable{
		gui_PharmacySimulation_LandingPage_Steps.clickOnCancelButton();
	}	
}
