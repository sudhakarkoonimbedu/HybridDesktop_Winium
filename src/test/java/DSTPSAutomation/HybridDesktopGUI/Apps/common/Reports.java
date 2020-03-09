package DSTPSAutomation.HybridDesktopGUI.Apps.common;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;

public class Reports{

	public static List<String> jsonFiles;
	
	public void Report(){
	System.out.println("........*****************Running after Suite from Steps file........*****************");
	File reportOutputDirectory = new File("target");	
	//List<String> jsonFiles = new ArrayList<String>();
	jsonFiles = new ArrayList<String>();
	
	
/*	if(RxNova_Auth.IsExecuted){jsonFiles.add("cucumber.json");}		
	if(RxNova_Accumulator.IsExecuted){jsonFiles.add("cucumber-a.json");}
	if(RxNova_AssignOptions.IsExecuted){jsonFiles.add("cucumber-b.json");}
	if(RxNova_Benefits.IsExecuted){jsonFiles.add("cucumber-c.json");}
	if(RxNova_Claim.IsExecuted){jsonFiles.add("cucumber-d.json");}
	if(RxNova_Conditions.IsExecuted){jsonFiles.add("cucumber-e.json");}		
	if(RxNova_CoverageCode.IsExecuted){jsonFiles.add("cucumber-f.json");}
	if(RxNova_Customer.IsExecuted){jsonFiles.add("cucumber-g.json");}
	if(RxNova_CustomerSet.IsExecuted){jsonFiles.add("cucumber-h.json");}
	if(RxNova_DataDictionary.IsExecuted){jsonFiles.add("cucumber-i.json");}
	if(RxNova_DrugFileChangeReports.IsExecuted){jsonFiles.add("cucumber-j.json");}
	if(RxNova_DrugList.IsExecuted){jsonFiles.add("cucumber-k.json");}
	if(RxNova_Drug.IsExecuted){jsonFiles.add("cucumber-l.json");}
	if(RxNova_DURProtocol.IsExecuted){jsonFiles.add("cucumber-m.json");}
	if(RxNova_DURSafety.IsExecuted){jsonFiles.add("cucumber-n.json");}
	if(RxNova_Group.IsExecuted){jsonFiles.add("cucumber-o.json");}
	if(RxNova_MaintenanceHistory.IsExecuted){jsonFiles.add("cucumber-p.json");}
	if(RxNova_Member.IsExecuted){jsonFiles.add("cucumber-q.json");}
	if(RxNova_Messages.IsExecuted){jsonFiles.add("cucumber-r.json");}
	if(RxNova_PharmacyList.IsExecuted){jsonFiles.add("cucumber-s.json");}
	if(RxNova_PrescriberList.IsExecuted){jsonFiles.add("cucumber-t.json");}
	if(RxNova_Prescriber.IsExecuted){jsonFiles.add("cucumber-u.json");}
	if(RxNova_Financial.IsExecuted){jsonFiles.add("cucumber-v.json");}
	if(RxNova_NetworkMaintenance.IsExecuted){jsonFiles.add("cucumber-w.json");}
	if(RxNova_PharmacyManintenance.IsExecuted){jsonFiles.add("cucumber-x.json");}
	if(RxNova_PharmacyServiceFees.IsExecuted){jsonFiles.add("cucumber-y.json");}
	if(RxNova_Pricing.IsExecuted){jsonFiles.add("cucumber-z.json");}
	if(RxNova_Tags.IsExecuted){jsonFiles.add("cucumber-aa.json");}
	if(RxNova_Intel.IsExecuted){jsonFiles.add("cucumber-ab.json");}
	*/
//if(RxNova_Claim.IsExecuted){jsonFiles.add("cucumber-a.json");}
	
	
	/*jsonFiles.add("cucumber-b.json");
	jsonFiles.add("cucumber-c.json");
	jsonFiles.add("cucumber-d.json");
	jsonFiles.add("cucumber-e.json");		
	jsonFiles.add("cucumber-f.json");
	jsonFiles.add("cucumber-g.json");
	jsonFiles.add("cucumber-h.json");
	jsonFiles.add("cucumber-i.json");
	jsonFiles.add("cucumber-j.json");
	jsonFiles.add("cucumber-k.json");
	jsonFiles.add("cucumber-l.json");
	jsonFiles.add("cucumber-m.json");
	jsonFiles.add("cucumber-n.json");
	jsonFiles.add("cucumber-o.json");
	jsonFiles.add("cucumber-p.json");
	jsonFiles.add("cucumber-q.json");
	jsonFiles.add("cucumber-r.json");
	jsonFiles.add("cucumber-s.json");
	jsonFiles.add("cucumber-t.json");
	jsonFiles.add("cucumber-u.json");
	jsonFiles.add("cucumber-v.json");
	jsonFiles.add("cucumber-w.json");
	jsonFiles.add("cucumber-x.json");
	jsonFiles.add("cucumber-y.json");
	jsonFiles.add("cucumber-z.json");
	jsonFiles.add("cucumber-aa.json");
	if(RxNova_Steps.isProduction)
	{
		jsonFiles.add("cucumber-ab.json");
	}*/
	
	
	String buildNumber = "1";
	String projectName = "HybridDesktop_Automation";
	boolean runWithJenkins = false;
	boolean parallelTesting = true;
	
	Configuration configuration = new Configuration(reportOutputDirectory, projectName);
	configuration.setParallelTesting(parallelTesting);
	configuration.setRunWithJenkins(runWithJenkins);
	configuration.setBuildNumber(buildNumber);
	configuration.addClassifications("Platform", "Windows");
	configuration.addClassifications("Browser", "Chrome");
	configuration.addClassifications("Branch", "release/1.0");
	
	// called shared resource
	//RxNova_SharedResource sr = new RxNova_SharedResource();
	
	//ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
	//ReportBuilder reportBuilder = new ReportBuilder(RxNova_SharedResource.jsonFiles, configuration);
	ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
	Reportable result = reportBuilder.generateReports();
	

	}
}