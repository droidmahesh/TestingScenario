package baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.JiraPageObjects;

public class Setup {
	
	
	 public WebDriver driver;
	 
	 public JiraPageObjects pg;
	 
	
	
	@BeforeMethod
	
	public void OpenBrowserr() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://id.atlassian.com/login?continue=https%3A%2F%2Fstart.atlassian.com%2F&prompt=login");
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		pg = new JiraPageObjects(driver);
		
		
		
	
		
		
		
	}
	
/*	@Test
	public void display()
	{
		System.out.println("Hai");
	}*/
	
	
	@AfterMethod
	
	public void tearDown() {
		
		driver.close();
	}
	

}
