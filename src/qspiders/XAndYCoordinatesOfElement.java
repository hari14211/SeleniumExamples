package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XAndYCoordinatesOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		WebElement em=driver.findElement(By.id("email"));
		Point p=em.getLocation();
		System.out.println("X coordinate (in pixels): "+p.getX());
		System.out.println("Y coordinate (in pixels): "+p.getY());

	}

}
