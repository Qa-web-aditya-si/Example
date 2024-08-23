package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;



public class Login{

	
	WebDriver driver;
	public Login(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void loginvalidation() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//button[@class='btn-submit']")).click();
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("aditya.bhosle@sportzinteractive.net");
		
		driver.findElement(By.xpath("//button[@aria-label='submit']")).click();
		
		Thread.sleep(10000);
		
		driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&emr=1&ltmpl=default&ltmplcache=2&osid=1&passive=true&rm=false&scc=1&service=mail&ss=1&ifkv=AdF4I74_oQcxY85IZQjWJuKPtfhoxQMfoPJwf_bsTCXDxOHWfrGBCsSlwM9_9O25m9McqR9bnsWC&ddm=0&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("adi1500jan@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 BqKGqe Jskylb TrZEUc lw1w4b']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Aditya@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 BqKGqe Jskylb TrZEUc lw1w4b']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//tr[@id=':2a']")).click();
		driver.findElement(By.xpath("(//span[@class='checkmark'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		driver.findElement(By.xpath("(//span[@class='checkmark'])[3]")).click();
		
		driver.findElement(By.xpath("//button[@aria-label='submit']")).click();
		
		
	}

	
}
