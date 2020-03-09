package DSTPSAutomation.HybridDesktopGUI.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_GUI_Utility;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_SharedResource;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.RxNova_Utlilty;

public class GUI_PointofService_LandingPageSelector {

	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	private HybridDesktop_GUI_Utility guiutils;

	private By PointofServiceMain_Window,PharmacyID_EditBox,Cancel_Button;

	public GUI_PointofService_LandingPageSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils,
			HybridDesktop_GUI_Utility guiutils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();
		this.utils = utils;
		this.guiutils = guiutils;
		GUI_PointofService_LandingPage_Objects();
	}

	private void GUI_PointofService_LandingPage_Objects() {
		PointofServiceMain_Window = By.xpath("//*[@ClassName='PosclaimAppClass']");
		PharmacyID_EditBox = By.xpath("//*[@AutomationId='1000']");
		Cancel_Button = By.xpath("//*[@Name='Cancel']");
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~Search Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public void verifyPointofService() throws Throwable {
		guiutils.gui_VerifyObjectIsDisplayed(PointofServiceMain_Window);
	}
	
	public void PointofService_LandingPage_VerifyPharmacyIDEditBox() throws Throwable {
		guiutils.gui_VerifyObjectIsDisplayed(PharmacyID_EditBox);
	}
	
	public void PointofService_LandingPage_clickOnCancelButton() {
		guiutils.gui_ClickOnButton(Cancel_Button);
	}
	
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~Search Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
}
