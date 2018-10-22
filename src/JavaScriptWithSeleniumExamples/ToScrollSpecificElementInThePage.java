package JavaScriptWithSeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;



public class ToScrollSpecificElementInThePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facbook.com/");
		driver.manage().window().maximize();
		RemoteWebDriver r= (RemoteWebDriver) driver;
		WebElement el=driver.findElement(By.linkText("Business »"));
		System.out.println(el.getText());
		Point l = el.getLocation();
		int y=l.getY();
		String s="window.scrollTo(0,"+y+")";
		r.executeScript(s);

	}

}
