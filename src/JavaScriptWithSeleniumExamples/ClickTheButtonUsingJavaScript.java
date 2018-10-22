package JavaScriptWithSeleniumExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ClickTheButtonUsingJavaScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com/");
		RemoteWebDriver r= (RemoteWebDriver) driver;
		String c="document.getElementById('loginbutton').click()";
		r.executeScript(c);
		
		

	}

}
