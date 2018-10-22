package qspiders;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class GFILaunchers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harisfdc49\\Downloads\\chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.ie.driver","C:\\Users\\harisfdc49\\Downloads\\IEDriverServer\\IEDriverServer.exe");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\harisfdc49\\Downloads\\geckodriver\\geckodriver.exe");
		//InternetExplorerDriver driver=new InternetExplorerDriver();
		//WebDriver driver=new FirfoxDriverDriver();
		WebDriver driver=new ChromeDriver();
		//ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com/");
		Thread.sleep(2000);
		
		//Resize the browser
		Dimension d=new Dimension(200, 200);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		
		//Move the browser
		Point p=new Point(300, 200);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		
		//Maximize the browser
		driver.manage().window().maximize();

	}

}
