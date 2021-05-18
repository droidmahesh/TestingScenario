package important_programs;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Testtt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C://lib folder//drivers//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/intl/en-GB/gmail/about/");
		driver.findElement(By.xpath("(//a[contains(@ga-on,'click')])[6]")).click();
		//driver.manage().window().maximize();
		
		/*driver.findElement(By.xpath("//a[@class='_1_3w1N'][contains(.,'Login')]")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@class,'2- VJZDxU')]")).sendKeys("9440124120");
		driver.findElement(By.xpath("//input[contains(@class,'_2IX_2- _3mctLh VJZDxU')]")).sendKeys("chantivenky");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		*/
		
		
		
	}

}
