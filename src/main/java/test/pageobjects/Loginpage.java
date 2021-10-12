package test.pageobjects;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import test.Utility.BaseClass;

public class Loginpage  extends BaseClass{
	SystemConfigpage sysconfig=new SystemConfigpage();
	//Authenticationpage 
	By username=By.xpath("//input[@name='username']");
	By password= By.xpath("//input[@name='password']");
	By signinButton= By.xpath("//span[text()='Sign In']");
	By namedisplay=By.xpath("//div[@class='h5 brown-neutral margin-none']");
	By signout =By.xpath("//a[@id='logout'][text()='Sign Out']");
	By failedloginpage=By.xpath("//span[text()='Invalid user name or password']");
	By systemconfigbutton=By.xpath("//a[text()='System Configuration']");
	
	//Dashborad icons
	By Notebooksicon=By.xpath("//a[@id='notebooks']/i");
	By Experimentsicon=By.xpath("//a[@id='experiments']/i");
	By Parallelexperimentsicon=By.xpath("//a[@id='parallelExperiments']/i");
	By Requestsicon=By.xpath("//a[@id='requests']/i");
	By Tasksicon=By.xpath("//a[@id='tasks']/i");
	By ChemicalReactionsicon=By.xpath("//a[@id='chemdraw']/i");
	By Chemicalsicon=By.xpath("//a[@id='chemicals']/i");
	By Favoritesicon=By.xpath("//a[@id='favorites']/i");
	By Customobjectsicon=By.xpath("//a[@id='ados']/i");
	By Materialsicon=By.xpath("//a[@id='materials']/i");
	By Usergroupicon=By.xpath("//a[@id='groups']/i");
	By Dashboardicon=By.xpath("//a[@id='dashboard']/i");
	By Searchicon=By.xpath("//a[@id='search']/i");
	By Addnewicon=By.xpath("//span[text()='Add New']");
	By Addcontenticon=By.xpath("//span[text()='Add Content']");
	
	By AdmindefinedtemplateDialogbox=By.xpath("//input[@id='select-table-template']");
	By createButton=By.xpath("//button[text()='Create']");
	//button[text()='Create']
	
	
	//username dropdown lists in home page.
	By userSetting=By.xpath("//a[@class='dropdown-item'][text()='User Settings']");
	By templates=By.xpath("//a[@class='dropdown-item'][text()='Templates']");
	By trashedItems=By.xpath("//a[@class='dropdown-item'][text()='Trashed Items']");
	By quickStartGuide=By.xpath("//a[@class='dropdown-item'][text()='Quick Start Guide']");
	By userGuide=By.xpath("//a[@class='dropdown-item'][text()='User Guide']");
	By faQs=By.xpath("//a[@class='dropdown-item'][text()='FAQs']");
	By chemdrwawuserguide=By.xpath("//a[@class='dropdown-item'][text()='ChemDraw User Guide']");
	By trainingVideos=By.xpath("//a[@class='dropdown-item'][text()='Training Videos']");
	By termsandcondition=By.xpath("//a[@class='dropdown-item'][text()='Terms & Conditions']");
	By serviceleveladd=By.xpath("//a[@class='dropdown-item'][text()='Service Level Addendum']");
	By globalSecurityadd=By.xpath("//a[@class='dropdown-item'][text()='Global Security Addendum']");
	By acceptableusePolicy=By.xpath("//a[@class='dropdown-item'][text()='Acceptable Use Policy']");	
	By whatsnew=By.xpath("//a[@class='dropdown-item'][text()=\"What's New\"]");	
	By contactsupport=By.xpath("//a[@class='dropdown-item'][text()='Contact Support']");	
	By systemAlert=By.xpath("//a[@class='dropdown-item'][text()='System Alerts']");
	By materialbulkImport=By.xpath("//a[@class='dropdown-item'][text()='Material Bulk Import Results']");
	By inventory=By.xpath("//a[@class='dropdown-item'][text()='Inventory']");
	By systemconfig=By.xpath("//a[@class='dropdown-item'][text()='System Configuration']");
	
	
	//new user deletion xpath
	By trashicon=By.xpath("//i[@class='icon icon-trash icon-lg']");
	By checkboxdelete=By.xpath("//input[@type='checkbox']");
	By deleteuserbutton=By.xpath("//button[@id='DeleteUserButton']/span[contains(text(),'Delete User & Don')]");
	By filterinputbox=By.xpath("//input[@placeholder='Filter'][@type='text']");
	By filteremaildisplayed=By.xpath("//div[@class='user-info-text']/div[2]");
	By statusofuser=By.xpath("//div[@class='user-admin-column ']/div");
	
	
	//create new experiment
	By addnewbutton=By.xpath("//span[text()='Add New']");
	By newExperimentbutton=By.xpath("//a[@id='new-experiment']");
	By newAdminDefinedbutton=By.xpath("//a[text()='Admin defined']");
	By templateClosebutton=By.xpath("//button[@class='close rbt-close']/span[1]");
	By templateinput=By.xpath("//label[text()='Template']/..//input");
	By descriptioninput=By.xpath("//input[@id='description-input']");
	By notebookinput=By.xpath("//input[@id='notebook-auto']");
	By usersinput=By.xpath("//label[contains(text(),'Users')]/..//input[1]");
	By projectinput=By.xpath("//label[contains(text(),'Project')]/..//input[1]");
	By departmentInput=By.xpath("//label[contains(text(),'Department')]/..//input[1]");
	By internalfieldInput=By.xpath("//label[contains(text(),'InternalField')]/..//input[1]");
	By cancelbutton=By.xpath("//button[@id='cancel-btn']");
	By createbutton=By.xpath("//button[@id='create-btn']");
	By dropdownselection=By.xpath("//a[@class='dropdown-item']/span[1]");
	By createdexperimentnamefetch=By.xpath("//div[@class='inline-input toolbar__name blue']/span/span");
	By sharingbutton=By.xpath("//button[text()='Sharing']");
	By signingbutton=By.xpath("//button[text()='Signing']");
	
	
	By experimentcreatepageName=By.xpath("//label[text()='Name']");
	
