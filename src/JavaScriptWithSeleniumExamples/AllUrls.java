package JavaScriptWithSeleniumExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllUrls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com/");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		for(WebElement link:allLinks)
		{
		String url = link.getAttribute("href");
		System.out.println(url);
		}

	}

}
