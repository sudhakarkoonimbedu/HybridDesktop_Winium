package DSTPSAutomation.HybridDesktopGUI.Apps.common;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.os.WindowsUtils;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.winium.WiniumDriver;
import org.seleniumhq.jetty9.util.StringUtil;
import org.testng.Assert;

import winium.elements.desktop.ComboBox;

public class HybridDesktop_GUI_Utility {
	
	private HybridDesktop_SharedResource SharedResource;
	public WebDriver driver;
	public Log LOGGER;
	public Properties pf = new Properties();
	private RxNova_Utlilty utils;
	private WiniumDriver windriver;
	public String processIDtoKill;

	public HybridDesktop_GUI_Utility(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils)
			throws IOException {
		this.driver = SharedResource.getDriver();
		this.LOGGER = SharedResource.getLogger();
		this.utils = utils;
	}

	public void GUI_UserGoToApplicationBaseState(Map<String, String> Menudetails) throws Throwable {
		System.out.println("Inside the home page");
		String strMenuDetails = Menudetails.get("menu");
		System.out.println("strMenuDetails" + strMenuDetails);
		GUI_GoToApplicationBaseState(strMenuDetails);
		System.out.println("outside the home page");
	}

	public void select_GUI_application(Map<String, String> appdeatils) throws InterruptedException {
		String strAppPath = appdeatils.get("menu");
		String[] arrAppPath = strAppPath.split("->");
		String ApplicationName = arrAppPath[1].toString();

		WiniumUtilsSingleton winium = new WiniumUtilsSingleton();
		windriver = winium.getWiniumDriver();
		
		// windriver = WiniumUtilsSingleton.getWiniumDriver();
		System.out.println("_____________________> ApplicationName" + ApplicationName);
		String WindowName = "";
		if(ApplicationName.equalsIgnoreCase("Point of Service")) {
			  WindowName = "POS Main";
		}else if(ApplicationName.equalsIgnoreCase("DMR")) {
			  WindowName = "DMR Main";
		}else if(ApplicationName.equalsIgnoreCase("AUTH RECORD")) {
			  WindowName = "Authorization Main";
		}else if(ApplicationName.equalsIgnoreCase("POS ERROR")) {
			  WindowName = "Pos Errors Inquiry";
		}else if(ApplicationName.equalsIgnoreCase("CLAIM TEST")) {
			  WindowName = "ClaimTest Main";
		}else if(ApplicationName.equalsIgnoreCase("CLAIM INQUIRY")) {
			  WindowName = "Claim Main";
		}else if(ApplicationName.equalsIgnoreCase("MEMBER RECORD")) {
			  WindowName = "Member Main";
		}else if(ApplicationName.equalsIgnoreCase("GROUP RECORD")){
			  WindowName = "Group Search";
		}else if(ApplicationName.equalsIgnoreCase("CUSTOMER")) {
			  WindowName = "Customer Main";
		}else if(ApplicationName.equalsIgnoreCase("CLIENT")) {
			  WindowName = "Client Main";
		}else if(ApplicationName.equalsIgnoreCase("PRESCRIBER RECORDS")){
			  WindowName = "Prescriber Main";
		}else if(ApplicationName.equalsIgnoreCase("PHARMCY - SIMULATION")){
			  WindowName = "Simulated Pharmacy Rate Retrieval Facility";
		}else if(ApplicationName.equalsIgnoreCase("PHARMCY - PLAN")){
			  WindowName = "Pharmacy Plan Maintenance";
		}else if(ApplicationName.equalsIgnoreCase("PHARMACY - NETWORK")) { 
			  WindowName = "Pharmacy Network Rate Maintenance";
		}else if(ApplicationName.equalsIgnoreCase("PHARMACY - PHARMACY")) {			
			  WindowName = "Pharmacy Network Rate Maintenance";			
		}else if(ApplicationName.equalsIgnoreCase("PHARMACY - FINANCIAL")) {
			  WindowName = "Pharmacy Financial Balance Inquiry";
		}else if(ApplicationName.equalsIgnoreCase("PHARMACY - SEARCH")){
			  WindowName = "Pharmacy Search";
		}else if(ApplicationName.equalsIgnoreCase("PHARMACY - GLOBAL")){
			  WindowName = "Pharmacy Address Maintenance";
		}else if(ApplicationName.equalsIgnoreCase("PHARMACY - CUSTOMER")) {
			  WindowName = "Customer Pharmacy Search";
		}else if(ApplicationName.equalsIgnoreCase("PLANLIST - TABLE MAINTENANCE")) {
			  WindowName = "Table Definition And Maintenance";
		}else if(ApplicationName.equalsIgnoreCase("PLANLIST - MODULE DEFINITION")) {
			  WindowName = "Module Definitions";
		}else if(ApplicationName.equalsIgnoreCase("PLANLIST - BROWSE")) {
			  WindowName = "Browse";
		}else if(ApplicationName.equalsIgnoreCase("DEDUCTIBLE PLAN")) {
			  WindowName = "Deductible Plan Main";
		}else if(ApplicationName.equalsIgnoreCase("PLANLIST - POST PAY")) {
			  WindowName = "Post Pay Report Definition";
		}else if(ApplicationName.equalsIgnoreCase("PLANLIST - COST PLAN")) {
			  WindowName = "Cost Plan";
		}else if(ApplicationName.equalsIgnoreCase("PLANLIST - BENEFIT PLAN")) {
			  WindowName = "Benefit Plan";
		}else if(ApplicationName.equalsIgnoreCase("DEDUCTIBLE")) {
			  WindowName = "Deductible Main";
		}else if(ApplicationName.equalsIgnoreCase("COVERAGE")) {
			  WindowName = "Coverage Main";
		}else if(ApplicationName.equalsIgnoreCase("PAYMENT HISTORY INQUIRY")) {
			  WindowName = "Payment History Search";					  
		}
		
		System.out.println("-------------> Window Name : " + WindowName);
//		switch(ApplicationName.toUpperCase())
//		{
//		case "POINT OF SERVICE":
//			  WindowName = "POS Main";
//			  break;
//		case "DMR":
//			  WindowName = "DMR Main";
//			  break;
//		case "AUTH RECORD":
//			  WindowName = "Authorization Main";
//			  break;
//		case "POS ERROR":
//			  WindowName = "Pos Errors Inquiry";
//			  break;
//		case "CLAIM TEST":
//			  WindowName = "ClaimTest Main";
//			  break;
//		case "CLAIM INQUIRY":
//			  WindowName = "Claim Main";
//			  break;
//		case "MEMBER RECORD":
//			  WindowName = "Member Main";
//			  break;
//		case "GROUP RECORD":
//			  WindowName = "Group Search";
//			  break;
//		case "CUSTOMER":
//			  WindowName = "Customer Main";
//			  break;
//		case "CLIENT":
//			  WindowName = "Client Main";
//			  break;
//		case "PRESCRIBER RECORDS":
//			  WindowName = "Prescriber Main";
//			  break;
//		case "PHARMCY - SIMULATION":
//			  WindowName = "Simulated Pharmacy Rate Retrieval Facility";
//			  break;
//		case "PHARMCY - PLAN":
//			  WindowName = "Pharmacy Plan Maintenance";
//			  break;  
//		case "PHARMACY - NETWORK":
//		case "PHARMACY - PHARMACY":
//			  WindowName = "Pharmacy Network Rate Maintenance";
//			  break;
//		case "PHARMACY - FINANCIAL":
//			  WindowName = "Pharmacy Financial Balance Inquiry";
//			  break;
//		case "PHARMACY - SEARCH":
//			  WindowName = "Pharmacy Search";
//			  break;
//		case "PHARMACY - GLOBAL":
//			  WindowName = "Pharmacy Address Maintenance";
//			  break;
//		case "PHARMACY - CUSTOMER":
//			  WindowName = "Customer Pharmacy Search";
//			  break;			  
//		case "PLANLIST - TABLE MAINTENANCE":
//			  WindowName = "Table Definition And Maintenance";
//			  break;
//		case "PLANLIST - MODULE DEFINITION":
//			  WindowName = "Module Definitions";
//			  break;
//		case "PLANLIST - BROWSE":
//			  WindowName = "Browse";
//			  break;
//		case "DEDUCTIBLE PLAN":
//			  WindowName = "Deductible Plan Main";
//			  break;	
//		case "PLANLIST - POST PAY":
//			  WindowName = "Post Pay Report Definition";
//			  break;	
//		case "PLANLIST - COST PLAN":
//			  WindowName = "Cost Plan";
//			  break;
//		case "PLANLIST - BENEFIT PLAN":
//			  WindowName = "Benefit Plan";
//			  break;
//		case "DEDUCTIBLE":
//			  WindowName = "Deductible Main";
//			  break;
//		case "COVERAGE":
//			  WindowName = "Coverage Main";
//			  break;
//		case "PAYMENT HISTORY INQUIRY":
//			  WindowName = "Payment History Search";
//			  break;			  
//		}
		
		String[] arrHandles = windriver.findElementByXPath("//*[contains(@Name,'" + WindowName + "')]")
				.getAttribute("RuntimeId").replace("]", "").split(" ");
		
	    Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
	    String systemOS = System.getProperty("os.name");
	    System.out.println(systemOS);
	    if(!systemOS.contains("Windows 7"))
	    {
	    	windriver.switchTo().window(arrHandles[1]);
	    }
	    
		String processId = windriver.findElementByXPath("//*[contains(@Name,'" + WindowName + "')]")
				.getAttribute("ProcessId");
		setProcessIDtoKill(processId);
	}

