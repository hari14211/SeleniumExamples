package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckboxAndRadioBurronSelectedOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		WebElement chkbox=driver.findElement(By.id("persist_box"));
		WebElement radbtn=driver.findElement(By.xpath("//*[@id=\"u_0_9\"]"));
		/*if(chkbox.isSelected())
		{
		System.out.println("Checkbox is selected");
		}
		else
		{
		System.out.println("Checkbox is deselected");
		}*/
		if(radbtn.isSelected())
		{
		System.out.println("Radio button is selected");
		}
		else
		{
		System.out.println("Radio button is deselected");
		}

	}

}
