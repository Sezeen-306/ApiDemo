package fbsteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import fbpages.HomepPage;
import fbpages.LoginPage;


public class GetTitle {
	WebDriver driver;
	LoginPage loginpage; 
	TestUser user;
	HomepPage homepage;
	@Given("^I land on chorome$")
	public void i_land_on_chorome(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sayee\\eclipse-workspace\\jamesmentoringpro\\chromedriver.exe");

		 driver=new ChromeDriver();
	}

	@Given("^I land on sociLware by valid url$")
	public void i_land_on_sociLware_by_valid_url(){
		driver.get("https://www.demo.iscripts.com/socialware/demo/");
		  loginpage=new LoginPage(driver);
		   user = new TestUser();
		   user.setEmail("user@iscripts.com");
		   user.setPassword("User1234");
	homepage	=  loginpage.loginMethod(user.getEmail(),user.getPassword());
	}

}
