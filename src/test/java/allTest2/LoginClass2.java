package allTest2;

import java.security.PublicKey;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base2.ReadConfig2;

public class LoginClass2 {

	WebDriver dr ;
	static ReadConfig2 config2= new ReadConfig2();
	
		@BeforeTest 
		public void setup () {
			
			dr= new ChromeDriver();
			dr.get(config2.getUrl());
			dr.manage().window().maximize();
			dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
					
	}

		
		
		@Test ()
		public void login2() {
			WebElement user= dr.findElement(By.id("email"));
			WebElement pass=dr.findElement(By.id("pass"));
			
			user.sendKeys(config2.getUser());
			pass.sendKeys(config2.getpassword());
				
		}
		
	@AfterTest
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(2000);
		dr.close();
		}
	}

