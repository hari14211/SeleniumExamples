package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToActimApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		//cssSelector
		/*<html>
		<body>
		UN<input type="text">
		PW<input type="password">
		</body>
		</html>*/
		
		//Tag[AttributeName=’AttributeValue’]
		//input[type="password"]
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("manager");
		
		//xpath
		/*<html>
		<body>
		FN<input type="text">
		LN<input type="text">
		</body>
		</html>*/
		
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("a");
		driver.findElement(By.xpath("/html/body/input")).sendKeys("c");
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("b");
		
		//tag[@AttributeName=’AttributeValue’]
		//input[@id=’username’] Note: We can use more than one attribute in an ‘xpath’ expression:
		//input[@id=’username’] [@type =’text’]
		//input[@id=’username’] AND [@type =’text’]
		//input[@id=’username’] OR [@type =’text’]
		
		//div[text()=’Login ‘]
		//div[text()=’Users’]
		//td[text()=’Java’]
		//div[@class=’label’][text()=’Users’]
		
		/*<html>
<body>
<botton type="&nbsp submit &nbsp">&nbsp Sign in &nbsp</button>
</body>
</html>
HTML code displayed in firebug:
<button type=” submit “> Sign in </button>*/
		
		//tag [contains(@AttributeName,’AttributeValue’)]
		//tag [contains(text(), ‘textValue’)]
		//button[contains(@type, ‘submit’)]
		//button[contains(@text, ‘Sign in’)]
		//input[contains(@value, ‘Create Type of Work’)]
		
		//Ex: <button>&nbsp Sign &nbsp in &nbsp</button>
		//Xpath: //button [contains(text(),’Sign’)][contains(text(),’in’)]
		//We use ‘contains’ function if there is a ‘Non Breakable Space’ in attribute value or text value.
		//We use ‘contains’ function when the element is dynamic (some part of its value keeps changing)
		

	}

}
