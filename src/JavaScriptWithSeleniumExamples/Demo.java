package JavaScriptWithSeleniumExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com/");
		RemoteWebDriver r=(RemoteWebDriver) driver;
		r.executeScript("alert('hi')");
		

	}

}
