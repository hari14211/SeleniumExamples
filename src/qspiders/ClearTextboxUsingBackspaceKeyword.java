package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClearTextboxUsingBackspaceKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/Demo2.html");
		WebElement tv=driver.findElement(By.id("t4"));
		String st=tv.getAttribute("value");
		int count=st.length();
		for(int i=1;i<=count;i++)
		tv.sendKeys(Keys.BACK_SPACE);

	}

}
