package flipKartlogin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseClass.SetUp;
import locators_fp.Flipkartelements;
import utilities.logincredential;

public class LoginTest extends SetUp{

	WebDriverWait wait = new WebDriverWait(driver, 30);
	
	@Test

	public void Flipkart_Login() throws InterruptedException, IOException {



		driver.findElement(By.xpath(Flipkartelements.username_fp)).sendKeys(logincredential.fplogin("C:\\Users\\maheshchanti\\workspace\\cucumber_project\\java_demo\\config\\configuration.properties", "username"));
		driver.findElement(By.xpath(Flipkartelements.password_fp)).sendKeys(logincredential.fplogin("C:\\Users\\maheshchanti\\workspace\\cucumber_project\\java_demo\\config\\configuration.properties", "password"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Flipkartelements.login_fp)));
		driver.findElement(By.xpath(Flipkartelements.login_fp)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Flipkartelements.mobiles_xp)));
		driver.findElement(By.xpath(Flipkartelements.mobiles_xp)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Flipkartelements.electtonics_xp)));
		WebElement elec =driver.findElement(By.xpath(Flipkartelements.electtonics_xp));
		Actions act = new Actions(driver);
		act.moveToElement(elec).build().perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Flipkartelements.mi_xp)));
		driver.findElement(By.xpath(Flipkartelements.mi_xp)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Flipkartelements.mimobile4gb_fp)));
		driver.findElement(By.xpath(Flipkartelements.mimobile4gb_fp)).click();
		WebElement minprice	= driver.findElement(By.xpath(Flipkartelements.min_fp));
		Select sl = new Select(minprice);
		sl.selectByVisibleText("₹10000");
		WebElement maxprice = driver.findElement(By.xpath(Flipkartelements.max_fp));
		Select slc = new Select(maxprice);
		slc.selectByVisibleText("₹16000");
		List<WebElement> mobileLinks= driver.findElements(By.xpath(Flipkartelements.mobilelinks_xp));
		List<WebElement> mobileTitles= driver.findElements(By.xpath(Flipkartelements.mobiletitles_xp));
		List<WebElement> mobilePrice= driver.findElements(By.xpath(Flipkartelements.mobileprices_xp));
		String mtitle=mobileTitles.get(0).getText();
		System.out.println(mtitle);
		String price = mobilePrice.get(0).getText();
		System.out.println(price);
		mobileLinks.get(0).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Flipkartelements.mobiletitle_xp)));
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		//switch to new tab
		driver.switchTo().window(newTb.get(1));
		String mobiletitle= driver.findElement(By.xpath(Flipkartelements.mobiletitle_xp)).getText();
		System.out.println(mobiletitle);
		String mobileprice= driver.findElement(By.xpath(Flipkartelements.mobileprice_xp)).getText();
		System.out.println(mobileprice);


		if(mobiletitle.contains(mtitle)){
			System.out.println("PASS Title Matched");
		}
		if(mobileprice.contains(price)){
			System.out.println("PASS Price Matched");
		}





	}

}
