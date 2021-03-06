package DSTPSAutomation.HybridDesktopGUI.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_GUI_Utility;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_SharedResource;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.RxNova_Utlilty;

public class GUI_PharmacyCustomer_LandingPageSelector {

	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	private HybridDesktop_GUI_Utility guiutils;

	private By PharmacyCustomer_Window,Search_RadioSelect,Cancel_Button;

	public GUI_PharmacyCustomer_LandingPageSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils,
			HybridDesktop_GUI_Utility guiutils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();
		this.utils = utils;
		this.guiutils = guiutils;
		GUI_PharmacyCustomer_LandingPage_Objects();
	}

	private void GUI_PharmacyCustomer_LandingPage_Objects() {
		PharmacyCustomer_Window = By.xpath("//*[@ClassName='PharmCstAppClass']");
		Search_RadioSelect = By.xpath("//*[@AutomationId='1000']");
		Cancel_Button = By.xpath("//*[@Name='Cancel']");
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~Search Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public void verifyPharmacyCustomer() throws Throwable {
		guiutils.gui_VerifyObjectIsDisplayed(PharmacyCustomer_Window);
	}
	
	public void PharmacyCustomer_LandingPage_VerifySearchRadioButton() throws Throwable {
		guiutils.gui_VerifyObjectIsDisplayed(Search_RadioSelect);
	}
	
	public void PharmacyCustomer_LandingPage_clickOnCancelButton() {
		guiutils.gui_ClickOnButton(Cancel_Button);
	}
	
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~Search Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
}
