package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FontSizeOfTextbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using getCssValue
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.vtiger.com");
		WebElement un = driver.findElement(By.id("username"));
		String s = un.getCssValue("font-size");
		System.out.println(s);
		
		//background colour of textbox
		WebDriver driver1=new FirefoxDriver();
		driver1.get("http://localhost/login.do");
		WebElement un1=driver.findElement(By.id("username"));
		System.out.println(un1.getCssValue("color"));
		
		
		driver.close();

	}

}
