package JavaScriptWithSeleniumExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToPrintAllTextLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com/");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		for(int i=0;i<allLinks.size();i++) {
			String text=allLinks.get(i).getText();
			System.out.println(text);
		}

	}

}
