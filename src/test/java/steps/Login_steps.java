package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_steps {
	WebDriver driver;
	
	@Given("User on the login page")
	public void user_on_the_login_page() {
	    driver = new ChromeDriver();
	    driver.get("https://the-internet.herokuapp.com/login");
		driver.manage().window().maximize();
	    
	}

	@When("Entered Email_Address")
	public void entered_email_address() {
	    driver.findElement(By.id("username")).sendKeys("tomsmith");
	}

	@When("Entered Password")
	public void entered_password() {
		 driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
	}

	@And("Clicked on login button")
	public void clicked_on_login_button() {
		driver.findElement(By.cssSelector("i[class=\"fa fa-2x fa-sign-in\"]")).click();	
	}

	@Then("logged in message should be displayed")
	public void logged_in_message_should_be_displayed() {
		
	String text =	driver.findElement(By.cssSelector("div[class=\"flash success\"]")).getText();
	boolean t = text.contains("logged");
	Assert.assertTrue(t);
	}

}
