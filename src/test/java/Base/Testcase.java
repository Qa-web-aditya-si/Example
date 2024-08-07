package Base;

import org.testng.annotations.Test;

import PageObject.Login;

public class Testcase extends Setup{
	
	
	@Test
	public void launch() throws InterruptedException {
		driver.get(baseurl);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		Login lg = new Login(driver);
		lg.loginvalidation();
		
	}
	
	

}
