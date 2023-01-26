package Step_defination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.login_page_POM;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Kite_login_page {
	WebDriver driver = null;
	login_page_POM login;

	@Given("users is on login page")
	public void users_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\q\\eclipse-workspace\\testArtifactid\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		System.out.println("user is on login page");
	}

	@When("^users enters (.*) and (.*)$")
	public void users_enters_username_and_password(String username, String password) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		login = new login_page_POM(driver);
		Thread.sleep(3000);
		login.enter_user_name(username);
		Thread.sleep(3000);
		login.enter_user_password(password);
		System.out.println("usename is " + username);
		System.out.println("password is " + password);
	}

	@And("clicks on login button")
	public void clicks_on_login_button() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		login.enter_user_submit();
		System.out.println("click on login button");
	}

	@Then("users is navigate to the homepage")
	public void users_is_navigate_to_the_homepage() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		login.enter_user_logout();
		Thread.sleep(5000);
		System.out.println("user is navigate to the homepage");

	}

	@Then("Clicks on logout button")
	public void clicks_on_logout_button() throws InterruptedException {
		login.logout();
	}
}