	//Loginpage loginpage=new Loginpage();
	
	//login scenario valid and invalid pass String method as LoginPositive or LoginNegative
	public void loginSignals(WebDriver driver,ExtentTest logger,String usernamesignals,String passwordsignals,WebDriverWait wait,String method) throws InterruptedException {
		driver.manage().window().maximize();
		wait.until(ExpectedConditions.presenceOfElementLocated(username)).sendKeys(usernamesignals);
		logger.log(LogStatus.PASS, "loginname "+usernamesignals+" entered successfully");
		wait.until(ExpectedConditions.presenceOfElementLocated(password)).sendKeys(passwordsignals);
		logger.log(LogStatus.PASS, "password for "+usernamesignals+" entered successfully");
		wait.until(ExpectedConditions.presenceOfElementLocated(signinButton)).click();
		logger.log(LogStatus.PASS, "siginbutton clicked successfully successfully");
		
		
		if(method.equalsIgnoreCase("LoginPositive")) {
			try {
			
			wait.until(ExpectedConditions.presenceOfElementLocated(Requestsicon));
			wait.until(ExpectedConditions.presenceOfElementLocated(namedisplay));
			String screenshotpath=BaseClass.addScreenshot(driver);
			logger.log(LogStatus.INFO, logger.addScreenCapture(screenshotpath));
			}catch(Exception e) {
				
				wait.until(ExpectedConditions.presenceOfElementLocated(namedisplay));
				String screenshotpath=BaseClass.addScreenshot(driver);
				logger.log(LogStatus.INFO, logger.addScreenCapture(screenshotpath));
			}
			logger.log(LogStatus.PASS, "Loginpage is loaded successfully for user "+usernamesignals);
			//wait.until(ExpectedConditions.presenceOfElementLocated(signout)).click();
			//logger.log(LogStatus.PASS, "Loggedout ");
		}else if(method.equalsIgnoreCase("LoginNegative")) {
			Boolean isPresent = driver.findElements(failedloginpage).size()>0;
			if(isPresent) {
				logger.log(LogStatus.PASS, "unauthorized user not logged in");
			}else {
				logger.log(LogStatus.FAIL, "unauthorized user allowed to log in");
			}
			
		}
		
	}
	
	
	
	//verify if system config drop down is present.
	public void verifySystemConfigDropdown(WebDriver driver,ExtentTest logger,String usertype,WebDriverWait wait) throws InterruptedException {
		try {
			driver.findElement(By.xpath("//button[text()='Dismiss']")).click();
		}catch(Exception e) {
			
		}
		
		wait.until(ExpectedConditions.presenceOfElementLocated(namedisplay)).click();;
		
		if(usertype.equalsIgnoreCase("Systemadmin")) {
			Boolean isPresent = driver.findElements(systemconfigbutton).size()>0;
			if(isPresent) {
				logger.log(LogStatus.PASS, "System admin user is having System config button as expected:");
				
				Thread.sleep(3000);
			}else {
				logger.log(LogStatus.FAIL, "System admin user is not having System config button not as expected:");
			}
			
		}else if(usertype.equalsIgnoreCase("Standard")) {
			Boolean isPresent = driver.findElements(systemconfigbutton).size()>0;
			if(isPresent) {
				logger.log(LogStatus.FAIL, "Standard  user is having System config buttonwhich is not as expected:");
			}else {
				logger.log(LogStatus.PASS, "Standard user is not having System config button as expected:");
			}
		}
	}
	
	
	//click on system config button which is availble for sysytem admin under the user name dropdown
	public void clickonSystemconfig(WebDriver driver,ExtentTest logger,String usertype,WebDriverWait wait) {
		String screenshotpath=BaseClass.addScreenshot(driver);
		wait.until(ExpectedConditions.presenceOfElementLocated(systemconfigbutton)).click();
		logger.log(LogStatus.PASS, "user clicked on system config button");
		logger.log(LogStatus.INFO, logger.addScreenCapture(screenshotpath));
	}
	
	
	
	
	//get url from props file and jenkins parameter using this method
	
	public void geturl(WebDriver driver) {
		
		System.out.println("configfile reader value is :"+ConfigFileReader("runon"));
		
		if(properties.getProperty("runon").equalsIgnoreCase("local")) {
			
			String env=properties.getProperty("environment");
			System.out.println("prinitning config local "+env+"::"+properties.getProperty("environment"));
			if(env.equalsIgnoreCase("srv18")) {
				driver.get(properties.getProperty("srv18url"));
			}
			else {
				//we can write for other environments in else confitions
				System.out.println("No url to load" );
			}	
			
		}
		else if(ConfigFileReader("runon").equalsIgnoreCase("jenkin")) {
			String env=System.getenv("environment");
			System.out.println("prinitning config"+env+"::"+System.getenv("environment"));
			if(env.equalsIgnoreCase("srv18")) {
				System.out.println("Executing in jenking for the url"+ConfigFileReader("srv18url"));
				driver.get(ConfigFileReader("srv18url"));
	// 			logger.log(LogStatus.PASS, "URL is fetched based on Jenkin input");
		}
		else {
			//we can write for other environments in else conditions.
			System.out.println("No url to load" );
		}
	}
	}
	
