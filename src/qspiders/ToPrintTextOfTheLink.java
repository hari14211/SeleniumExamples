package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToPrintTextOfTheLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		WebElement
		v1=driver.findElement(By.xpath("//*[@id=\"birthday-help\"]"));
		String text = v1.getText();
		System.out.println(text);

	}

}
