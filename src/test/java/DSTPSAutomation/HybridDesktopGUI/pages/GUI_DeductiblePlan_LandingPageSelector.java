package DSTPSAutomation.HybridDesktopGUI.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_GUI_Utility;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_SharedResource;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.RxNova_Utlilty;

public class GUI_DeductiblePlan_LandingPageSelector {

	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	private HybridDesktop_GUI_Utility guiutils;

	private By DeductiblePlan_Window,PlanSearch_RadioSelect,Cancel_Button;

	public GUI_DeductiblePlan_LandingPageSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils,
			HybridDesktop_GUI_Utility guiutils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();
		this.utils = utils;
		this.guiutils = guiutils;
		GUI_DeductiblePlan_LandingPage_Objects();
	}

	private void GUI_DeductiblePlan_LandingPage_Objects() {
		DeductiblePlan_Window = By.xpath("//*[@ClassName='DedblplnAppClass']");
		PlanSearch_RadioSelect = By.xpath("//*[@AutomationId='1860']");
		Cancel_Button = By.xpath("//*[@Name='Cancel']");
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~Search Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public void verifyDeductiblePlan() throws Throwable {
		guiutils.gui_VerifyObjectIsDisplayed(DeductiblePlan_Window);
	}
	
	public void DeductiblePlan_LandingPage_VerifyPlanSearchRadioButton() throws Throwable {
		guiutils.gui_VerifyObjectIsDisplayed(PlanSearch_RadioSelect);
	}
	
	public void DeductiblePlan_LandingPage_clickOnCancelButton() {
		guiutils.gui_ClickOnButton(Cancel_Button);
	}
	
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~Search Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
}
