package important_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Web_table {
	
	
	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/downloads/");
		
		driver.manage().window().maximize();
		
	int rowstable = driver.findElements(By.xpath("//table[@class='data-list']/tbody/tr")).size();
	
	System.out.println("print rows in a table : "+ rowstable);
	
	int columnstable = driver.findElements(By.xpath("//table[@class='data-list']/thead/tr/th")).size();
	
	System.out.println("print columns number :"+ columnstable);
	
	
	String value = driver.findElement(By.xpath("//table[@class='data-list']/tbody/tr[2]/td[1]")).getText();
	
	
	/*for (int r = 1; r < rowstable; r++) {
		
		for (int c = 1; c < columnstable; c++) {
			
			String tabletext = driver.findElement(By.xpath("//table[@class='data-list']/tbody/tr["+r+"]/td["+c+"]")).getText();
			
			System.out.print(tabletext+"   ");
			
			
		}
		
		System.out.println();
		
	}
	*/	
	
	
	for (int r = 1; r <rowstable; r++) {
		
	String text	= driver.findElement(By.xpath("//table[@class='data-list']/tbody/tr["+r+"]/td[1]")).getText();
	
	
	if(text.equals("Java")) {
		
		String printversion	= driver.findElement(By.xpath("//table[@class='data-list']/tbody/tr["+r+"]/td[2]")).getText();
		
		System.out.println(printversion);
		
		String printredate = driver.findElement(By.xpath("//table[@class='data-list']/tbody/tr["+r+"]/td[3]")).getText();
		
		System.out.println(printredate);
	}
		
	}
	
	
		
	}

}
