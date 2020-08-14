package fbsteps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;


public class AutoSuggestion {
	WebDriver driver;

	@Given("^I open chorome$")
	public void i_open_chorome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sayee\\eclipse-workspace\\crmproject\\chromedriver.exe");

		driver=new ChromeDriver();
	}

	@Given("^I land on fb by fb url$")
	public void i_land_on_fb_by_fb_url(){
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("India");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		List<WebElement> allFriendselement =driver.findElements(By.className("sbl1")); //List
		for (WebElement allfriends:allFriendselement) {
			//System.out.println(allfriends.getText());  //getting all suggestion  names
			if(allfriends.getText().equalsIgnoreCase("india coronavirus"))	{
				allfriends.click();
				break;
			}
		}





	}
}
