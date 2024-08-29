package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import microsoft.Microsoft_Elements;

public class Utilities {
	
	
	public static WebDriver driver;
	
	public Microsoft_Elements ms_ele;

	
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	} 
	
	public static void goBack() {
		driver.navigate().back();
	}
	
	public static void stopDriver() {
		driver.close();
		driver.quit();
	}
	

	public Microsoft_Elements getMicrosoft_ElementsPage() {
		return (ms_ele == null) ? ms_ele = new Microsoft_Elements(driver) : ms_ele;
	}

}
