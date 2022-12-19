package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdifinition {
	public WebDriver driver;
	
	@Given("open the browser")
	public void open_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.codexeco.com/hms/admin");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
	}
	@When("enter the vaild username and password")
	public void enter_the_vaild_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	@When("click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@Then("home page will be displayed")
	public void home_page_will_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	@Then("check more outcomes")
	public void check_more_outcomes() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}


}
