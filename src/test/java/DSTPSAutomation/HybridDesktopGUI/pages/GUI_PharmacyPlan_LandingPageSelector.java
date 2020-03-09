package DSTPSAutomation.HybridDesktopGUI.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_GUI_Utility;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_SharedResource;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.RxNova_Utlilty;

public class GUI_PharmacyPlan_LandingPageSelector {

	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	private HybridDesktop_GUI_Utility guiutils;

	private By PharmacyPlanMaintenance_Window,CustomerID_EditBox,Cancel_Button;

	public GUI_PharmacyPlan_LandingPageSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils,
			HybridDesktop_GUI_Utility guiutils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();
		this.utils = utils;
		this.guiutils = guiutils;
		GUI_PharmacyPlan_LandingPage_Objects();
	}

	private void GUI_PharmacyPlan_LandingPage_Objects() {
		PharmacyPlanMaintenance_Window = By.xpath("//*[@ClassName='PharmPlnAppClass']");
		CustomerID_EditBox = By.xpath("//*[@AutomationId='1006']");
		Cancel_Button = By.xpath("//*[@Name='Cancel']");
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~Search Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public void verifyPharmacyPlan() throws Throwable {
		guiutils.gui_VerifyObjectIsDisplayed(PharmacyPlanMaintenance_Window);
	}
	
	public void PharmacyPlan_LandingPage_VerifyCustomerIDEditBox() throws Throwable {
		guiutils.gui_VerifyObjectIsDisplayed(CustomerID_EditBox);
	}
	
	public void PharmacyPlan_LandingPage_clickOnCancelButton() {
		guiutils.gui_ClickOnButton(Cancel_Button);
	}
	
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~Search Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
}
