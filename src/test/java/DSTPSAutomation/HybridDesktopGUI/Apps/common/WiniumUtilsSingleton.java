package DSTPSAutomation.HybridDesktopGUI.Apps.common;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;

public class WiniumUtilsSingleton {

	private WiniumDriver myWiniumDriver = null;
	private WiniumDriverService myservice;
	private DesktopOptions option;
	
	public WiniumUtilsSingleton() {		
	}
	
	
	public WiniumDriver getWiniumDriver() {
		
		Boolean getWiniumDriver = false;
		
		//String winiumDriverPath = System.getProperty("user.dir") + "\\drivers\\Winium.Desktop.Driver.exe";
		//String userApplicationReference = System.getProperty("user.dir") + "\\drivers\\DSTPSActivator.vbs";
		String winiumDriverPath ="c:/Selenium/Winium.Desktop.Driver.exe";
		String userApplicationReference = "c:/Selenium/DSTPSActivator.vbs";
		System.out.println("starting the WiniumUtilsSingleton");
	
		option = new DesktopOptions();
		option.setApplicationPath(userApplicationReference);	
   	    File driverPath = new File(winiumDriverPath);
   	    
   	    int attempt=0;
   	    
   	    while(attempt<5) {
//   	   	    if(myservice!=null) 
//   	         {
//   	   	       try {
//   		    	  if(myservice.isRunning()) 
//   		    	   {
//   		    		 System.out.println("*************WINIUM service is running currently************************");
//   		    		 myservice.stop();
//   		    		 Thread.sleep(5000);
//   		    	    }
//   		          }
//   		       catch(Exception e) {
//   				   System.out.println("WINIUM service is not running currently");
//   				   e.printStackTrace();
//   		          }
//   	          }
   	   	    
   	    	myservice = new WiniumDriverService.Builder().usingDriverExecutable(driverPath).usingPort(9999)
					.withVerbose(true).withSilent(false).buildDesktopService();
			
			try {								
			  myservice.start();
			  getWiniumDriver=true;
			  break;
		     }
	        catch (Exception e) {
			     System.out.println("Exception while starting WINIUM service");
			      e.printStackTrace();			
	          }
			attempt++;			
   	    }
   	    
		if (getWiniumDriver == false && attempt==5) {
			System.out.println("There was an issue while starting WINIUM service");
		} 	    

	    
  	    myWiniumDriver = new WiniumDriver(myservice, option);		 
			 
		return myWiniumDriver;   

   }

}
