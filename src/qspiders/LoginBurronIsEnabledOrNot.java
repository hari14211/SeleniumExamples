package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginBurronIsEnabledOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		WebElement log=driver.findElement(By.id("u_0_v"));
		if(log.isEnabled())
		{
		System.out.println("Login button is enabled");
		}
		else
		{
		System.out.println("Login button is disabled");
		}
		
		

	}

}
