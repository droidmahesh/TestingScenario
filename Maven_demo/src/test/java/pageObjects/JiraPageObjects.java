package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Setup;

public class JiraPageObjects extends Setup {

	public  WebDriver Idriver;




	public JiraPageObjects(WebDriver rdriver) {

		Idriver = rdriver;

		PageFactory.initElements(Idriver, this);
	}


@FindBy(id="username")  public WebElement JiraEmail_xp;
@FindBy(xpath="//button[@id='login-submit']//span[contains(text(),'Continue')]") public  WebElement JiraContinueBtn;
@FindBy(id="password") public WebElement JiraPass_xp;
@FindBy(xpath="//button[@id='login-submit']//span[@class='css-t5emrf']") public WebElement JiraLoginClick_xp;
@FindBy (xpath="//a[@href='https://droidmahesh.atlassian.net/secure/BrowseProjects.jspa?=&selectedProjectType=software']//button[@role='presentation']//div//div[@class='sc-ifAKCX kwIxZS']//span[@role='presentation']//*[local-name()='svg']") public WebElement jirasoftwere_xp;
@FindBy (xpath="//button[@id='createGlobalItem']") public WebElement createbtn_xp;
@FindBy (xpath = "//input[@id='issuetype-field']") public WebElement bugtype_xp;
@FindBy (xpath="//input[@id='summary']") public WebElement summary_xp;
@FindBy (xpath="//textarea[@id='description']") public WebElement textarea_xp;
@FindBy (xpath="//input[@id='create-issue-submit']") public WebElement createissue_xp;
@FindBy (xpath="//a[@class='issue-created-key issue-link']/..") public WebElement successmsg;


	public void jiraUsername(String email) {

		JiraEmail_xp.sendKeys(email);

	}
	public void clickContinueBtn()
	{
		JiraContinueBtn.click();
	}

	public void jiraPassword(String password) {


		JiraPass_xp.sendKeys(password);
	}

	public void clickLoginBtn()
	{
		JiraLoginClick_xp.click();
	}
	
	public void clickjirasoft() {
		
		jirasoftwere_xp.click();
	}
	
	public void jiracreatebtn_xp() {
		
		createbtn_xp.click();
	}

	
	public void textsummary(String text)  {
		
		
		summary_xp.sendKeys(text);
	}
	
	public void textarea(String textarea) {
		
		textarea_xp.sendKeys(textarea);
	}
	
	public void createissueButton() {
		
		createissue_xp.click();

		
	}
	
	
	public void successmessage() {
		
		
	String printmsg = successmsg.getText();
	
	System.out.println(printmsg);
	}
}