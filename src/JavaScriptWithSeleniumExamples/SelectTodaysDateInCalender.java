package JavaScriptWithSeleniumExamples;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectTodaysDateInCalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.yatra.com/");
		driver.findElement(By.id("BE_flight_depart_date")).click();
		driver.findElement(By.xpath("//td[contains(@class,'curent-date')]")).click();

	}

}
