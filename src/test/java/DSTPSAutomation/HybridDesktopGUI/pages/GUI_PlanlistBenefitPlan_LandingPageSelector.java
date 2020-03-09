package DSTPSAutomation.HybridDesktopGUI.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_GUI_Utility;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_SharedResource;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.RxNova_Utlilty;

public class GUI_PlanlistBenefitPlan_LandingPageSelector {

	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	private HybridDesktop_GUI_Utility guiutils;

	private By PlanlistBenefitPlan_Window,Search_Button;

	public GUI_PlanlistBenefitPlan_LandingPageSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils,
			HybridDesktop_GUI_Utility guiutils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();
		this.utils = utils;
		this.guiutils = guiutils;
		GUI_PlanlistBenefitPlan_LandingPage_Objects();
	}

	private void GUI_PlanlistBenefitPlan_LandingPage_Objects() {
		PlanlistBenefitPlan_Window = By.xpath("//*[@ClassName='TfrmBenefitPlan']");
		Search_Button = By.xpath("//*[@Name='Search']");
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~Search Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public void verifyPlanlistBenefitPlan() throws Throwable {
		guiutils.gui_VerifyObjectIsDisplayed(PlanlistBenefitPlan_Window);
	}
	
	public void PlanlistBenefitPlan_LandingPage_VerifySearchButton() throws Throwable {
		guiutils.gui_VerifyObjectIsDisplayed(Search_Button);
	}
	
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~Search Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
}
