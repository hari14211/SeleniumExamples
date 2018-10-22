package JavaScriptWithSeleniumExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllValuesInListBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com/");
		WebElement listBox = driver.findElement(By.name("birthday_day"));
		Select select=new Select(listBox);
		List<WebElement> allOptions = select.getOptions();
		for(int i=0;i<allOptions.size();i++)
		{
		WebElement option = allOptions.get(i);
		String text = option.getText();
		System.out.println(text);
		}

	}

}
