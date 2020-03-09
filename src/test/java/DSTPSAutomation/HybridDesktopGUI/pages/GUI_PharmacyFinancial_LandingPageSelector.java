package DSTPSAutomation.HybridDesktopGUI.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_GUI_Utility;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_SharedResource;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.RxNova_Utlilty;

public class GUI_PharmacyFinancial_LandingPageSelector {

	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	private HybridDesktop_GUI_Utility guiutils;

	private By PharmacyFinancialBalanceInquiry_Window,PharmacyID_EditBox,Cancel_Button;

	public GUI_PharmacyFinancial_LandingPageSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils,
			HybridDesktop_GUI_Utility guiutils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();
		this.utils = utils;
		this.guiutils = guiutils;
		GUI_PharmacyFinancial_LandingPage_Objects();
	}

	private void GUI_PharmacyFinancial_LandingPage_Objects() {
		PharmacyFinancialBalanceInquiry_Window = By.xpath("//*[@ClassName='PharmFinAppClass']");
		PharmacyID_EditBox = By.xpath("//*[@AutomationId='1165']");
		Cancel_Button = By.xpath("//*[@Name='Cancel']");
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~Search Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public void verifyPharmacyFinancial() throws Throwable {
		guiutils.gui_VerifyObjectIsDisplayed(PharmacyFinancialBalanceInquiry_Window);
	}
	
	public void PharmacyFinancial_LandingPage_VerifyPharmacyIDEditBox() throws Throwable {
		guiutils.gui_VerifyObjectIsDisplayed(PharmacyID_EditBox);
	}
	
	public void PharmacyFinancial_LandingPage_clickOnCancelButton() {
		guiutils.gui_ClickOnButton(Cancel_Button);
	}
	
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~Search Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
}
