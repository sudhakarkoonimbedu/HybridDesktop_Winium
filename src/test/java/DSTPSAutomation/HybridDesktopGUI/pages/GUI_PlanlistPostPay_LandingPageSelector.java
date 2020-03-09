package DSTPSAutomation.HybridDesktopGUI.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_GUI_Utility;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_SharedResource;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.RxNova_Utlilty;

public class GUI_PlanlistPostPay_LandingPageSelector {

	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	private HybridDesktop_GUI_Utility guiutils;

	private By PlanlistPostPay_Window,Search_Button;

	public GUI_PlanlistPostPay_LandingPageSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils,
			HybridDesktop_GUI_Utility guiutils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();
		this.utils = utils;
		this.guiutils = guiutils;
		GUI_PlanlistPostPay_LandingPage_Objects();
	}

	private void GUI_PlanlistPostPay_LandingPage_Objects() {
		PlanlistPostPay_Window = By.xpath("//*[@ClassName='TfrmPostPayReportDef']");
		Search_Button = By.xpath("//*[@Name='Search']");
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~Search Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public void verifyPlanlistPostPay() throws Throwable {
		guiutils.gui_VerifyObjectIsDisplayed(PlanlistPostPay_Window);
	}
	
	public void PlanlistPostPay_LandingPage_VerifySearchButton() throws Throwable {
		guiutils.gui_VerifyObjectIsDisplayed(Search_Button);
	}
	
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~Search Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
}
