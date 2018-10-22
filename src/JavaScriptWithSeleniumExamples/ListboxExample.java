package JavaScriptWithSeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ListboxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com/");
		WebElement listBox = driver.findElement(By.name("birthday_day"));
		Select select=new Select(listBox);
		boolean v = select.isMultiple();
		//returns true if it is multiselect listbox
		//returns false if it is single select listbox
		System.out.println(v);
		//selects specific option
		select.selectByVisibleText("10");
		select.selectByIndex(3);
		select.selectByValue("10");
		//deselect specific option
		select.deselectByVisibleText("10");
		select.deselectByIndex(3);
		select.deselectByValue("10");

	}

}
