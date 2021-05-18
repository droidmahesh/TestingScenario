package important_programs;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Broken_links {
	
	static WebDriver driver;
	
	@BeforeMethod
	
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\lib folder\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
		
	@Test
	
	public void testOrange() throws InterruptedException, IOException {
		
	WebElement user	= driver.findElement(By.xpath("//input[@id='txtUsername']"));
	
	user.clear();
	
	user.sendKeys("Admin");
	
	Thread.sleep(2000);
		
	WebElement pass	= driver.findElement(By.xpath("//input[@id='txtPassword']"));
	
	pass.clear();
	
	pass.sendKeys("admin123");
	
	Thread.sleep(2000);
	
	
	driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	
	Thread.sleep(2000);
	
	List<WebElement> brokenlinks = driver.findElements(By.xpath("//a"));
	
	System.out.println(brokenlinks.size());
	
	
	
	for (int i = 0; i <= brokenlinks.size(); i++) {
		
		 WebElement links  = brokenlinks.get(i);
		 
		 String url = links.getAttribute("href");
		 
		 URL ul = new URL(url);
		 
		 HttpURLConnection httpcont = (HttpURLConnection) ul.openConnection();
		 
		 Thread.sleep(2000);
		 
		 httpcont.connect();
		 
		 
		 // get responsecode 
		 
		int responsecode = httpcont.getResponseCode();
		
		if(responsecode >= 400 ) {
			
			System.out.println(url+"link will be broken");
			
		} else {
			
			System.out.println(url+"this is active link");
			
			
		}
		
		 
		 
		
	}
	
	
	
	
	}
		
		
	@AfterMethod
	
	public void closebrowser() {
		
		driver.close();
	}
		
	

}
