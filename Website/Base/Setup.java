package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import Utilities.ReadDataFromConfig;

public class Setup {
	
	
	  static WebDriver driver;
	
	ReadDataFromConfig read = new ReadDataFromConfig();
	
	String baseurl =  read.geturl();
	
	StringBuffer sb = new StringBuffer();
	
	
	@BeforeClass
	@Parameters({"browser"})
	public void setupbase(String webbrowser) {
		
		if(webbrowser.contains("chrome")) {
			driver = new ChromeDriver();		
		}
		if(webbrowser.contains("firefox")) {
			driver = new FirefoxDriver();		
		}
		
		
		
		
	}


	
}
