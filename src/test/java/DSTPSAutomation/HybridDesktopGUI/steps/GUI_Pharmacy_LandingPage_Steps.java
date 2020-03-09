package DSTPSAutomation.HybridDesktopGUI.steps;

import org.openqa.selenium.WebDriver;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_GUI_Utility;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_SharedResource;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.RxNova_Steps;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.RxNova_Utlilty;
import DSTPSAutomation.HybridDesktopGUI.pages.GUI_Pharmacy_LandingPageSelector;

public class GUI_Pharmacy_LandingPage_Steps {

	RxNova_Steps rxnova_Steps;
	GUI_Pharmacy_LandingPageSelector gui_Pharmacy_LandingPageSelector;

	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	private HybridDesktop_GUI_Utility guiutils;

	public GUI_Pharmacy_LandingPage_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils,
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
		gui_Pharmacy_LandingPageSelector = new GUI_Pharmacy_LandingPageSelector(SharedResource, utils,
				guiutils);
	}

	public void verifyPharmacyDetails() throws Throwable {
		gui_Pharmacy_LandingPageSelector.verifyPharmacy();
		gui_Pharmacy_LandingPageSelector.Pharmacy_LandingPage_VerifySearchPharmaciesbyNetworkRadioButton();		
	}
	
	public void clickOnCancelButton() {
		gui_Pharmacy_LandingPageSelector.Pharmacy_LandingPage_clickOnCancelButton();
	}

}
