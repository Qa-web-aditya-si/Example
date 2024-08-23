package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Base.Setup;

public class Profile {

	WebDriver driver;

	public Profile(WebDriver driver) {
		this.driver = driver;

	}

	public void loginvalidation() throws InterruptedException {

		driver.findElement(By.xpath("//button[@aria-label='open main menu button']//*[name()='svg']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='IPL News']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Filters']")).click();

		driver.findElement(By.xpath("//div[@id='Season']//p[@class='title'][normalize-space()='aLL']")).click();

		driver.findElement(By.xpath("//button[normalize-space()='2024']")).click();

		driver.findElement(By.xpath("//span[normalize-space()='Apply Filters']")).click();

		String expectdate = driver.findElement(By.xpath("//span[contains(text(),'29 Apr, 2024')]")).getText();
		String actualdate = "2024";

		if (expectdate.contains(actualdate)) {
			System.out.println("data is from 2024");
		} else {
			System.out.println("Data doesn't match with 2024 season");
		}

	}

}
