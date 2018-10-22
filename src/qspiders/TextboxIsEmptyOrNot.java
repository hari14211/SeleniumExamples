package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextboxIsEmptyOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		WebElement em=driver.findElement(By.id("email"));
		String t = em.getAttribute("value");
		if(t.length()==0)
		{
		System.out.println("Textbox present in Facebook login page is empty");
		}
		else
		{
		System.out.println("Textbox present in Facebook login page is not empty");
		}

	}

}
