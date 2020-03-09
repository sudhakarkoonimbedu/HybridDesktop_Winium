package DSTPSAutomation.HybridDesktopGUI.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_GUI_Utility;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_SharedResource;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.RxNova_Utlilty;

public class GUI_POSError_LandingPageSelector {

	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	private HybridDesktop_GUI_Utility guiutils;

	private By PosErrorsInquiry_Window,Pharmacy_EditBox,Cancel_Button;

	public GUI_POSError_LandingPageSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils,
			HybridDesktop_GUI_Utility guiutils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();
		this.utils = utils;
		this.guiutils = guiutils;
		GUI_POSError_LandingPage_Objects();
	}

	private void GUI_POSError_LandingPage_Objects() {
		PosErrorsInquiry_Window = By.xpath("//*[@ClassName='PoserrorAppClass']");
		Pharmacy_EditBox = By.xpath("//*[@AutomationId='1007']");
		Cancel_Button = By.xpath("//*[@Name='Cancel']");
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~Search Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public void verifyPOSError() throws Throwable {
		guiutils.gui_VerifyObjectIsDisplayed(PosErrorsInquiry_Window);
	}
	
	public void POSError_LandingPage_VerifyPharmacyEditBox() throws Throwable {
		guiutils.gui_VerifyObjectIsDisplayed(Pharmacy_EditBox);
	}
	
	public void POSError_LandingPage_clickOnCancelButton() {
		guiutils.gui_ClickOnButton(Cancel_Button);
	}
	
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~Search Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
}
