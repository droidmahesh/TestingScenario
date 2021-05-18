package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseclass.Setup;

public class JiraLoginTest extends Setup {
	
	
	
	@Test
	
	@Parameters({"username","password", "summary", "description"})
	
	public void Testlogin_fp(String username , String password, String summary, String description) throws InterruptedException {
		
		
			
		
			WebDriverWait wait = new WebDriverWait(driver, 30);
			
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
			pg.jiraUsername(username);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='login-submit']//span[contains(text(),'Continue')]")));
			pg.clickContinueBtn();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
			pg.jiraPassword(password);
			
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='login-submit']//span[@class='css-t5emrf']")));
			pg.clickLoginBtn();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='https://droidmahesh.atlassian.net/secure/BrowseProjects.jspa?=&selectedProjectType=software']//button[@role='presentation']//div//div[@class='sc-ifAKCX kwIxZS']//span[@role='presentation']//*[local-name()='svg']")));
			
			pg.clickjirasoft();

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='createGlobalItem']")));
			
			pg.jiracreatebtn_xp();
			
			Thread.sleep(3000);
			
		
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='summary']")));
			
			pg.textsummary(summary);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='description']")));
			
			pg.textarea(description);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='create-issue-submit']")));
			
			
			pg.createissueButton();
			
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='issue-created-key issue-link']/..")));
			
			pg.successmessage();
			Thread.sleep(3000);
			
			
			
			
	 
	 
	 
	}

}
