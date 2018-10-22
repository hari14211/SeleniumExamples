package JavaScriptWithSeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.actimind.com");
		WebElement menu = driver.findElement(By.xpath("/html/body/header/div/div/div/nav/ul/li[2]/a"));
		Actions actions=new Actions(driver);
		actions.moveToElement(menu).perform();
		driver.findElement(By.linkText("Web Crawling")).click();

	}

}
