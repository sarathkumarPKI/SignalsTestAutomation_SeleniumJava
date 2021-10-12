package test.Regressiontest;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import test.Utility.BaseClass;
import test.pageobjects.Loginpage;
import test.pageobjects.SystemConfigpage;

public class Validatesharingandsigning extends BaseClass {
	ExtentTest logger;
	WebDriverWait wait;
	
	
	Loginpage login=new Loginpage();
	SystemConfigpage sysconfig= new SystemConfigpage();
	
	
	
	//user story number
	/*Test Description:This test aims to validate if the user have access to create a new experiment
	 and Validate if the user have sharing and signing access*/
	
  @Test(enabled = true,dataProvider = "UserData",groups = "smoke")
    public void dashboardDropDownValidation(String username,String password,String Usertype,String template,String description,String notebook,String users,String project,String Department,String internalfield,String Shareproject) throws InterruptedException, MalformedURLException
    {
	 driver=chromeinitialization();
  	logger=extent.startTest(Usertype+"ValidateSharingand Signing"+username);
  	login.geturl(driver);
  	wait= new WebDriverWait(driver, 180);
  	login.loginSignals(driver, logger, username, password, wait, "LoginPositive");	
  	login.newExperiment(driver, wait, logger, Usertype, template, description, notebook, users, project, Department, internalfield,Shareproject);
  	
    logger.log(LogStatus.PASS, "End Case: scenario successfull");
    	
    	//extent.endTest(logger);
    }
    
   
    
    
    @DataProvider
    public String[][] UserData() throws IOException{
  	  String[][] testOBJArray=null;
  	  if(ConfigFileReader("runon").equalsIgnoreCase("local")) {
  		  
  			  if(ConfigFileReader("environment").equalsIgnoreCase("srv18")) {
  		  testOBJArray=getdata(testdatasheetpath,"Experiment creation");
  			  }
  			  //write for other env here
  			  
  		  
  	 }else if(ConfigFileReader("runon").equalsIgnoreCase("jenkin")) {
  		 
  			 if(System.getenv("environment").equalsIgnoreCase("srv18")) {
  				 System.out.println("executing with jenkin variables dataprovider in srv18");
  				 testOBJArray=getdata(testdatasheetpath,"Experiment creation");
  			 }
  			 //write for other env here.
  			  
  			  
  	 }
  	return testOBJArray;
    }
    
    

    @AfterMethod(alwaysRun = true)
	public void closedriver() {
		driver.close();
	}
    
    
    @AfterClass(alwaysRun = true)
    public void aftmeth() {
    	System.out.println("aftermethod");
    	extent.endTest(logger);
    }
    
    @AfterTest
	 public void aftrtst() {
		 
		 
		 extent.flush();
	 }
    
    

}
