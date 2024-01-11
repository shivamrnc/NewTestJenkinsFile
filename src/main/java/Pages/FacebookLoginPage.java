
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FacebookLoginPage {

	protected WebDriver driver;



	private By btn_login = By.className("l");
	private By txt_username = By.name("email");



	private By txt_password = By.id("pass");







	private By btn_signin = By.id("loginbutton");



	public FacebookLoginPage(WebDriver driver) {
		this.driver= driver;
	}

		public void clicklogin() {
			driver.findElement(btn_login).sendKeys(Keys.RETURN);
		}



	public void enterUsername(String username) {

		driver.findElement(txt_username).sendKeys("chaubeys123456@gmail.com");


	}




	public void enterPassword(String password) {

		driver.findElement(txt_password).sendKeys("Abc@12345");
	}




	public void Signin() {

		driver.findElement(btn_signin ).sendKeys(Keys.RETURN);
	}







		public void loginValidUser(String username , String password) {
			
			driver.findElement(btn_login).sendKeys("l");
			
		driver.findElement(txt_username).sendKeys("chaubeys123456@gmail.com");
			
			
			driver.findElement(txt_password).sendKeys("Abc@12345");
			driver.findElement(btn_signin).sendKeys(Keys.RETURN);
	
		}

}



