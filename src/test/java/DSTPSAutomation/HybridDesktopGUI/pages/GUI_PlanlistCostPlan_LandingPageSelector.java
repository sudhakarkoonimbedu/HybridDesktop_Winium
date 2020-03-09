package DSTPSAutomation.HybridDesktopGUI.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_GUI_Utility;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_SharedResource;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.RxNova_Utlilty;

public class GUI_PlanlistCostPlan_LandingPageSelector {

	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	private HybridDesktop_GUI_Utility guiutils;

	private By PlanlistCostPlan_Window,Yes_RadioSelect;

	public GUI_PlanlistCostPlan_LandingPageSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils,
			HybridDesktop_GUI_Utility guiutils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();
		this.utils = utils;
		this.guiutils = guiutils;
		GUI_PlanlistCostPlan_LandingPage_Objects();
	}

	private void GUI_PlanlistCostPlan_LandingPage_Objects() {
		PlanlistCostPlan_Window = By.xpath("//*[@ClassName='TfrmCostPlan']");
		Yes_RadioSelect = By.xpath("//*[@Name='Yes']");
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~Search Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public void verifyPlanlistCostPlan() throws Throwable {
		guiutils.gui_VerifyObjectIsDisplayed(PlanlistCostPlan_Window);
	}
	
	public void PlanlistCostPlan_LandingPage_VerifyYesRadioButton() throws Throwable {
		guiutils.gui_VerifyObjectIsDisplayed(Yes_RadioSelect);
	}
	
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~Search Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
}
