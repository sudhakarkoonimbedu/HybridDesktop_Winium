package DSTPSAutomation.HybridDesktopGUI.steps;

import org.openqa.selenium.WebDriver;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_GUI_Utility;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_SharedResource;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.RxNova_Steps;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.RxNova_Utlilty;
import DSTPSAutomation.HybridDesktopGUI.pages.GUI_PharmacyPlan_LandingPageSelector;

public class GUI_PharmacyPlan_LandingPage_Steps {

	RxNova_Steps rxnova_Steps;
	GUI_PharmacyPlan_LandingPageSelector gui_PharmacyPlan_LandingPageSelector;

	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	private HybridDesktop_GUI_Utility guiutils;

	public GUI_PharmacyPlan_LandingPage_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils,
			HybridDesktop_GUI_Utility guiutils) throws Throwable {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();
		this.utils = utils;
		this.guiutils = guiutils;
		init();
	}

	public void init() throws Throwable {
		// Initialize all the pages you are handling
		rxnova_Steps = new RxNova_Steps(SharedResource, utils);
		gui_PharmacyPlan_LandingPageSelector = new GUI_PharmacyPlan_LandingPageSelector(SharedResource, utils,
				guiutils);
	}

	public void verifyPharmacyPlanDetails() throws Throwable {
		gui_PharmacyPlan_LandingPageSelector.verifyPharmacyPlan();
		gui_PharmacyPlan_LandingPageSelector.PharmacyPlan_LandingPage_VerifyCustomerIDEditBox();		
	}
	
	public void clickOnCancelButton() {
		gui_PharmacyPlan_LandingPageSelector.PharmacyPlan_LandingPage_clickOnCancelButton();	 
	}

}
