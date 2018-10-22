package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DiffernetWaysOfClickingButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1. click()
		2. sendKeys()
		3. submit()//this works only if button code is submit
		4. javascript
		5. AutoIt
		6. Robot Class*/
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.vtiger.com");
		String xp="//button[text()='Sign in']";
		WebElement btn = driver.findElement(By.xpath(xp));
		btn.sendKeys(Keys.ENTER);

	}

}
