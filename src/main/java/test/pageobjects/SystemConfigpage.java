package test.pageobjects;

import java.util.Random;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import test.Utility.BaseClass;

public class SystemConfigpage {
	//xpathlogin page username
	By loginpageusername=By.xpath("//input[@name='username']");
	
	//xpath of user creation
	By users=By.xpath("//a[text()='Users']");
	By usercreation=By.xpath("//div[text()='User']/span/i");
	By firstName=By.xpath("//label[text()='First Name']/../input");
	By lastName=By.xpath("//label[text()='Last Name']/../input");
	By emailfield=By.xpath("//label[text()='Email']/../input");
	By alias=By.xpath("//label[text()='Alias']/../input");
	By organization=By.xpath("//label[text()='Organization']/../input");
	By countryclosebutton=By.xpath("//button[@class='close rbt-close']/span[1]");
	By countrytypeinput=By.xpath("//label[text()='Country']/../div/div[1]/input");
	By savebutton=By.xpath("//button[@id='create-btn'][text()='Save Changes']");
	//By chosecountryfromdropdown=By.xpath("//div [@class='rbt-menu dropdown-menu show']/a[@aria-label='"+value+"']");
	
	//xpath after usercreation page
	By filterinputbox=By.xpath("//input[@placeholder='Filter'][@type='text']");
	By filteremaildisplayed=By.xpath("//div[@class='user-info-text']/div[2]");
	By statusofuser=By.xpath("//div[@class='user-admin-column ']/div");
	
	
	//userroles and department change xpath
	By userrolesinput=By.xpath("//label[text()='User Roles']/../div/div/div/div/input");
	By systemgroupsinput=By.xpath("//label[text()='System Groups']/../div/div/div/div/input");
	
	//roles xpath standard system admin inventory
	By rolesactive=By.xpath("//div[@class='user-admin-record-active']/div[5]");
	
	
	
	//xpathfor dashboard and timeout settings
	By dashboardicon=By.xpath("//i[@class='icon icon-dashboard icon-lg']");
	By systemstetting=By.xpath("//a[text()='System Settings']");
	By otherArrow=By.xpath("//a[text()='Other']/../../div[2]");
	By timeoutoption=By.xpath("//a[text()='Timeout']");
	By sessiontimeoutdropdown=By.xpath("//button[@id='settingsTimeoutDropdown']");
	By tenminutesdropdown=By.xpath("//div[@class='dropdown-menu show']/a[text()='10 minutes']");
	By saveSettings=By.xpath("//button[text()='Save Settings']");
	
	
	By systemObject=By.xpath("//a[text()='System Objects']");
	By TableTemplate=By.xpath("//a[text()='Table Templates']");
	By TableTemplateSave=By.xpath("//button[text()='Save']");
	
	
	By TableTemplateaddbutton=By.xpath("//button[@id='btn-add-element']/div[text()='Table Template']");
	
	By ExistingTableTemplate=By.xpath("//h4[@class='entity-info-name truncate green']/a/span[2][text()='testtable123']");
	
	By experimenttemplate=By.xpath("//span[@title='Experiment']");
	By nametabletemplate=By.xpath("//input[@name='name']");
	
	
	
	
	
	By experimenttemplates=By.xpath("//a[contains(text(),'Template')]");
	By experimenttemplatesplusutton=By.xpath("//div[text()='Experiment Template']");
	By admindefinedtemplatesplusutton=By.xpath("//div[text()='Admin defined Template']");
	By experimenttemplatename=By.xpath("//input[@name='name']");
	By fieldsbutton=By.xpath("//button[text()='Fields']/i");
	By createtemplatebutton=By.xpath("//button[text()='Create Template']");
	By createtablebutton=By.xpath("//button[text()='Create Table']");
	
	By previewLable=By.xpath("//div[text()='Preview']");
	By trashIcon=By.xpath("//i[@class='icon icon-trash icon-lg']");
	
	By namefield=By.xpath("//td[text()='Name']");
	By namefieldedit=By.xpath("//td[text()='Name']/../td[3]/i");
	By ischeckednamefield=By.xpath("//input[@id='required']");
	By cancelButton=By.xpath("//button[@id='cancel']");
	By saveButton=By.xpath("//button[@id='save']");
	
