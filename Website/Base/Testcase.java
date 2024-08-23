package Base;

import org.testng.annotations.Test;

import PageObject.Login;
import PageObject.Profile;

public class Testcase extends Setup{
	
	
	@Test()
	public void Filter() throws InterruptedException {
		driver.get(baseurl);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		Profile pro = new Profile(driver);
		pro.loginvalidation();
		
	}
	
	
	

}
