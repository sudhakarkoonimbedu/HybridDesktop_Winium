package DSTPSAutomation.HybridDesktopGUI.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_GUI_Utility;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_SharedResource;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.RxNova_Utlilty;

public class GUI_PlanlistBrowse_LandingPageSelector {

	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	private HybridDesktop_GUI_Utility guiutils;

	private By PlanlistBrowse_Window,CustomerOnly_RadioSelect;

	public GUI_PlanlistBrowse_LandingPageSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils,
			HybridDesktop_GUI_Utility guiutils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();
		this.utils = utils;
		this.guiutils = guiutils;
		GUI_PlanlistBrowse_LandingPage_Objects();
	}

	private void GUI_PlanlistBrowse_LandingPage_Objects() {
		PlanlistBrowse_Window = By.xpath("//*[@ClassName='TfrmBrowse']");
		CustomerOnly_RadioSelect = By.xpath("//*[@Name='Customer Only']");
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~Search Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public void verifyPlanlistBrowse() throws Throwable {
		guiutils.gui_VerifyObjectIsDisplayed(PlanlistBrowse_Window);
	}
	
	public void PlanlistBrowse_LandingPage_VerifyCustomerOnlyRadioButton() throws Throwable {
		guiutils.gui_VerifyObjectIsDisplayed(CustomerOnly_RadioSelect);
	}
	
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~Search Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
}
