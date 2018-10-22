package qspiders;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirfoxBrowserWithAddons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.profile", "default");
		WebDriver driver=new FirefoxDriver();
		driver.get("www.google.com");
		

	}

}
