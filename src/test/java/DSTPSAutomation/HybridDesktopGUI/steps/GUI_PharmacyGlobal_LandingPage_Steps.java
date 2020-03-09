package DSTPSAutomation.HybridDesktopGUI.steps;

import org.openqa.selenium.WebDriver;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_GUI_Utility;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_SharedResource;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.RxNova_Steps;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.RxNova_Utlilty;
import DSTPSAutomation.HybridDesktopGUI.pages.GUI_PharmacyGlobal_LandingPageSelector;

public class GUI_PharmacyGlobal_LandingPage_Steps {

	RxNova_Steps rxnova_Steps;
	GUI_PharmacyGlobal_LandingPageSelector gui_PharmacyGlobal_LandingPageSelector;

	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	private HybridDesktop_GUI_Utility guiutils;

	public GUI_PharmacyGlobal_LandingPage_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils,
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
		gui_PharmacyGlobal_LandingPageSelector = new GUI_PharmacyGlobal_LandingPageSelector(SharedResource, utils,
				guiutils);
	}

	public void verifyPharmacyGlobalDetails() throws Throwable {
		gui_PharmacyGlobal_LandingPageSelector.verifyPharmcyGlobal();
		gui_PharmacyGlobal_LandingPageSelector.PharmacyGlobal_LandingPage_VerifySearchPharmaciesRadioButton();		
	}
	
	public void clickOnCancelButton() {
		gui_PharmacyGlobal_LandingPageSelector.PharmacyGlobal_LandingPage_clickOnCancelButton();
	}

}
