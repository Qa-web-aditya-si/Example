package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import Utilities.ReadDataFromConfig;

public class Setup {
	
	
	  static WebDriver driver;
	
	ReadDataFromConfig read = new ReadDataFromConfig();
	
	String baseurl =  read.geturl();
	
	
	@BeforeClass
	public void setupbase() {
		
		driver = new ChromeDriver();
		
		
		
		
		
		
		
	}


	public static WebDriver getDriver() {
		return driver;
	}


	public static void setDriver(WebDriver driver) {
		Setup.driver = driver;
	}

}
