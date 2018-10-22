package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WidthAndHeightOfTheTextBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.gmail.com");
		WebElement em=driver.findElement(By.id("Email"));
		Dimension s = em.getSize();
		System.out.println("Height of the textbox: "+s.getHeight());
		System.out.println("Width of the textbox: "+s.getWidth());

	}

}
