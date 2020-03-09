package DSTPSAutomation.HybridDesktopGUI.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_GUI_Utility;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_SharedResource;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.RxNova_Utlilty;

public class GUI_PlanlistModuleDefinition_LandingPageSelector {

	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	private HybridDesktop_GUI_Utility guiutils;

	private By PlanlistModuleDefinition_Window,OverrideModule_RadioSelect;

	public GUI_PlanlistModuleDefinition_LandingPageSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils,
			HybridDesktop_GUI_Utility guiutils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();
		this.utils = utils;
		this.guiutils = guiutils;
		GUI_PlanlistModuleDefinition_LandingPage_Objects();
	}

	private void GUI_PlanlistModuleDefinition_LandingPage_Objects() {
		PlanlistModuleDefinition_Window = By.xpath("//*[@ClassName='TfrmModuleDefinitions']");
		OverrideModule_RadioSelect = By.xpath("//*[@Name='Override Module']");
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~Search Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public void verifyPlanlistModuleDefinition() throws Throwable {
		guiutils.gui_VerifyObjectIsDisplayed(PlanlistModuleDefinition_Window);
	}
	
	public void PlanlistModuleDefinition_LandingPage_VerifyOverrideModuleRadioButton() throws Throwable {
		guiutils.gui_VerifyObjectIsDisplayed(OverrideModule_RadioSelect);
	}
	
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~Search Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
}
