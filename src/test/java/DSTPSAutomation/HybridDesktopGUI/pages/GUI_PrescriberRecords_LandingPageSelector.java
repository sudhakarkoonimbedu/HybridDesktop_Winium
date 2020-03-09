package DSTPSAutomation.HybridDesktopGUI.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_GUI_Utility;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_SharedResource;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.RxNova_Utlilty;

public class GUI_PrescriberRecords_LandingPageSelector {

	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	private HybridDesktop_GUI_Utility guiutils;

	private By PrescriberMain_Window,CustomerID_EditBox,Close_Button;

	public GUI_PrescriberRecords_LandingPageSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils,
			HybridDesktop_GUI_Utility guiutils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();
		this.utils = utils;
		this.guiutils = guiutils;
		GUI_PrescriberRecords_LandingPage_Objects();
	}

	private void GUI_PrescriberRecords_LandingPage_Objects() {
		PrescriberMain_Window = By.xpath("//*[@ClassName='PrescribAppClass']");
		CustomerID_EditBox = By.xpath("//*[@AutomationId='2003']");
		Close_Button = By.xpath("//*[@Name='Close']");
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~Search Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public void verifyPrescriberRecords() throws Throwable {
		guiutils.gui_VerifyObjectIsDisplayed(PrescriberMain_Window);
	}
	
	public void PrescriberRecords_LandingPage_VerifyCustomerIDEditBox() throws Throwable {
		guiutils.gui_VerifyObjectIsDisplayed(CustomerID_EditBox);
	}
	
	public void PrescriberRecords_LandingPage_clickOnCloseButton() {
		guiutils.gui_ClickOnButton(Close_Button);
	}
	
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~Search Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
}
