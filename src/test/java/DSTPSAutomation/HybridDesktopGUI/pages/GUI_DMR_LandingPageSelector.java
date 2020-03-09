package DSTPSAutomation.HybridDesktopGUI.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_GUI_Utility;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_SharedResource;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.RxNova_Utlilty;

public class GUI_DMR_LandingPageSelector {

	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	private HybridDesktop_GUI_Utility guiutils;

	private By DMRMain_Window,CustomerID_EditBox,Close_Button;

	public GUI_DMR_LandingPageSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils,
			HybridDesktop_GUI_Utility guiutils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();
		this.utils = utils;
		this.guiutils = guiutils;
		GUI_DMR_LandingPage_Objects();
	}

	private void GUI_DMR_LandingPage_Objects() {
		DMRMain_Window = By.xpath("//*[@ClassName='DMRAppClass']");
		CustomerID_EditBox = By.xpath("//*[@AutomationId='2001']");
		Close_Button = By.xpath("//*[@Name='Close']");
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~Search Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public void verifyDMR() throws Throwable {
		guiutils.gui_VerifyObjectIsDisplayed(DMRMain_Window);
	}
	
	public void DMR_LandingPage_VerifyCustomerIDEditBox() throws Throwable {
		guiutils.gui_VerifyObjectIsDisplayed(CustomerID_EditBox);
	}
	
	public void DMR_LandingPage_clickOnCloseButton() {
		guiutils.gui_ClickOnButton(Close_Button);
	}
	
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~Search Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
}
