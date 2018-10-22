package JavaScriptWithSeleniumExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SomeOfNumbersInTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		int sum=0;
		driver.get("http://www.google.com");
		List<WebElement> allCells = driver.findElements(By.xpath("//td"));
		int count=allCells.size();
		for(int i=0;i<count;i++)
		{
		String text = allCells.get(i).getText();
		try
		{
		int x = Integer.parseInt(text);
		System.out.println(x); //prints only numbers
		sum=sum+x;
		}
		catch(NumberFormatException e)
		{
		//System.out.println(text); //Prints only strings
		}
		System.out.println("Sum is: "+sum);

	}
	}	

}
