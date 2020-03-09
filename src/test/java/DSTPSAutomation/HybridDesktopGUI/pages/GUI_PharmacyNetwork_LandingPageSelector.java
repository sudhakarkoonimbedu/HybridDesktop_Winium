package DSTPSAutomation.HybridDesktopGUI.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_GUI_Utility;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_SharedResource;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.RxNova_Utlilty;

public class GUI_PharmacyNetwork_LandingPageSelector {

	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	private HybridDesktop_GUI_Utility guiutils;

	private By PharmacyNetwork_Window,Search_RadioSelect,Cancel_Button;

	public GUI_PharmacyNetwork_LandingPageSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils,
			HybridDesktop_GUI_Utility guiutils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();
		this.utils = utils;
		this.guiutils = guiutils;
		GUI_PharmacyNetwork_LandingPage_Objects();
	}

	private void GUI_PharmacyNetwork_LandingPage_Objects() {
		PharmacyNetwork_Window = By.xpath("//*[@ClassName='PharmNetAppClass']");
		Search_RadioSelect = By.xpath("//*[@AutomationId='1001']");
		Cancel_Button = By.xpath("//*[@Name='Cancel']");
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~Search Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public void verifyPharmcyNetwork() throws Throwable {
		guiutils.gui_VerifyObjectIsDisplayed(PharmacyNetwork_Window);
	}
	
	public void PharmacyNetwork_LandingPage_VerifySearchRadioButton() throws Throwable {
		guiutils.gui_VerifyObjectIsDisplayed(Search_RadioSelect);
	}
	
	public void PharmacyNetwork_LandingPage_clickOnCancelButton() {
		guiutils.gui_ClickOnButton(Cancel_Button);
	}
	
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~Search Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
}
