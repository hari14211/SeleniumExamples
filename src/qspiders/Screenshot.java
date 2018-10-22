package qspiders;

import java.io.File;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Screenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com/");
		EventFiringWebDriver e=new EventFiringWebDriver(driver);
		File srcfile=e.getScreenshotAs(OutputType.FILE);
		File destfile=new File("D:/actitime1.png");
		//FileUtils.copyFile(srcfile,destfile);
		
		

	}

}
