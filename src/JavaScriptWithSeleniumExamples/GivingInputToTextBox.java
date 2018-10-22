package JavaScriptWithSeleniumExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GivingInputToTextBox {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//Textbox disabled also
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.vtiger.com/");
		RemoteWebDriver r= (RemoteWebDriver) driver;
		String c="document.getElementById('username').value='admin'";
		r.executeScript(c);

	}

}