	//Home page dashbord icons are validated with this function
	public void dashboardiconValidation(WebDriver driver,ExtentTest logger,String usertype,WebDriverWait wait,String Dashboardicons) throws InterruptedException {
		String[] icons=Dashboardicons.split(",");  
		int noOfIcons=icons.length;
		System.out.println("no of icons:"+noOfIcons);
		wait.until(ExpectedConditions.presenceOfElementLocated(Requestsicon));
		for(int i=0;i<noOfIcons;i++) {
			if(icons[i].equalsIgnoreCase("Notebooks")) {
				Boolean isPresent = driver.findElements(Notebooksicon).size()>0;
				if(isPresent) {
					logger.log(LogStatus.PASS, "Notebooks icon is present as expected");
				}else {
					logger.log(LogStatus.FAIL, "Notebooks icon is not present and not as expected");
				}
				
			}else if(icons[i].equalsIgnoreCase("Experiments")) {
				Boolean isPresent = driver.findElements(Experimentsicon).size()>0;
				if(isPresent) {
					logger.log(LogStatus.PASS, "Experiments icon is present as expected");
				}else {
					logger.log(LogStatus.FAIL, "Experiments icon is not present and not as expected");
				}
				
				
			}else if(icons[i].equalsIgnoreCase("Parallel Experiments")) {
				Boolean isPresent = driver.findElements(Parallelexperimentsicon).size()>0;
				if(isPresent) {
					logger.log(LogStatus.PASS, "Parallelexperiments icon is present as expected");
				}else {
					logger.log(LogStatus.FAIL, "Parallelexperiments icon is not present and not as expected");
				}
				
			}else if(icons[i].equalsIgnoreCase("Requests")) {
				
				Boolean isPresent = driver.findElements(Requestsicon).size()>0;
				if(isPresent) {
					logger.log(LogStatus.PASS, "Requests icon is present as expected");
				}else {
					logger.log(LogStatus.FAIL, "Requests icon is not present and not as expected");
				}
				
			}
			else if(icons[i].equalsIgnoreCase("Tasks")) {
				
				Boolean isPresent = driver.findElements(Tasksicon).size()>0;
				if(isPresent) {
					logger.log(LogStatus.PASS, "Tasksicon is present as expected");
				}else {
					logger.log(LogStatus.FAIL, "Tasksicon is not present and not as expected");
				}
				
			}else if(icons[i].equalsIgnoreCase("Chemical Reactions")) {
				
				Boolean isPresent = driver.findElements(ChemicalReactionsicon).size()>0;
				if(isPresent) {
					logger.log(LogStatus.PASS, "ChemicalReactions icon is present as expected");
				}else {
					logger.log(LogStatus.FAIL, "ChemicalReactions icon is not present and not as expected");
				}
				
			}else if(icons[i].equalsIgnoreCase("Chemicals")) {
				
				Boolean isPresent = driver.findElements(Chemicalsicon).size()>0;
				if(isPresent) {
					logger.log(LogStatus.PASS, "Chemicalsicon  is present as expected");
				}else {
					logger.log(LogStatus.FAIL, "Chemicalsicon  is not present and not as expected");
				}
				
			}else if(icons[i].equalsIgnoreCase("Favorites")) {
				
				Boolean isPresent = driver.findElements(Favoritesicon).size()>0;
				if(isPresent) {
					logger.log(LogStatus.PASS, "Favoritesicon  is present as expected");
				}else {
					logger.log(LogStatus.FAIL, "Favoritesicon  is not present and not as expected");
				}
				
			}else if(icons[i].equalsIgnoreCase("Custom Objects")) {
				
				Boolean isPresent = driver.findElements(Customobjectsicon).size()>0;
				if(isPresent) {
					logger.log(LogStatus.PASS, "Customobjectsicon  is present as expected");
				}else {
					logger.log(LogStatus.FAIL, "Customobjectsicon  is not present and not as expected");
				}
				
			}else if(icons[i].equalsIgnoreCase("Materials")) {
				
				Boolean isPresent = driver.findElements(Materialsicon).size()>0;
				if(isPresent) {
					logger.log(LogStatus.PASS, "Materialsicon  is present as expected");
				}else {
					logger.log(LogStatus.FAIL, "Materialsicon  is not present and not as expected");
				}
				
			}else if(icons[i].equalsIgnoreCase("User Groups")) {
				
				Boolean isPresent = driver.findElements(Usergroupicon).size()>0;
				if(isPresent) {
					logger.log(LogStatus.PASS, "Usergroupicon  is present as expected");
				}else {
					logger.log(LogStatus.FAIL, "Usergroupicon  is not present and not as expected");
				}
				
			}
			
			
		}
		Boolean isPresent = driver.findElements(Dashboardicon).size()>0;
		if(isPresent) {
			logger.log(LogStatus.PASS, "Dashboardicon  is present as expected");
		}else {
			logger.log(LogStatus.FAIL, "Dashboardicon  is not present and not as expected");
		}
		
		Boolean isPresent_Search = driver.findElements(Searchicon).size()>0;
		if(isPresent_Search) {
			logger.log(LogStatus.PASS, "Searchicon  is present as expected");
		}else {
			logger.log(LogStatus.FAIL, "Searchicon  is not present and not as expected");
		}
		
		Boolean isPresent_Addnew= driver.findElements(Addnewicon).size()>0;
		if(isPresent_Search) {
			logger.log(LogStatus.PASS, "Addnewicon  is present as expected");
		}else {
			logger.log(LogStatus.FAIL, "Addnewicon  is not present and not as expected");
		}
	}
	
	
	//dropdown icons under the username in home page is validated using this method.
	public void usernameDropDownValidation(WebDriver driver,ExtentTest logger,String usertype,WebDriverWait wait,String userDropdown) {
		String[] dropdownlist=userDropdown.split(",");  
		int noOfIcons=dropdownlist.length;
		System.out.println("no of icons:"+noOfIcons);
		
		String screenshotpath=BaseClass.addScreenshot(driver);
		logger.log(LogStatus.INFO, logger.addScreenCapture(screenshotpath));
		for(int i=0;i<noOfIcons;i++) {
			if(dropdownlist[i].equalsIgnoreCase("User Settings")) {
					Boolean isPresent = driver.findElements(userSetting).size()>0;
					if(isPresent) {
						logger.log(LogStatus.PASS, "userSetting icon is present in dropdown as expected");
					}else {
						logger.log(LogStatus.FAIL, "userSetting icon is not present in dropdown and not as expected");
				}
				
		
			}
			else if(dropdownlist[i].equalsIgnoreCase("Templates")) {
				
				Boolean isPresent = driver.findElements(templates).size()>0;
				if(isPresent) {
					logger.log(LogStatus.PASS, "Templates  is present in dropdown as expected");
				}else {
					logger.log(LogStatus.FAIL, "Templates  is not present in dropdown and not as expected");
				}	
	
			}
			else if(dropdownlist[i].equalsIgnoreCase("Trashed items")) {
				
				Boolean isPresent = driver.findElements(trashedItems).size()>0;
				if(isPresent) {
					logger.log(LogStatus.PASS, "trashedItems  is present in dropdown as expected");
				}else {
					logger.log(LogStatus.FAIL, "trashedItems  is not present in dropdown and not as expected");
				}	
	
			}
			else if(dropdownlist[i].equalsIgnoreCase("Material Bulk Import Results")) {
				
				Boolean isPresent = driver.findElements(materialbulkImport).size()>0;
				if(isPresent) {
					logger.log(LogStatus.PASS, "materialbulkImport  is present in dropdown as expected");
				}else {
					logger.log(LogStatus.FAIL, "materialbulkImport  is not present in dropdown and not as expected");
				}	
	
			}
			else if(dropdownlist[i].equalsIgnoreCase("Inventory")) {
				
				Boolean isPresent = driver.findElements(inventory).size()>0;
				if(isPresent) {
					logger.log(LogStatus.PASS, "Inventory  is present in dropdown as expected");
				}else {
					logger.log(LogStatus.FAIL, "Inventory  is not present in dropdown and not as expected");
				}	
	
			}
			else if(dropdownlist[i].equalsIgnoreCase("Quick Start Guide")) {
				
				Boolean isPresent = driver.findElements(quickStartGuide).size()>0;
				if(isPresent) {
					logger.log(LogStatus.PASS, "quickStartGuide  is present in dropdown as expected");
				}else {
					logger.log(LogStatus.FAIL, "quickStartGuide  is not present in dropdown and not as expected");
				}	
	
			}
			else if(dropdownlist[i].equalsIgnoreCase("User Guide")) {
				
				Boolean isPresent = driver.findElements(userGuide).size()>0;
				if(isPresent) {
					logger.log(LogStatus.PASS, "userGuide  is present in dropdown as expected");
				}else {
					logger.log(LogStatus.FAIL, "userGuide  is not present in dropdown and not as expected");
				}	
	
			}
			else if(dropdownlist[i].equalsIgnoreCase("FAQs")) {
				
				Boolean isPresent = driver.findElements(faQs).size()>0;
				if(isPresent) {
					logger.log(LogStatus.PASS, "FAQs  is present in dropdown as expected");
				}else {
					logger.log(LogStatus.FAIL, "FAQs  is not present in dropdown and not as expected");
				}	
	
			}
			else if(dropdownlist[i].equalsIgnoreCase("ChemDraw user Guide")) {
				
				Boolean isPresent = driver.findElements(chemdrwawuserguide).size()>0;
				if(isPresent) {
					logger.log(LogStatus.PASS, "chemdrwawuserguide  is present in dropdown as expected");
				}else {
					logger.log(LogStatus.FAIL, "chemdrwawuserguide  is not present in dropdown and not as expected");
				}	
	
			}
			else if(dropdownlist[i].equalsIgnoreCase("Training Videos")) {
				
				Boolean isPresent = driver.findElements(trainingVideos).size()>0;
				if(isPresent) {
					logger.log(LogStatus.PASS, "Training Videos  is present in dropdown as expected");
				}else {
					logger.log(LogStatus.FAIL, "Training Videos  is not present in dropdown and not as expected");
				}	
	
			}
			else if(dropdownlist[i].equalsIgnoreCase("Terms & Conditions")) {
				
				Boolean isPresent = driver.findElements(termsandcondition).size()>0;
				if(isPresent) {
					logger.log(LogStatus.PASS, " Terms & Conditions  is present in dropdown as expected");
				}else {
					logger.log(LogStatus.FAIL, "Terms & Conditions  is not present in dropdown and not as expected");
				}	
	
			}
			else if(dropdownlist[i].equalsIgnoreCase("Service Level Addendum")) {
				
				Boolean isPresent = driver.findElements(serviceleveladd).size()>0;
				if(isPresent) {
					logger.log(LogStatus.PASS, " Service Level Addendum  is present in dropdown as expected");
				}else {
					logger.log(LogStatus.FAIL, "Service Level Addendum  is not present in dropdown and not as expected");
				}	
	
			}
			else if(dropdownlist[i].equalsIgnoreCase("Global Security Addendum")) {
				
				Boolean isPresent = driver.findElements(globalSecurityadd).size()>0;
				if(isPresent) {
					logger.log(LogStatus.PASS, " Global Security Addendum  is present in dropdown as expected");
				}else {
					logger.log(LogStatus.FAIL, "Global Security Addendum  is not present in dropdown and not as expected");
				}	
	
			}
			else if(dropdownlist[i].equalsIgnoreCase("Acceptable use policy")) {
				
				Boolean isPresent = driver.findElements(acceptableusePolicy).size()>0;
				if(isPresent) {
					logger.log(LogStatus.PASS, " acceptableusePolicy  is present in dropdown as expected");
				}else {
					logger.log(LogStatus.FAIL, "acceptableusePolicy  is not present in dropdown and not as expected");
				}	
	
			}
			else if(dropdownlist[i].equalsIgnoreCase("What's New")) {
				
				Boolean isPresent = driver.findElements(whatsnew).size()>0;
				if(isPresent) {
					logger.log(LogStatus.PASS, " whatsnew  is present in dropdown as expected");
				}else {
					logger.log(LogStatus.FAIL, "whatsnew  is not present in dropdown and not as expected");
				}	
	
			}
			else if(dropdownlist[i].equalsIgnoreCase("Contact Support")) {
				
				Boolean isPresent = driver.findElements(contactsupport).size()>0;
				if(isPresent) {
					logger.log(LogStatus.PASS, " contactsupport  is present in dropdown as expected");
				}else {
					logger.log(LogStatus.FAIL, "contactsupport  is not present in dropdown and not as expected");
				}	
	
			}
			else if(dropdownlist[i].equalsIgnoreCase("System Alerts")) {
				
				Boolean isPresent = driver.findElements(systemAlert).size()>0;
				if(isPresent) {
					logger.log(LogStatus.PASS, " systemAlert  is present in dropdown as expected");
				}else {
					logger.log(LogStatus.FAIL, "systemAlert  is not present in dropdown and not as expected");
				}	
	
			}
			else if(dropdownlist[i].equalsIgnoreCase("Sign out")) {
				
				Boolean isPresent = driver.findElements(signout).size()>0;
				if(isPresent) {
					logger.log(LogStatus.PASS, " Sign out  is present in dropdown as expected");
				}else {
					logger.log(LogStatus.FAIL, "Sign out  is not present in dropdown and not as expected");
				}	
	
			}
	
	
		}
	}
	
