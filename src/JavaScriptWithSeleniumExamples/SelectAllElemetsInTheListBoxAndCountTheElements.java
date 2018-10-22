package JavaScriptWithSeleniumExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllElemetsInTheListBoxAndCountTheElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com/");
		WebElement listBox = driver.findElement(By.name("birthday_day"));
		Select select=new Select(listBox);
		List<WebElement> allOptions = select.getOptions();
		int count=allOptions.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
		select.selectByIndex(i);
		}
		select.deselectAll();

	}

}
