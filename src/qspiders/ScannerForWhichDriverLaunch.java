package qspiders;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ScannerForWhichDriverLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Browser?GC/FF/IE");
		String browser=sc.next();
		WebDriver driver;
		
		if(browser.equals("GC")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\harisfdc49\\Downloads\\chromedriver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equals("IE")) {
			System.setProperty("webdriver.ie.driver","C:\\Users\\harisfdc49\\Downloads\\IEDriverServer\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			
		}
		else {
			driver=new FirefoxDriver();
		}
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		

	}

}
