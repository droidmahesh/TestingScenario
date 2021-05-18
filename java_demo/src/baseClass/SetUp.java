package baseClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.logincredential;

public class SetUp {


	public WebDriver driver;




	@BeforeMethod

	@Parameters({"browser"})

	public void OpenBrowser(String browser) throws IOException {

		if(browser.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

		}  else if(browser.equalsIgnoreCase("firefox")){


			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		}


		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get(logincredential.fplogin("C:\\Users\\maheshchanti\\workspace\\cucumber_project\\java_demo\\config\\configuration.properties", "url"));

	}


	@AfterMethod

	public void tearDown() {


		driver.close();
	}



}
