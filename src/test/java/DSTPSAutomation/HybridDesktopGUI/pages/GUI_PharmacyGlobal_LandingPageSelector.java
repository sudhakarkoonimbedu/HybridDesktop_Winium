package DSTPSAutomation.HybridDesktopGUI.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_GUI_Utility;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_SharedResource;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.RxNova_Utlilty;

public class GUI_PharmacyGlobal_LandingPageSelector {

	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	private HybridDesktop_GUI_Utility guiutils;

	private By PharmacyGlobal_Window,SearchPharmacies_RadioSelect,Cancel_Button;

	public GUI_PharmacyGlobal_LandingPageSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils,
			HybridDesktop_GUI_Utility guiutils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();
		this.utils = utils;
		this.guiutils = guiutils;
		GUI_PharmacyGlobal_LandingPage_Objects();
	}

	private void GUI_PharmacyGlobal_LandingPage_Objects() {
		PharmacyGlobal_Window = By.xpath("//*[@ClassName='PharmGblAppClass']");
		SearchPharmacies_RadioSelect = By.xpath("//*[@AutomationId='1052']");
		Cancel_Button = By.xpath("//*[@Name='Cancel']");
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~Search Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public void verifyPharmcyGlobal() throws Throwable {
		guiutils.gui_VerifyObjectIsDisplayed(PharmacyGlobal_Window);
	}
	
	public void PharmacyGlobal_LandingPage_VerifySearchPharmaciesRadioButton() throws Throwable {
		guiutils.gui_VerifyObjectIsDisplayed(SearchPharmacies_RadioSelect);
	}
	
	public void PharmacyGlobal_LandingPage_clickOnCancelButton() {
		guiutils.gui_ClickOnButton(Cancel_Button);
	}
	
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~Search Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
}
