import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		//Entering First Name and Last Name
		driver.findElement(By.xpath("*//input[@placeholder='First Name']")).sendKeys("Mehedi Hasan");
		driver.findElement(By.xpath("*//input[@placeholder='Last Name']")).sendKeys("Rony");
		
		//Entering into Textarea
		driver.findElement(By.xpath("*//textarea[@ng-model=\"Adress\"]")).sendKeys("This is Textarea This is Textarea This is Textarea");
		
		//Entering into Email
		driver.findElement(By.xpath("*//input[@ng-model = 'EmailAdress']")).sendKeys("mehedi@gmail.com");
		
		//Entering into Phone Number
		driver.findElement(By.xpath("*//input[@ng-model='Phone']")).sendKeys("0168270663");
		
		//Entering into First Password
		driver.findElement(By.xpath("*//input[@id='firstpassword']")).sendKeys("aBc@2022");
				
		//Entering into Confirm Password
		driver.findElement(By.xpath("*//input[@id='secondpassword']")).sendKeys("aBc@2022");
						
		
		//driver.close();
		//driver.quit();

	}

}
