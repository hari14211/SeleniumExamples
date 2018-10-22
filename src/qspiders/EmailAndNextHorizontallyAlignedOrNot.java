package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EmailAndNextHorizontallyAlignedOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.gmail.com");
		WebElement em=driver.findElement(By.id("Email"));
		Point p1=em.getLocation();
		
		int x1=p1.getX();
		System.out.println("X value of email field: "+x1);
		WebElement nxt=driver.findElement(By.id("next"));
		Point p2=nxt.getLocation();
		int x2=p2.getX();
		System.out.println("X value of next button: "+x2);
		if(x2-x1<=0)
		{
		System.out.println("Email textbox and next button aligned horizontally");
		}
		else
		{
		System.out.println("Not alligned Horizontally");
		}
		
		
		

	}

}
