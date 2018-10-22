package qspiders;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageLoadedTimeWithInThreeSeconds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(1,TimeUnit.SECONDS);
		try{
			driver.get("http://localhost/login.do");
			System.out.println("Page is loaded within 3sec");
			}
			catch(TimeoutException e)
			{
			System.out.println("Page is not loaded within 3sec");
			}

	}

}
