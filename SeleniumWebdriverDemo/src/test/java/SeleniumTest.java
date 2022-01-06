import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
						
		//Select Radio Button
		driver.findElement(By.xpath("*//input[@value = 'Male']")).click();
		
		//Select Radio Button
		driver.findElement(By.xpath("*//input[@value='Cricket']")).click();
		
		//Select drop-down
		driver.findElement(By.xpath("*//div[@id = 'msdd']")).click();
		driver.findElement(By.xpath("*//div[@id = 'msdd']/../div[2]/ul/li[1]/a[contains(text(), 'Arabic')]")).click();
				
		
		//Select Skills
		Select skills = new Select(driver.findElement(By.id("Skills")));
		skills.selectByVisibleText("Java");
		
		
		//Select Country
		Select country = new Select(driver.findElement(By.id("countries")));
		country.selectByVisibleText("BD");
						
		//Select Year
		Select year = new Select(driver.findElement(By.id("yearbox")));
		year.selectByVisibleText("1995");
				
		//Select Month
		Select Month = new Select(driver.findElement(By.xpath("*//select[@placeholder = 'Month']")));
		Month.selectByVisibleText("February");
						
		//Select Day
		Select Day = new Select(driver.findElement(By.xpath("*//select[@placeholder = 'Day']")));
		Day.selectByVisibleText("25");
								
						
		
		//Click to submit button
		driver.findElement(By.id("submitbtn")).submit();
		
		
		
		
		
		driver.close();
		driver.quit();

	}

}
