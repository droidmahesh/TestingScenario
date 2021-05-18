package important_programs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggest_dropdown {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.bing.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='sb_form_q']")).sendKeys("selenium");
		
		
		List<WebElement> listsearch = driver.findElements(By.xpath("//li[@class='sa_sg']//span"));
		
		Thread.sleep(2000);
		
		System.out.println("print size :"+listsearch.size());
		
		
		
		for(WebElement ele : listsearch) {
			
			
			if(ele.getText().contains("download")) {
				
				Thread.sleep(2000);
				
				ele.click();
				
				break;
			}
		}
		
		
		driver.close();
	}
}