	By AddColumnTabletemplate=By.xpath("//button[@type='button'][text()=' Add Column']");
	By columnNametabletemplate=By.xpath("//tbody/tr[1]//input[@placeholder='Enter text']");
	
	
	
	
	By descriptionfield=By.xpath("//td[text()='Description']");
	By descriptionfieldedit=By.xpath("//td[text()='Description']/../td[3]/i");
	By isrequiredselect=By.xpath("//option[@value='isRequired']/../..//select[@placeholder='select']");
	
	//Code used to switch to newly opened window
		
	public WebDriver windowsswitch(WebDriver driver) {
		// Store the current window handle
		String winHandleBefore = driver.getWindowHandle();

		// Perform the click operation that opens new window

		// Switch to new window opened
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		    
		}
		return driver;
	}
	
	
	//code use to switch back to old window where we have to pass winHandleBefore
	public void switchbacktodefaultdriver(WebDriver driver,String winHandleBefore) {
		driver.close();
		driver.switchTo().window(winHandleBefore);
		
	}
	
	public String winhandlebefore(WebDriver driver) {
		String winHandleBefore = driver.getWindowHandle();
		return winHandleBefore;
	}
	
	public String userCreation(WebDriver driver,WebDriverWait wait,ExtentTest logger,String firstname,String lastname,String Alias,String country,String Organization) throws InterruptedException {
		
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(1000000); 
		String email="user"+Integer.toString(randomInt)+"@gmail.com";
		System.out.println("email: "+email);
		Boolean isPresent_users = driver.findElements(users).size()>0;
		if(isPresent_users) {
			wait.until(ExpectedConditions.presenceOfElementLocated(users)).click();
			logger.log(LogStatus.PASS, "users is successfully clicked from sysytem admin dshboard");
		}else {
			logger.log(LogStatus.FAIL, "users is not successfully clicked from sysytem admin dshboard");
		}
		
		Boolean isPresent_usercreation = driver.findElements(usercreation).size()>0;
		if(isPresent_usercreation) {
			wait.until(ExpectedConditions.presenceOfElementLocated(usercreation)).click();
			logger.log(LogStatus.PASS, "userscreation button is successfully clicked ");
		}else {
			logger.log(LogStatus.FAIL, "userscreation button is not successfully clicked ");
		}
		
		
		
		wait.until(ExpectedConditions.presenceOfElementLocated(firstName));
		Boolean isPresent_firstname = driver.findElements(firstName).size()>0;
		if(isPresent_firstname) {
			wait.until(ExpectedConditions.presenceOfElementLocated(firstName)).sendKeys(firstname);
			logger.log(LogStatus.PASS, "firstname is successfully entered ");
		}else {
			logger.log(LogStatus.FAIL, "firstname is not successfully entered ");
		}
		
		
		Boolean isPresent_lastNamee = driver.findElements(lastName).size()>0;
		if(isPresent_lastNamee) {
			wait.until(ExpectedConditions.presenceOfElementLocated(lastName)).sendKeys(lastname);
			logger.log(LogStatus.PASS, "Lastname is successfully entered ");
		}else {
			logger.log(LogStatus.PASS, "Lastname is not successfully entered ");
		}
		
		
		Boolean isPresent_emailfield = driver.findElements(emailfield).size()>0;
		if(isPresent_emailfield) {
			wait.until(ExpectedConditions.presenceOfElementLocated(emailfield)).sendKeys(email);
			logger.log(LogStatus.PASS, "emailid is successfully entered ");
		}else {
			logger.log(LogStatus.FAIL, "emailid is not successfully entered ");
		}
		
		
		
		Boolean isPresent_alias = driver.findElements(alias).size()>0;
		if(isPresent_alias) {
			wait.until(ExpectedConditions.presenceOfElementLocated(alias)).sendKeys(Alias+Integer.toString(randomInt));
			logger.log(LogStatus.PASS, "Alias is successfully entered ");
		}else {
			logger.log(LogStatus.FAIL, "Alias is not successfully entered ");
		}
		
		Boolean isPresent_countryclosebutton = driver.findElements(countryclosebutton).size()>0;
		if(isPresent_countryclosebutton) {
			Thread.sleep(2000);
			wait.until(ExpectedConditions.presenceOfElementLocated(countryclosebutton)).click();
			logger.log(LogStatus.PASS, "countryclosebutton is successfully clicked ");
		}else {
			logger.log(LogStatus.FAIL, "countryclosebutton is not successfully clicked ");
		}
		
		
		
		Boolean isPresent_countrytypeinputn = driver.findElements(countrytypeinput).size()>0;
		if(isPresent_countrytypeinputn) {
			wait.until(ExpectedConditions.presenceOfElementLocated(countrytypeinput)).click();
			
			wait.until(ExpectedConditions.presenceOfElementLocated(countrytypeinput)).sendKeys(country);
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div [@class='rbt-menu dropdown-menu show']/a[@aria-label='"+country+"']"))).click();
			logger.log(LogStatus.PASS, "countrytypeinput is successfully entered ");
		}else {
			logger.log(LogStatus.FAIL, "countrytypeinput is not successfully entered ");
		}
		String screenshotpath=BaseClass.addScreenshot(driver);
		logger.log(LogStatus.INFO, logger.addScreenCapture(screenshotpath));
//		Thread.sleep(9000);
		
		Boolean isPresent_corganization = driver.findElements(organization).size()>0;
		if(isPresent_corganization) {
			wait.until(ExpectedConditions.presenceOfElementLocated(organization)).clear();
			wait.until(ExpectedConditions.presenceOfElementLocated(organization)).sendKeys(Organization);
			logger.log(LogStatus.PASS, "Organization  is successfully entered ");
		}else {
			logger.log(LogStatus.FAIL, "Organization  is not successfully entered ");
		}
		
		//save button 
		wait.until(ExpectedConditions.presenceOfElementLocated(savebutton)).click();
		
		return email;
	
	}
	
	public void validateifUserCretaedSuccessfully(WebDriver driver,ExtentTest logger,String email,WebDriverWait wait) throws InterruptedException {
		wait.until(ExpectedConditions.presenceOfElementLocated(filterinputbox)).sendKeys(email);
		Thread.sleep(2000);
		Boolean ispresent_filteremaildisplayed=driver.findElements(filteremaildisplayed).size()>0;
		if(ispresent_filteremaildisplayed) {
			
			logger.log(LogStatus.PASS, "user is created successfully:"+email);
		}else {
			logger.log(LogStatus.FAIL, "user is not created successfully:"+email);
		}
		
		String screenshotpath=BaseClass.addScreenshot(driver);
		logger.log(LogStatus.INFO, logger.addScreenCapture(screenshotpath));
		
		Boolean ispresent_statusofuser=driver.findElements(statusofuser).size()>0;
		if(ispresent_statusofuser) {
			if(wait.until(ExpectedConditions.presenceOfElementLocated(statusofuser)).getText().equalsIgnoreCase("Active")) {
				logger.log(LogStatus.PASS, "user is in active state as expected:"+email);
			}else {
				logger.log(LogStatus.FAIL, "user is not in active state as expected:"+email);
			}
			
		}else {
			logger.log(LogStatus.FAIL, "user is not created successfully:"+email);
		}
	}
	
		public void changeUserRoleAndSystemGroup(WebDriver driver,ExtentTest logger,String email,WebDriverWait wait,String userrole,String Systemgroup) throws InterruptedException {
		
		
		wait.until(ExpectedConditions.presenceOfElementLocated(filteremaildisplayed)).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(userrolesinput)).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(userrolesinput)).sendKeys(userrole);
		
		driver.findElement(By.xpath("//a[@class='dropdown-item']/mark[text()='"+userrole+"']")).click();
		logger.log(LogStatus.PASS, "new user role is selected"+userrole);
		
		if(Systemgroup.contains(",")) {
			String[] systemgrp=Systemgroup.split(",");
			for(int i=0;i<systemgrp.length;i++) {
				wait.until(ExpectedConditions.presenceOfElementLocated(systemgroupsinput)).click();
				wait.until(ExpectedConditions.presenceOfElementLocated(systemgroupsinput)).sendKeys(systemgrp[i]);
				driver.findElement(By.xpath("//a[@class='dropdown-item']/mark[text()='"+systemgrp[i]+"']")).click();
				logger.log(LogStatus.PASS, "new systemgroupe is selected"+systemgrp[i]);
				Thread.sleep(6000);
			}
		}else {
			wait.until(ExpectedConditions.presenceOfElementLocated(systemgroupsinput)).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(systemgroupsinput)).sendKeys(Systemgroup);
			driver.findElement(By.xpath("//a[@class='dropdown-item']/mark[text()='"+Systemgroup+"']")).click();
			Thread.sleep(6000);
			logger.log(LogStatus.PASS, "new systemgroupe is selected"+Systemgroup);
		}
		
		String screenshotpath=BaseClass.addScreenshot(driver);
		logger.log(LogStatus.INFO, logger.addScreenCapture(screenshotpath));
		wait.until(ExpectedConditions.presenceOfElementLocated(savebutton)).click();
		Thread.sleep(4000);
	}
		
		
		
		public void verifychangedUserRole(WebDriver driver,ExtentTest logger,String email,WebDriverWait wait,String userrole) throws InterruptedException {
			wait.until(ExpectedConditions.presenceOfElementLocated(filterinputbox)).sendKeys(email);
			Thread.sleep(2000);
			String rolespresent=wait.until(ExpectedConditions.presenceOfElementLocated(rolesactive)).getText();
			if(rolespresent.contains(userrole) && rolespresent.contains("Standard User")) {
				logger.log(LogStatus.PASS, "user roles are set by system adim as expected");
			}else {
				logger.log(LogStatus.FAIL, "user roles are not set by system adim as expected");
			}
			
		}
		
		
		
		public void pagetimeoutvalidation(WebDriver switcheddriver,ExtentTest logger,WebDriver driver) throws InterruptedException {
			Boolean ispresent_Dashbordicon=switcheddriver.findElements(By.xpath("//i[@class='icon icon-dashboard icon-lg']")).size()>0;
			if(ispresent_Dashbordicon) {
			switcheddriver.findElement(dashboardicon).click();
			Thread.sleep(2000);
			logger.log(LogStatus.PASS, "Dashboard icon is clicked successfully");
			}else {
				logger.log(LogStatus.FAIL, "Dashboard icon is not clicked successfully");	
			}
			Boolean ispresent_systemstetting=switcheddriver.findElements(systemstetting).size()>0;
			if(ispresent_systemstetting) {
			switcheddriver.findElement(systemstetting).click();
			Thread.sleep(2000);
			logger.log(LogStatus.PASS, "systemstetting icon is clicked successfully");
			Thread.sleep(2000);
			}else {
				logger.log(LogStatus.FAIL, "systemstetting icon is not clicked successfully");	
			}
			
			
			Boolean ispresent_otherArrow=switcheddriver.findElements(otherArrow).size()>0;
			if(ispresent_otherArrow) {
			switcheddriver.findElement(otherArrow).click();
			Thread.sleep(2000);
			logger.log(LogStatus.PASS, "otherArrow icon is clicked successfully");
			Thread.sleep(2000);
			}else {
				logger.log(LogStatus.FAIL, "otherArrow icon is not clicked successfully");	
			}
			
			
			Boolean ispresent_timeoutoption=switcheddriver.findElements(timeoutoption).size()>0;
			if(ispresent_timeoutoption) {
				switcheddriver.findElement(timeoutoption).click();
				Thread.sleep(2000);
				logger.log(LogStatus.PASS, "timeoutoption icon is clicked successfully");
				
				}else {
					logger.log(LogStatus.FAIL, "timeoutoption icon is not clicked successfully");	
				}
			
			
			Boolean ispresent_sessiontimeoutdropdown=switcheddriver.findElements(sessiontimeoutdropdown).size()>0;
			if(ispresent_sessiontimeoutdropdown) {
				switcheddriver.findElement(sessiontimeoutdropdown).click();
				
				logger.log(LogStatus.PASS, "sessiontimeoutdropdown  is clicked successfully");
				
				}else {
					logger.log(LogStatus.FAIL, "sessiontimeoutdropdown  is not clicked successfully");	
				}
			
			Boolean ispresent_tenminutesdropdown=switcheddriver.findElements(tenminutesdropdown).size()>0;
			if(ispresent_tenminutesdropdown) {
				switcheddriver.findElement(tenminutesdropdown).click();
				
				logger.log(LogStatus.PASS, "tenminutesdropdown  is clicked successfully");
				
				}else {
					logger.log(LogStatus.FAIL, "tenminutesdropdown  is not clicked successfully");	
				}
			
			Boolean ispresent_saveSettings=switcheddriver.findElements(saveSettings).size()>0;
			if(ispresent_saveSettings) {
				switcheddriver.findElement(saveSettings).click();
				
				logger.log(LogStatus.PASS, "saveSettings  is clicked successfully");
				
				}else {
					logger.log(LogStatus.FAIL, "saveSettings  is not clicked successfully");	
				}
			
			
			String screenshotpath=BaseClass.addScreenshot(driver);
			logger.log(LogStatus.INFO, logger.addScreenCapture(screenshotpath));
			
			Thread.sleep(720000);
			
			switcheddriver.navigate().refresh();
			Thread.sleep(10000);
			String screenshotpath1=BaseClass.addScreenshot(driver);
			logger.log(LogStatus.INFO, logger.addScreenCapture(screenshotpath1));
			
			Boolean ispresent_loginpageusername=switcheddriver.findElements(loginpageusername).size()>0;
			if(ispresent_loginpageusername) {
				
				
				logger.log(LogStatus.PASS, "Page is timedout after exceeding page timeout time");
				
				}else {
					logger.log(LogStatus.FAIL, "Page is not timedout after exceeding page timeout time");	
				}
			
			
		}
		
		
		public void clickOnSystemObject(WebDriver driver,WebDriverWait wait) {
			wait.until(ExpectedConditions.presenceOfElementLocated(systemObject)).click();
			
		}
		
		public void clickOnTableTemplate(WebDriver driver,WebDriverWait wait,ExtentTest logger) {
			wait.until(ExpectedConditions.presenceOfElementLocated(TableTemplate)).click();
			logger.log(LogStatus.PASS, "Table template button is clicked successfully");
			
		}
		
		public Boolean validateifTableTemplateAlreadyExistsorNot(WebDriver driver,WebDriverWait wait,String Tabletemplate,ExtentTest logger) throws InterruptedException {
//			Thread.sleep(4000);
			try {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h4[@class='entity-info-name truncate green']/a/span[2][text()='"+Tabletemplate+"']")));
			}catch(Exception e) {
				
			}
			Boolean ispresent_tabletemplate=driver.findElements(By.xpath("//h4[@class='entity-info-name truncate green']/a/span[2][text()='"+Tabletemplate+"']")).size()>0;
			
			if(ispresent_tabletemplate) {
				logger.log(LogStatus.PASS, "Expected Table template is present");
			}else {
				logger.log(LogStatus.PASS, "Expected Table template is not present need to create new one");	
			}
			
			return ispresent_tabletemplate;
		}
		
		public void createtemplate(WebDriver driver,WebDriverWait wait,Boolean existornot,String Tabletemplate,String Templatenamenew,ExtentTest logger,String name,String valueType) throws InterruptedException {
			
			if(existornot) {
				driver.findElement(By.xpath("//h4[@class='entity-info-name truncate green']/a/span[2][text()='"+Tabletemplate+"']")).click();
				logger.log(LogStatus.PASS, "clicked successfully on the desired template");

				String[] names=name.split(",");
				int nameslength=names.length;
				
				String[] valueTypes=valueType.split(",");
				int nvalueTypeslength=valueTypes.length;
				
				for(int i=1;i<=nameslength;i++) {
					Thread.sleep(2000);
					Boolean ispresent_header=driver.findElements(By.xpath("//div[@class='header']//div[text()='"+names[i-1]+"']")).size()>0;
					if(ispresent_header) {
						logger.log(LogStatus.PASS, names[i-1]+" value is present as header already");
					}else {
						wait.until(ExpectedConditions.presenceOfElementLocated(AddColumnTabletemplate)).click();
						Thread.sleep(2000);
						int sizeof=driver.findElements(By.xpath("//tbody/tr")).size();
						Thread.sleep(2000);
						wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tbody/tr["+sizeof+"]//input[@placeholder='Enter text']"))).sendKeys(names[i-1]);
						
						wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tbody/tr["+sizeof+"]//select[@title='Text']"))).click();
						Thread.sleep(2000);
						org.openqa.selenium.support.ui.Select drpdown=new org.openqa.selenium.support.ui.Select(driver.findElement(By.xpath("//tbody/tr["+i+"]//select[@title='Text']")));
						drpdown.selectByVisibleText(valueTypes[i-1]);
						Thread.sleep(2000);
						logger.log(LogStatus.PASS, names[i-1]+" Field value is added successfully with its type");
						
					}
				}
				Thread.sleep(2000);
				
				wait.until(ExpectedConditions.presenceOfElementLocated(TableTemplateSave)).click();
				Thread.sleep(3000);
				for(int i=1;i<=nameslength;i++) {
					Boolean ispresent_header=driver.findElements(By.xpath("//div[@class='header']//div[text()='"+names[i-1]+"']")).size()>0;
					if(ispresent_header) {
						logger.log(LogStatus.PASS, names[i-1]+" valie is saved as header successfully");
					}else {
						logger.log(LogStatus.FAIL, names[i-1]+" valie is  not saved as header successfully");
					}
				}
				
			}else {
			wait.until(ExpectedConditions.presenceOfElementLocated(TableTemplateaddbutton)).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(nametabletemplate)).sendKeys(Tabletemplate);
			//can add code to add external table here by just pasing name here
			
			wait.until(ExpectedConditions.presenceOfElementLocated(createtablebutton)).click();
			
			wait.until(ExpectedConditions.presenceOfElementLocated(previewLable));
			
			wait.until(ExpectedConditions.presenceOfElementLocated(trashIcon)).click();
			
			String[] names=name.split(",");
			int nameslength=names.length;
			
			String[] valueTypes=valueType.split(",");
			int nvalueTypeslength=valueTypes.length;
			
			for(int i=1;i<=nameslength;i++) {
				Thread.sleep(2000);
			wait.until(ExpectedConditions.presenceOfElementLocated(AddColumnTabletemplate)).click();
			
			Thread.sleep(2000);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tbody/tr["+i+"]//input[@placeholder='Enter text']"))).sendKeys(names[i-1]);
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tbody/tr["+i+"]//select[@title='Text']"))).click();
			Thread.sleep(2000);
			org.openqa.selenium.support.ui.Select drpdown=new org.openqa.selenium.support.ui.Select(driver.findElement(By.xpath("//tbody/tr["+i+"]//select[@title='Text']")));
			drpdown.selectByVisibleText(valueTypes[i-1]);
			Thread.sleep(2000);
			logger.log(LogStatus.PASS, names[i-1]+" Field value is added successfully with its type");
			
			
			}
			
			Thread.sleep(2000);
			
			wait.until(ExpectedConditions.presenceOfElementLocated(TableTemplateSave)).click();
			Thread.sleep(6000);
			for(int i=1;i<=nameslength;i++) {
				Boolean ispresent_header=driver.findElements(By.xpath("//div[@class='header']//div[text()='"+names[i-1]+"']")).size()>0;
				if(ispresent_header) {
					logger.log(LogStatus.PASS, names[i-1]+" valie is saved as header successfully");
				}else {
					logger.log(LogStatus.FAIL, names[i-1]+" valie is  not saved as header successfully");
				}
			}
			
			}
			
			
			
		}
		
		public void clickontemplatecreation(WebDriver driver,WebDriverWait wait,String templatetype,String Templatename) throws InterruptedException {
			if(templatetype.equalsIgnoreCase("experiment")) {
				wait.until(ExpectedConditions.presenceOfElementLocated(experimenttemplate)).click();
				wait.until(ExpectedConditions.presenceOfElementLocated(experimenttemplates)).click();
				wait.until(ExpectedConditions.presenceOfElementLocated(experimenttemplatesplusutton)).click();
				wait.until(ExpectedConditions.presenceOfElementLocated(experimenttemplatename)).sendKeys(Templatename);
				
				wait.until(ExpectedConditions.presenceOfElementLocated(createtemplatebutton)).click();
				Thread.sleep(7000);
			}else if(templatetype.equalsIgnoreCase("Admin defined")) {
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@title='"+templatetype+"']"))).click();
				wait.until(ExpectedConditions.presenceOfElementLocated(experimenttemplates)).click();
				wait.until(ExpectedConditions.presenceOfElementLocated(admindefinedtemplatesplusutton)).click();
				wait.until(ExpectedConditions.presenceOfElementLocated(experimenttemplatename)).sendKeys(Templatename);
				
				wait.until(ExpectedConditions.presenceOfElementLocated(createtemplatebutton)).click();
				Thread.sleep(7000);
				
				driver.findElement(By.xpath("//span[@title='"+Templatename+"']")).click();
				
			}
			
		}
		
		public void exptemplateFieldsValidationCreation(WebDriver driver,WebDriverWait wait,ExtentTest logger,String field1,String field1YorN,String Mandatorydropdownvalue ) throws InterruptedException {
			
			wait.until(ExpectedConditions.presenceOfElementLocated(fieldsbutton)).click();
			
//			int fieldssize=driver.findElements(By.xpath("//table[@class='table table-striped table-hover']/tbody/tr")).size();
//			
//
//			
//			String[] fieldsonui= new String[fieldssize-1];
//			for(int j=0;j<fieldssize;j++) {
//				fieldsonui[j]=driver.findElement(By.xpath("//table[@class='table table-striped table-hover']/tbody/tr["+(j+1)+"]/td[1]")).getText();	
//				}
//	
//
//			
			
			String[] fields=field1.split(",");
			String[] mandatoryYorN=field1YorN.split(",");
			String[] mandatoryDropdown=Mandatorydropdownvalue.split(",");
			int fieldlength=fields.length;
			
			for(int i=0;i<fieldlength;i++) {
			if(fields[i].equalsIgnoreCase("Name")) {
				
				wait.until(ExpectedConditions.presenceOfElementLocated(namefield));
			Boolean ispresent_namefield=driver.findElements(namefield).size()>0;
			if(ispresent_namefield) {
				
				
				logger.log(LogStatus.PASS, "namefield is present");
				wait.until(ExpectedConditions.presenceOfElementLocated(namefieldedit)).click();
				if(mandatoryYorN[i].equalsIgnoreCase("yes")) {
					boolean ischecked=wait.until(ExpectedConditions.presenceOfElementLocated(ischeckednamefield)).isSelected();
					if(ischecked) {
						logger.log(LogStatus.PASS, "namefield is already set as mandatory");
						wait.until(ExpectedConditions.presenceOfElementLocated(cancelButton)).click();
					}else {
						wait.until(ExpectedConditions.presenceOfElementLocated(ischeckednamefield)).click();
						//write code to click on save and dropdown
					}
				}
				
				}else {
					logger.log(LogStatus.FAIL, "namefield is not present");	
					//code to create new field
				}
			}
			
			
			else if(fields[i].equalsIgnoreCase("Description")) {
				Boolean ispresent_descriptionfield=driver.findElements(descriptionfield).size()>0;
				if(ispresent_descriptionfield) {
					logger.log(LogStatus.PASS, "description is present");
					wait.until(ExpectedConditions.presenceOfElementLocated(descriptionfieldedit)).click();
					
					if(mandatoryYorN[i].equalsIgnoreCase("yes")) {
						boolean ischecked=wait.until(ExpectedConditions.presenceOfElementLocated(ischeckednamefield)).isSelected();
						if(ischecked) {
							logger.log(LogStatus.PASS, "description is already set as mandatory");
							wait.until(ExpectedConditions.presenceOfElementLocated(cancelButton)).click();
						}else {
							wait.until(ExpectedConditions.presenceOfElementLocated(ischeckednamefield)).click();
							Thread.sleep(3000);
							wait.until(ExpectedConditions.presenceOfElementLocated(isrequiredselect)).click();
							org.openqa.selenium.support.ui.Select drpdown=new org.openqa.selenium.support.ui.Select(driver.findElement(isrequiredselect));
						drpdown.selectByVisibleText(mandatoryDropdown[i]);
						Thread.sleep(10000);
							wait.until(ExpectedConditions.presenceOfElementLocated(saveButton)).click();
							
						}
					}else {
						boolean ischecked=wait.until(ExpectedConditions.presenceOfElementLocated(ischeckednamefield)).isSelected();
						if(!ischecked) {
							logger.log(LogStatus.PASS, "description is not set as  mandatory");
							wait.until(ExpectedConditions.presenceOfElementLocated(cancelButton)).click();
						}else {
							wait.until(ExpectedConditions.presenceOfElementLocated(ischeckednamefield)).click();
							
							
							wait.until(ExpectedConditions.presenceOfElementLocated(saveButton)).click();
							
						}
					}
					
					
					
				}else {
					//code to create new field
				}
			}else {
				
			}
			
			}
		}
}
