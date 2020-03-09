package DSTPSAutomation.HybridDesktopGUI.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_GUI_Utility;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_SharedResource;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.RxNova_Utlilty;

public class GUI_Pharmacy_LandingPageSelector {

	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	private HybridDesktop_GUI_Utility guiutils;

	private By Pharmacy_Window,SearchPharmaciesbyNetwork_RadioSelect,Cancel_Button;

	public GUI_Pharmacy_LandingPageSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils,
			HybridDesktop_GUI_Utility guiutils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();
		this.utils = utils;
		this.guiutils = guiutils;
		GUI_Pharmacy_LandingPage_Objects();
	}

	private void GUI_Pharmacy_LandingPage_Objects() {
		Pharmacy_Window = By.xpath("//*[@ClassName='PharmPhmAppClass']");
		SearchPharmaciesbyNetwork_RadioSelect = By.xpath("//*[@Name='Search Pharmacies by Network']");
		Cancel_Button = By.xpath("//*[@Name='Cancel']");
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~Search Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public void verifyPharmacy() throws Throwable {
		guiutils.gui_VerifyObjectIsDisplayed(Pharmacy_Window);
	}
	
	public void Pharmacy_LandingPage_VerifySearchPharmaciesbyNetworkRadioButton() throws Throwable {
		guiutils.gui_VerifyObjectIsDisplayed(SearchPharmaciesbyNetwork_RadioSelect);
	}
	
	public void Pharmacy_LandingPage_clickOnCancelButton() {
		guiutils.gui_ClickOnButton(Cancel_Button);
	}
	
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~Search Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
}