	//delete a newly created user by system admin input of email address of newly created should be given.
public void deleteNewlyCreatedUser(WebDriver driver,ExtentTest logger,String email,WebDriverWait wait) throws InterruptedException {
		
		Boolean ispresent_trashicon=driver.findElements(trashicon).size()>0;
		if(ispresent_trashicon) {
			wait.until(ExpectedConditions.presenceOfElementLocated(trashicon)).click();
			Thread.sleep(2000);
			logger.log(LogStatus.PASS, "clicked on trash icon successfully:"+email);
		}else {
			logger.log(LogStatus.FAIL, "not clicked on trash icon successfully:"+email);
		}
		
		
		String winHandleBefore=sysconfig.winhandlebefore(driver);
		WebDriver switcheddriver=sysconfig.windowsswitch(driver);
		switcheddriver.findElement(checkboxdelete).click();
		logger.log(LogStatus.PASS, "Checkbox for full control is checked by user:"+email);
		String screenshotpath=BaseClass.addScreenshot(driver);
		logger.log(LogStatus.INFO, logger.addScreenCapture(screenshotpath));
		switcheddriver.findElement(deleteuserbutton).click();
		
		//sysconfig.switchbacktodefaultdriver(switcheddriver, winHandleBefore);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.presenceOfElementLocated(filterinputbox)).clear();
		wait.until(ExpectedConditions.presenceOfElementLocated(filterinputbox)).sendKeys(email);
		Thread.sleep(2000);
		
		Boolean ispresent_filteremaildisplayed=driver.findElements(filteremaildisplayed).size()>0;
		if(ispresent_filteremaildisplayed) {
			
			logger.log(LogStatus.FAIL, "user is not deleted fail:"+email);
		}else {
			logger.log(LogStatus.PASS, "user is deleted successfully:"+email);
		}
		
	}
	



//create new experiment
public void newExperiment(WebDriver driver,WebDriverWait wait,ExtentTest logger,String Usertype,String template,String description,String notebook,String users,String project,String Department,String internalfield,String shareproject) throws InterruptedException {
	
	Boolean ispresent_Addnew=driver.findElements(Addnewicon).size()>0;
	if(ispresent_Addnew) {
		driver.findElement(Addnewicon).click();
		logger.log(LogStatus.PASS, "Add new button is clicked successfully");
	}else {
		logger.log(LogStatus.FAIL, "Add new button is not clicked successfully");
	}
	
	
	
	Boolean ispresent_newExperimentbutton=driver.findElements(newExperimentbutton).size()>0;
	if(ispresent_newExperimentbutton) {
		driver.findElement(newExperimentbutton).click();
		logger.log(LogStatus.PASS, "newExperimentbutton is clicked successfully");
	}else {
		logger.log(LogStatus.FAIL, "newExperimentbutton is not clicked successfully");
	}
	
	
	wait.until(ExpectedConditions.presenceOfElementLocated(cancelbutton));

	Boolean ispresent_templateClosebutton=driver.findElements(templateClosebutton).size()>0;
	if(ispresent_templateClosebutton) {
		driver.findElement(templateClosebutton).click();
		logger.log(LogStatus.PASS, "templateClosebutton is clicked successfully");
	}else {
		//nothing to do if close button is not present.
	}
	
	
	Boolean ispresent_templateinput=driver.findElements(templateinput).size()>0;
	if(ispresent_templateinput) {
		driver.findElement(templateinput).click();
		
		logger.log(LogStatus.PASS, "templateinput is clickedsuccessfully");
	}else {
		//nothing to do if close button is not present.
	}
	
	if(template.equalsIgnoreCase("NA")) {
		
	}else {
		driver.findElement(templateinput).sendKeys(template);
		Thread.sleep(2000);
		driver.findElement(templateinput).sendKeys(Keys.ENTER);
	}
	
	
	wait.until(ExpectedConditions.presenceOfElementLocated(cancelbutton));
	Boolean ispresent_descriptioninput=driver.findElements(descriptioninput).size()>0;
	if(ispresent_descriptioninput) {
//		driver.findElement(descriptioninput).click();
		driver.findElement(descriptioninput).sendKeys(description);
		logger.log(LogStatus.PASS, "descriptioninput is clicked and value entered successfully");
	}else {
		logger.log(LogStatus.FAIL, "descriptioninput is not clicked and value not entered successfully");
	}
	
	
	Boolean ispresent_notebookinput=driver.findElements(notebookinput).size()>0;
	if(ispresent_notebookinput) {
		
		if(notebook.equalsIgnoreCase("NA")) {
			
		}else {
			//driver.findElement(notebookinput).click();
			driver.findElement(notebookinput).sendKeys(notebook);
			
//			driver.findElement(notebookinput).sendKeys(Keys.TAB);
			wait.until(ExpectedConditions.presenceOfElementLocated(dropdownselection)).click();
			logger.log(LogStatus.PASS, "notebookinput is clicked and value entered successfully");
			
		}
		
	}else {
		logger.log(LogStatus.FAIL, "notebookinput is not present");
	}
	
	Boolean ispresent_usersinput=driver.findElements(usersinput).size()>0;
	if(ispresent_usersinput) {
		
		if(users.equalsIgnoreCase("NA")) {
			
		}else {
			//driver.findElement(usersinput).click();
			driver.findElement(usersinput).sendKeys(users);
//			Thread.sleep(2000);
//			driver.findElement(usersinput).sendKeys(Keys.TAB);
			wait.until(ExpectedConditions.presenceOfElementLocated(dropdownselection)).click();
			logger.log(LogStatus.PASS, "usersinput is clicked and value entered successfully");
		}
		
	}else {
		if(users.equalsIgnoreCase("NA")) {
		logger.log(LogStatus.PASS, "usersinput is not present as expectted"+users);
		}else {
			logger.log(LogStatus.FAIL, "usersinput is not present "+users);	
		}
	}
	Thread.sleep(3000);
//	((JavascriptExecutor)driver).executeScript("scroll(0,500)");
//	JavascriptExecutor js = ((JavascriptExecutor) driver);
//	js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
//	Thread.sleep(3500);


	
	Boolean ispresent_projectinput=driver.findElements(projectinput).size()>0;
	if(ispresent_projectinput) {
		
		if(project.equalsIgnoreCase("NA")) {
			
		}else {
			//driver.findElement(projectinput).click();
			driver.findElement(projectinput).sendKeys(project);
			Thread.sleep(10000);
//			driver.findElement(projectinput).sendKeys(Keys.TAB);
			Actions actions = new Actions(driver);

			actions.moveToElement(driver.findElement(dropdownselection)).click().perform();
			//wait.until(ExpectedConditions.presenceOfElementLocated(dropdownselection)).click();
			logger.log(LogStatus.PASS, "projectinput is clicked and value entered successfully");
		}
		
	}else {
		if(project.equalsIgnoreCase("NA")) {
		logger.log(LogStatus.PASS, "projectinput is not present as expectted");
		}else {
			logger.log(LogStatus.FAIL, "projectinput is not present ");	
		}
	}
	
	
	Boolean ispresent_departmentInput=driver.findElements(departmentInput).size()>0;
	if(ispresent_departmentInput) {
		
		if(Department.equalsIgnoreCase("NA")) {
			
		}else {
			//driver.findElement(departmentInput).click();
			driver.findElement(departmentInput).sendKeys(Department);
//			Thread.sleep(2000);
//			driver.findElement(departmentInput).sendKeys(Keys.TAB);
			wait.until(ExpectedConditions.presenceOfElementLocated(dropdownselection)).click();
			logger.log(LogStatus.PASS, "departmentInput is clicked and value entered successfully");
		}
		
	}else {
		if(Department.equalsIgnoreCase("NA")) {
		logger.log(LogStatus.PASS, "departmentInput is not present as expectted");
		}else {
			logger.log(LogStatus.FAIL, "departmentInput is not present ");	
		}
	}
	
	
	
	Boolean ispresent_internalfieldInput=driver.findElements(internalfieldInput).size()>0;
	if(ispresent_internalfieldInput) {
		
		if(internalfield.equalsIgnoreCase("NA")) {
			
		}else {
			//driver.findElement(internalfieldInput).click();
			driver.findElement(internalfieldInput).sendKeys(internalfield);
//			Thread.sleep(2000);
//			driver.findElement(internalfieldInput).sendKeys(Keys.TAB);
			wait.until(ExpectedConditions.presenceOfElementLocated(dropdownselection)).click();
			logger.log(LogStatus.PASS, "internalfieldInput is clicked and value entered successfully");
		}
		
	}else {
		if(internalfield.equalsIgnoreCase("NA")) {
		logger.log(LogStatus.PASS, "internalfieldInput is not present as expectted");
		}else {
			logger.log(LogStatus.FAIL, "internalfieldInput is not present "+internalfield);	
		}
	}
	
	String screenshotpath=BaseClass.addScreenshot(driver);
	logger.log(LogStatus.INFO, logger.addScreenCapture(screenshotpath));
	
	wait.until(ExpectedConditions.presenceOfElementLocated(createbutton)).click();
	
	
	String experiment_name=wait.until(ExpectedConditions.presenceOfElementLocated(createdexperimentnamefetch)).getText();
	System.out.println("experiment_name:"+experiment_name);
	if(shareproject.equalsIgnoreCase("yes")) {
		Boolean ispresent_sharingbutton=driver.findElements(sharingbutton).size()>0;
		if(ispresent_sharingbutton) {
			logger.log(LogStatus.PASS, "Sharing button is enabled for Admin user as expected for experiment"+experiment_name);
		}else {
			logger.log(LogStatus.FAIL, "Sharing button is not enabled for Admin user as expected for experiment"+experiment_name);
		}
	}else if(shareproject.equalsIgnoreCase("no")|| shareproject.equalsIgnoreCase("NA")){
		Boolean ispresent_sharingbutton=driver.findElements(sharingbutton).size()<1;
		if(ispresent_sharingbutton) {
			logger.log(LogStatus.PASS, "Sharing button is not enabled  for standard user as expected for experiment"+experiment_name);
		}else {
			logger.log(LogStatus.FAIL, "Sharing button is enabled  for Standard user not as expected for experiment"+experiment_name);
		}
	}
	
	String screenshotpath_Signing=BaseClass.addScreenshot(driver);
	logger.log(LogStatus.INFO, logger.addScreenCapture(screenshotpath_Signing));
	
	Boolean ispresent_signingbutton=driver.findElements(signingbutton).size()>0;
	if(ispresent_signingbutton) {
		
		logger.log(LogStatus.PASS, "signingbutton is enabled for user as expected for experiment"+experiment_name);
	}else {
		logger.log(LogStatus.FAIL, "signingbutton is enabled for  user as expected for experiment"+experiment_name);
	}
	
}



public void verifyCreatedExperimentTemplate(WebDriver driver,WebDriverWait wait) throws InterruptedException {
	wait.until(ExpectedConditions.presenceOfElementLocated(Addnewicon)).click();
	Thread.sleep(7000);
}


//click on add new and clicks on create new experiment
public void clickonNEwexperiment(WebDriver driver,WebDriverWait wait,ExtentTest logger,String templatetype) throws InterruptedException {
	
		Boolean ispresent_Addnew=driver.findElements(Addnewicon).size()>0;
		if(ispresent_Addnew) {
			driver.findElement(Addnewicon).click();
			logger.log(LogStatus.PASS, "Add new button is clicked successfully");
		}else {
			logger.log(LogStatus.FAIL, "Add new button is not clicked successfully");
		}
		
		
		if(templatetype.equalsIgnoreCase("experiment")) {
		Boolean ispresent_newExperimentbutton=driver.findElements(newExperimentbutton).size()>0;
		if(ispresent_newExperimentbutton) {
			driver.findElement(newExperimentbutton).click();
			logger.log(LogStatus.PASS, "newExperimentbutton is clicked successfully");
		}else {
			logger.log(LogStatus.FAIL, "newExperimentbutton is not clicked successfully");
		}
		}else if(templatetype.equalsIgnoreCase("Admin defined")) {
			Boolean ispresent_newadmintemplatebutton=driver.findElements(newAdminDefinedbutton).size()>0;
			if(ispresent_newadmintemplatebutton) {
				driver.findElement(newAdminDefinedbutton).click();
				logger.log(LogStatus.PASS, "newadmintemplatebutton is clicked successfully");
			}else {
				logger.log(LogStatus.FAIL, "newadmintemplatebutton is not clicked successfully");
			}
		}
	
}

//Search for a template while creating a experiemnt and validate if search template is present.
public void SearchforNewExperimenttemplate(WebDriver driver,WebDriverWait wait,ExtentTest logger,String template) throws InterruptedException {
	
		wait.until(ExpectedConditions.presenceOfElementLocated(cancelbutton));
	
		Boolean ispresent_templateClosebutton=driver.findElements(templateClosebutton).size()>0;
		if(ispresent_templateClosebutton) {
			driver.findElement(templateClosebutton).click();
			logger.log(LogStatus.PASS, "templateClosebutton is clicked successfully");
		}else {
			//nothing to do if close button is not present.
		}
		
		
		Boolean ispresent_templateinput=driver.findElements(templateinput).size()>0;
		if(ispresent_templateinput) {
			driver.findElement(templateinput).click();
			
			logger.log(LogStatus.PASS, "templateinput is clickedsuccessfully");
		}else {
			//nothing to do if close button is not present.
		}
		
		driver.findElement(templateinput).sendKeys(template);
		Thread.sleep(3000);
		driver.findElement(templateinput).sendKeys(Keys.ENTER);
	
	
	
		wait.until(ExpectedConditions.presenceOfElementLocated(cancelbutton));
		
		Boolean ispresent_templateClosebutton2=driver.findElements(templateClosebutton).size()>0;
		if(ispresent_templateClosebutton2) {
			driver.findElement(templateClosebutton).click();
			logger.log(LogStatus.PASS, "template created by system admin is reflected for end user for experiment creation.");
		}else {
			//no
			logger.log(LogStatus.FAIL, "template created by system admin is not reflected for end user for experiment creation.");
		
		}
		

	}

public void mandatoryOrNotFieldValidation(WebDriver driver,WebDriverWait wait,ExtentTest logger,String field1,String field1YorN) {
	
	
	String[] fields=field1.split(",");
	String[] mandatoryYorN=field1YorN.split(",");
	
	int fieldlength=fields.length;
	
	for(int i=0;i<fieldlength;i++) {
		
			
			Boolean ispresent_experimentcreatepageName=driver.findElements(By.xpath("//label[text()='"+fields[i]+"']")).size()>0;
			if(ispresent_experimentcreatepageName) {
				logger.log(LogStatus.PASS, fields[i]+" field is displayed as expected");
				if(mandatoryYorN[i].equalsIgnoreCase("Yes")) {
					Boolean ispresent_mandatorysymbol=driver.findElements(By.xpath("//label[text()='"+fields[i]+"']//span[text()='*']")).size()>0;
					if(ispresent_mandatorysymbol) {
						logger.log(LogStatus.PASS, fields[i]+" field is displayed with mandatory symbol as expected");
					}else {
						logger.log(LogStatus.FAIL, fields[i]+" field is not displayed with mandatory symbol as expected");	
					}
				}
			}else {
				logger.log(LogStatus.FAIL, fields[i]+" field is  not displayed as expected");
			}
			
		
	}	
}

public void experimenticonclick(WebDriver driver,WebDriverWait wait,ExtentTest logger,String Experimentname) throws InterruptedException {
	wait.until(ExpectedConditions.presenceOfElementLocated(Experimentsicon)).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//bdi[@title='"+Experimentname+"']")).click();
	logger.log(LogStatus.PASS,Experimentname+" experiment is clicked successfully ");
}


public void clickonAddContent(WebDriver driver,WebDriverWait wait,ExtentTest logger,String Experimentname) throws InterruptedException {
	Thread.sleep(2000);
	wait.until(ExpectedConditions.presenceOfElementLocated(Addcontenticon)).click();
	Thread.sleep(2000);
	logger.log(LogStatus.PASS,"Add content icon is clicked successfully");
}
	
public void selecttemplatefromAddContent(WebDriver driver,WebDriverWait wait,ExtentTest logger,String selecttemplate) {
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='dropdown-item']//div[text()='"+selecttemplate+"']/span/i"))).click();
	logger.log(LogStatus.PASS,"from the dropdown "+selecttemplate+"  is clicked successfully");
}


