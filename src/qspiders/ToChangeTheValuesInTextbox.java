package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToChangeTheValuesInTextbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/Demo2.html");
		WebElement tv=driver.findElement(By.id("t3"));
		tv.clear();
		tv.sendKeys("Webdriver");

	}

}
