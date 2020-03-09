package DSTPSAutomation.HybridDesktopGUI.steps;

import org.openqa.selenium.WebDriver;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_GUI_Utility;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_SharedResource;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.RxNova_Steps;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.RxNova_Utlilty;
import DSTPSAutomation.HybridDesktopGUI.pages.GUI_DeductiblePlan_LandingPageSelector;

public class GUI_DeductiblePlan_LandingPage_Steps {

	RxNova_Steps rxnova_Steps;
	GUI_DeductiblePlan_LandingPageSelector gui_DeductiblePlan_LandingPageSelector;

	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	private HybridDesktop_GUI_Utility guiutils;

	public GUI_DeductiblePlan_LandingPage_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils,
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
		gui_DeductiblePlan_LandingPageSelector = new GUI_DeductiblePlan_LandingPageSelector(SharedResource, utils,
				guiutils);
	}

	public void verifyDeductiblePlanDetails() throws Throwable {
		gui_DeductiblePlan_LandingPageSelector.verifyDeductiblePlan();
		gui_DeductiblePlan_LandingPageSelector.DeductiblePlan_LandingPage_VerifyPlanSearchRadioButton();		
	}
	
	public void clickOnCancelButton() {
		gui_DeductiblePlan_LandingPageSelector.DeductiblePlan_LandingPage_clickOnCancelButton();
	}

}
