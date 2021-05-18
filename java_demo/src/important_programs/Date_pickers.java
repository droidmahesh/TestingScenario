package important_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Date_pickers {

	public static void main(String[] args) {

		ChromeOptions  options = new ChromeOptions();
		options.addArguments("--disable-notifications");


		WebDriverManager.chromedriver().setup();


		WebDriver driver = new ChromeDriver(options);


		driver.get("https://www.redbus.in/");

		driver.manage().window().maximize();

		String year = "2021";

		String month = "July";

		String dt = "10";


		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();




		while(true) {


			String title = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();


			String arr[] = title.split(" ");

			String armonth = arr[0];

			String aryear = arr[1];	



			if(armonth.equalsIgnoreCase("july") & aryear.equals("2021"))

				break;
			else

				driver.findElement(By.xpath("//td[@class='next']")).click();

		}

		List<WebElement>  dates = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']/tbody/tr/td"));


		for(WebElement ele : dates) {


			String dat =  ele.getText();


			if(dat.equals(dt)) {

				ele.click();

				break;
			}


		}

		driver.close();


	}

}
