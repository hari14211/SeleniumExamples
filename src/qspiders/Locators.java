package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WebDriver driver=new FirefoxDriver();
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\harisfdc49\\Desktop\\Demo.html");
		By b=By.tagName("a");
		WebElement e = driver.findElement(b);
		e.click();
		//tagName
		driver.findElement(By.tagName("a")).click();
		//id
		driver.findElement(By.id("a1")).click();
		//name
		driver.findElement(By.name("n1")).click();
		//className
		driver.findElement(By.className("c1")).click();
		//linkText
		driver.findElement(By.linkText("actitime")).click();
		//partialLinkText
		driver.findElement(By.partialLinkText("acti")).click();
		//this locator is used to handle dynamic links
		driver.findElement(By.partialLinkText("Inbox")).click();
		driver.findElement(By.partialLinkText("BuildNo")).click();

	}

}
