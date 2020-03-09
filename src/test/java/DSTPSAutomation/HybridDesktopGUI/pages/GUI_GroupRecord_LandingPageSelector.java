package DSTPSAutomation.HybridDesktopGUI.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_GUI_Utility;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_SharedResource;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.RxNova_Utlilty;

public class GUI_GroupRecord_LandingPageSelector {

	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	private HybridDesktop_GUI_Utility guiutils;

	private By GroupSearch_Window,CustomerID_EditBox,Cancel_Button;

	public GUI_GroupRecord_LandingPageSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils,
			HybridDesktop_GUI_Utility guiutils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();
		this.utils = utils;
		this.guiutils = guiutils;
		GUI_GroupRecord_LandingPage_Objects();
	}

	private void GUI_GroupRecord_LandingPage_Objects() {
		GroupSearch_Window = By.xpath("//*[@ClassName='GroupAppClass']");
		CustomerID_EditBox = By.xpath("//*[@AutomationId='1006']");
		Cancel_Button = By.xpath("//*[@Name='Cancel']");
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~Search Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public void verifyGroupRecord() throws Throwable {
		guiutils.gui_VerifyObjectIsDisplayed(GroupSearch_Window);
	}
	
	public void GroupRecord_LandingPage_VerifyCustomerIDEditBox() throws Throwable {
		guiutils.gui_VerifyObjectIsDisplayed(CustomerID_EditBox);
	}
	
	public void GroupRecord_LandingPage_clickOnCancelButton() {
		guiutils.gui_ClickOnButton(Cancel_Button);
	}
	
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~Search Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
}
