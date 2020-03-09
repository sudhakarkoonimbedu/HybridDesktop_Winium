package DSTPSAutomation.HybridDesktopGUI.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_GUI_Utility;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_SharedResource;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.RxNova_Utlilty;

public class GUI_PaymentHistoryInquiry_LandingPageSelector {

	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	private HybridDesktop_GUI_Utility guiutils;

	private By PaymentHistoryInquiry_Window,Search_CustomerID,Cancel_Button;

	public GUI_PaymentHistoryInquiry_LandingPageSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils,
			HybridDesktop_GUI_Utility guiutils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();
		this.utils = utils;
		this.guiutils = guiutils;
		GUI_PaymentHistoryInquiry_LandingPage_Objects();
	}

	private void GUI_PaymentHistoryInquiry_LandingPage_Objects() {
		PaymentHistoryInquiry_Window = By.xpath("//*[@ClassName='PmntHistAppClass']");
		Search_CustomerID = By.xpath("//*[@AutomationId='2003']");
		Cancel_Button = By.xpath("//*[@Name='Cancel']");
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~Search Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public void verifyPaymentHistoryInquiry() throws Throwable {
		guiutils.gui_VerifyObjectIsDisplayed(PaymentHistoryInquiry_Window);
	}
	
	public void PaymentHistoryInquiry_LandingPage_VerifyCustomerID() throws Throwable {
		guiutils.gui_VerifyObjectIsDisplayed(Search_CustomerID);
	}
	
	public void PaymentHistoryInquiry_LandingPage_clickOnCancelButton() {
		guiutils.gui_ClickOnButton(Cancel_Button);
	}
	
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~Search Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
}
