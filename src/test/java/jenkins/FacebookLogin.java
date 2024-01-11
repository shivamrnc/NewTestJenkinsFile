package jenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.FacebookLoginPage;



public class FacebookLogin {
	WebDriver driver = null;
	
	static FacebookLoginPage Facebook;
	
	@BeforeTest
	public void FacebookLogin(){
		
		String projectPath = System.getProperty("user.dir");
//		System.out.println("Project path is : "+projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver.exe");
	}

		
	
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\shivamchoubey\\eclipse-workspace\\Jenkins\\drivers\\chromedriver.exe");
@Test
	public void loginpage() {
		WebDriver driver = new ChromeDriver();
		Facebook= new FacebookLoginPage(driver);
		
		driver.navigate().to("https://www.google.com/search?q=facebook&rlz=1C1UEAD_enIN1065IN1066&oq=face&gs_lcrp=EgZjaHJvbWUqDAgAECMYJxiABBiKBTIMCAAQIxgnGIAEGIoFMhMIARAuGIMBGMcBGLEDGNEDGIAEMgkIAhBFGDkYgAQyDQgDEAAYgwEYsQMYgAQyDQgEEAAYgwEYsQMYgAQyDQgFEAAYgwEYsQMYgAQyDQgGEAAYgwEYsQMYgAQyDQgHEAAYgwEYsQMYgAQyCggIEAAYsQMYgAQyBwgJEAAYjwLSAQkyODQxajBqMTWoAgCwAgA&sourceid=chrome&ie=UTF-8");
           Facebook.clicklogin();
           Facebook.enterUsername(null);
           Facebook.enterPassword(null);
           Facebook.Signin();


//		driver.findElement(By.className("l")).sendKeys(Keys.ENTER);
//		driver.findElement(By.id("email")).sendKeys("chaubeys123456@gmail.com");
//		driver.findElement(By.id("pass")).sendKeys("Abc@123456");
//		driver.findElement(By.id("loginbutton")).click();
	}
	@AfterTest
	public void teardown() {
		//System.out.println("Inside Login - browser is close");

	
		//driver.close();
		

	}}