	public void GUI_GoToApplicationBaseState(String strAppPath) throws Throwable {

		boolean applicationAvailabilityFlag = false;
		String[] arrAppPath = strAppPath.split("->");
		String ApplicationName = arrAppPath[1].toString();

		// Ensuring we get unique browsers on screen to avoid Benefits like
		// mutlipel screen
		utils.close_duplicateNamedBrowsers();

		for (String WHandles : driver.getWindowHandles()) {
			driver.switchTo().window(WHandles);
			if (driver.getTitle().contains(ApplicationName)) {
				System.out.println("SwithToWindow -" + driver.getTitle());
				applicationAvailabilityFlag = true;
				driver.switchTo().frame(0); // "contentFrame"
				break;
			}
		}

		if (applicationAvailabilityFlag == false) {
			GUI_HybridDesktop_MenuNavigation(strAppPath);
		}
	}

	public void GUI_HybridDesktop_MenuNavigation(String strAppPath) throws InterruptedException {
		// TODO here we need to find the Hybrid main page
		for (String WHandles : driver.getWindowHandles()) {
			driver.switchTo().window(WHandles);
			if (driver.getTitle().contains("RxNova - ")) {
				System.out.println("SwithToWindow -" + driver.getTitle());
				break;
			}
		}

		String[] arrAppPath = strAppPath.split("->");
		driver.findElement(By.xpath("//span[contains(text(),'" + arrAppPath[0].toString() + "')]")).click();
		Thread.sleep(500);
		// new block to handle hidden links
		try {
			driver.findElement(By.linkText(arrAppPath[1].toString())).click();
		} catch (Exception e) {
			System.out.println(
					"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ exception occured ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			WebElement CurrentWebElement = driver.findElement(By.linkText(arrAppPath[1].toString()));
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("var elem=arguments[0]; setTimeout(function() {elem.click();}, 100)", CurrentWebElement);
		}

	}

	public void gui_SetTextOnEdit(By objElementName, String strValue) throws Throwable {
		Boolean boolSetTextOnEdit = false;
		int attempt = 0;
		while (attempt < 3) {
			try {
				if (windriver.findElements(objElementName).size() != 0 && StringUtil.isNotBlank(strValue)) {
					String strName = windriver.findElement(objElementName).getAttribute("name");
					windriver.findElement(objElementName).clear();
					windriver.findElement(objElementName).sendKeys(strValue);
					boolSetTextOnEdit = true;
					System.out.println("Set text on webelement : " + strName + " Value :" + strValue);
					break;
				}
			} catch (Exception e) {
			}
			attempt++;
		}

		if (boolSetTextOnEdit == false) {
			System.out.println("Webelement with name  : '" + windriver.findElement(objElementName).getAttribute("name")
					+ "' was found");
		}

	}

	public void gui_ClickOnButton(By objElementName) {
		Boolean boolClickOnButton = false;
		if (windriver.findElements(objElementName).size() != 0) {
			String strName = windriver.findElement(objElementName).getAttribute("name");
			try {
				windriver.findElement(objElementName).click();
			} catch (Exception e) {
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("arguments[0].click();", windriver.findElement(objElementName));
			}
			boolClickOnButton = true;
			System.out.println("Clicked on webelement : " + strName);
		}

		if (boolClickOnButton == false) {
			System.out.println("Webelement with name  : '" + driver.findElement(objElementName).getAttribute("name")
					+ "' was found");
		}
	}

	public void close_the_GUI() {
		//WindowsUtils.killPID(getProcessIDtoKill());
		// windriver.close();
		// windriver.quit();
	}

	public String getProcessIDtoKill() {
		return processIDtoKill;
	}

	public void setProcessIDtoKill(String processIDtoKill) {
		this.processIDtoKill = processIDtoKill;
	}

	public void SelectItemFromListBox(By objElementName, String strValue)
			throws InterruptedException, NoSuchElementException {
		Boolean boolSelectItemFromWebList = false;
		WebElement objListBoxItem = null;

		try {
			if (StringUtil.isNotBlank(strValue)) {
				//WiniumDriver windriver = WiniumUtilsSingleton.getWiniumDriver();
				objListBoxItem = windriver.findElement(objElementName);
				List<WebElement> ilist = objListBoxItem.findElements(By.className(""));

				for (int p = 0; p < ilist.size(); p++) {
					// System.out.println(ilist.get(p).getAttribute("Name"));
					if (ilist.get(p).getAttribute("Name").equals(strValue)) {
						ilist.get(p).click();
						System.out.println("just name - " + ilist.get(p).getAttribute("Name"));
						System.out.println("get text - " + ilist.get(p).getAttribute("SelectionContainer"));
						System.out.println("get data - " + ilist.get(p).getAttribute("Text"));

						System.out.println("Selected item in webelement : " + objListBoxItem.getAttribute("Name")
								+ " Value :" + strValue);
						boolSelectItemFromWebList = true;
						break;
					}
				}
			}
		} catch (Exception e1) {
			System.out.println("Error - No value available for selection");
		}

		if (boolSelectItemFromWebList == false) {
			System.out.println("Webelement with name : '" + objListBoxItem.getAttribute("Name") + "' was not found");
		}

	}

	public void SelectItemFromComboBox(By objElementName, String strValue)
			throws InterruptedException, NoSuchElementException {
		Boolean boolSelectItemFromWebList = false;
		WebElement objComboBox = null;

		try {
			if (StringUtil.isNotBlank(strValue)) {
				//WiniumDriver windriver = WiniumUtilsSingleton.getWiniumDriver();
				objComboBox = windriver.findElement(objElementName);

				ComboBox currentCombo = new ComboBox(objComboBox);
				currentCombo.expand();
				windriver.findElement(By.name(strValue)).click();
			}
		} catch (Exception e1) {
			System.out.println("Error - No value available for selection");
		}

		if (boolSelectItemFromWebList == false) {
			System.out.println("Webelement with name : '" + objComboBox.getAttribute("Name") + "' was not found");
		}

	}
	
	public void gui_VerifyObjectIsDisplayed(By objElementName) {
		Assert.assertTrue(windriver.findElement(objElementName).isDisplayed());
	}

}
