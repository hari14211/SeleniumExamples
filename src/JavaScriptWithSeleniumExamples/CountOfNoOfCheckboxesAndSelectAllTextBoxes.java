package JavaScriptWithSeleniumExamples;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class CountOfNoOfCheckboxesAndSelectAllTextBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com/");
		List<WebElement> allchkbox = driver.findElements(By.xpath("//input"));
		int count=allchkbox.size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
			WebElement chk=allchkbox.get(i);
			chk.click();
			
			
		}
		

	}

}