public void selectTableTemplate(WebDriver driver,WebDriverWait wait,ExtentTest logger,String Templatename ){
	wait.until(ExpectedConditions.presenceOfElementLocated(AdmindefinedtemplateDialogbox)).sendKeys(Templatename);;
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='table-template-selection-item-undefined']/strong[text()='"+Templatename+"']"))).click();
	
	wait.until(ExpectedConditions.presenceOfElementLocated(createButton)).click();
	
	logger.log(LogStatus.PASS,"Create button is clicked successfully");
	
}

public void tableTemplateValidation(WebDriver driver,WebDriverWait wait,ExtentTest logger,String Templatename,String field1 ) throws InterruptedException{
	
	String[] fields=field1.split(",");
	int fieldlength=fields.length;
	
	for(int i=0;i<fieldlength;i++) {
		try {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='binder__element-header']//span[text()='"+Templatename+"']/../../../..//div[@class='header']//div[text()='"+fields[i]+"']")));
		}catch(Exception e) {
			
		}
		
		Boolean ispresent_values=driver.findElements(By.xpath("//div[@class='binder__element-header']//span[text()='"+Templatename+"']/../../../..//div[@class='header']//div[text()='"+fields[i]+"']")).size()>0;
		if(ispresent_values) {
			logger.log(LogStatus.PASS, fields[i]+" value is present in header of table template as expected");
		}else {
			logger.log(LogStatus.FAIL, fields[i]+" value is not present in header of table template as expected");
		}
	}
}

}
