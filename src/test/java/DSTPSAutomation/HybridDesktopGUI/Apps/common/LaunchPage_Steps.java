package DSTPSAutomation.HybridDesktopGUI.Apps.common;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import DSTPSAutomation.HybridDesktopGUI.Apps.common.HybridDesktop_SharedResource;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.LaunchPageSelectors;
import DSTPSAutomation.HybridDesktopGUI.Apps.common.RxNova_Utlilty;
import cucumber.api.Scenario;

public class LaunchPage_Steps {
	
	LaunchPageSelectors launchPage;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public LaunchPage_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		launchPage = new LaunchPageSelectors(SharedResource,utils);
	}
	
		
	public void PerformLogin(Map<String,String> MenuDetails) throws Throwable{	
		
		String strUserID = MenuDetails.get("userid");		
		String strUserPWD = MenuDetails.get("password");
		String strRegion = MenuDetails.get("region");
		
		if(strUserID.trim().contentEquals("")){
			strUserID = System.getProperty("MavenUsername");
		}
		if(strUserPWD.trim().contentEquals("")){
			strUserPWD = System.getProperty("MavenPassword");
		}
		if(strRegion.trim().contentEquals("")){
			strRegion = System.getProperty("MavenRegion");
		}
		
		launchPage.LaunchPage_enterUserName(strUserID);
		launchPage.LaunchPage_enterPassword(strUserPWD);
		launchPage.LaunchPage_SelectRegion(strRegion);
		launchPage.LaunchPage_ClickOnLoginButton();
		Thread.sleep(5000);
		
	}
	
}
