package JavaScriptWithSeleniumExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ScrollThePageToDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/search?q=google&oq=google&aqs=chrome..69i57j69i60l2j0l2j69i60.1714j0j7&sourceid=chrome&ie=UTF-8");
		RemoteWebDriver r= (RemoteWebDriver) driver;
		String c="window.scrollTo(0,document.body.scrollHeight)";
		r.executeScript(c);

	}

}
