package DSTPSAutomation.HybridDesktopGUI.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_GUI_Utility;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_SharedResource;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.RxNova_Utlilty;

public class GUI_AuthRecord_LandingPageSelector {

	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	private HybridDesktop_GUI_Utility guiutils;

	private By AuthorizationMain_Window,MemberID_EditBox,Cancel_Button;

	public GUI_AuthRecord_LandingPageSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils,
			HybridDesktop_GUI_Utility guiutils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();
		this.utils = utils;
		this.guiutils = guiutils;
		GUI_AuthRecord_LandingPage_Objects();
	}

	private void GUI_AuthRecord_LandingPage_Objects() {
		AuthorizationMain_Window = By.xpath("//*[@ClassName='PreauthAppClass']");
		MemberID_EditBox = By.xpath("//*[@AutomationId='2009']");
		Cancel_Button = By.xpath("//*[@Name='Cancel']");
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~Search Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public void verifyAuthRecord() throws Throwable {
		guiutils.gui_VerifyObjectIsDisplayed(AuthorizationMain_Window);
	}
	
	public void AuthRecord_LandingPage_VerifyMemberIDEditBox() throws Throwable {
		guiutils.gui_VerifyObjectIsDisplayed(MemberID_EditBox);
	}
	
	public void AuthRecord_LandingPage_clickOnCancelButton() {
		guiutils.gui_ClickOnButton(Cancel_Button);
	}
	
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~Search Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
}
