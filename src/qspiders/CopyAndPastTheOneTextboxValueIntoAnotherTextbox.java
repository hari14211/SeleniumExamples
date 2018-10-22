package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CopyAndPastTheOneTextboxValueIntoAnotherTextbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/Demo2.html");
		WebElement v1=driver.findElement(By.id("t1"));
		v1.sendKeys(Keys.CONTROL+"a");
		v1.sendKeys(Keys.CONTROL+"c");
		WebElement v2=driver.findElement(By.id("t4"));
		v2.clear();
		v2.sendKeys(Keys.CONTROL+"v");

	}

}
