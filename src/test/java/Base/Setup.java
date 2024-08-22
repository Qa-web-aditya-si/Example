package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import Utilities.ReadDataFromConfig;

public class Setup {
	
	
	  static WebDriver driver;
	
	ReadDataFromConfig read = new ReadDataFromConfig();
	
	String baseurl =  read.geturl();
	
	StringBuffer sb = new StringBuffer();
	
	
	@BeforeClass
	public void setupbase() {
		
		//driver = new FirefoxDriver();
		
		StringBuffer a= sb.append("A");
		System.out.println(a);
		
		
		
		
	}


	
}
