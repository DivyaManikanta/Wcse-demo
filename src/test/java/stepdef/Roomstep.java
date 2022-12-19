package stepdef;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Roomstep {
	WebDriver  driver ;
	@Given("Open Browser and enter Room URL")
	public void open_browser_and_enter_room_url() {
		WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("http://see.softtaskltd.com/");
		   //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("User enters <username> and <password> and clicks login")
	public void user_enters_username_and_password_and_clicks_login(String username, String password) {
		driver.findElement(By.name("user_name")).sendKeys("softtask");
		   driver.findElement(By.name("user_password")).sendKeys("permission");
		  driver.findElement(By.xpath("//span[.='Sign In']")).click();
	}

	

	@Then("Home page should display with Fail")
	public void home_page_should_display_with_fail() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
