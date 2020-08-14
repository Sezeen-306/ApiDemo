package fbpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	
	this.driver=driver;
	}
	public  HomepPage loginMethod(String email, String password) {
		// TODO Auto-generated method stub
		driver.findElement(By.name("user_email")).sendKeys(email);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.name("btnSubmit")).click();
		
	   String title_name	=driver.getTitle();
		System.out.println(title_name);
		String exp_title="Socialware";
		if(title_name.equals(exp_title)) {
			System.out.println("test passed");
		}
		else {
			System.out.println("test failed");
		}
		return new HomepPage(driver);
	}

}
