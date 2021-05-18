package important_programs;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hashmap_selenium {


	static WebDriver driver;



	public static HashMap<String , String> logindata() {



		HashMap<String , String> hm = new HashMap<String , String>();

		hm.put("x" , "mercury@mercury");

		hm.put("y", "mercury1@mercury");

		hm.put("z", "mercury@mercury");


		return hm;


	}





	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\lib folder\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get("http://demo.guru99.com/test/newtours");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


		String credentials = logindata().get("x");

		String arr[] = credentials.split("@");

		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(arr[0]);

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(arr[1]);

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		
		if(driver.getTitle().contains("Login: Mercury Tours")) {
			
			System.out.println("test is passed");
			
			
		} else 
			
			
			System.out.println("test is failed");




	}

}
