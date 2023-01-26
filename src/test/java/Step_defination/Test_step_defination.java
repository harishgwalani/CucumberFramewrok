package Step_defination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_step_defination {
	
	WebDriver driver;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\q\\eclipse-workspace\\testArtifactid\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		System.out.println("user is on login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
	
		System.out.println("user enters username and password");
	}

	@And("click on login button")
	public void click_on_login_button() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.id("submit")).click();	
		System.out.println("click on login button");
	}

	@Then("user is navigate to the homepage")
	public void user_is_navigate_to_the_homepage() {
		boolean temp=driver.findElement(By.xpath("//*[text()='Log out']")).isDisplayed();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		if(temp==true)
		{
			System.out.println("Test Case is Pass");
		}
		else
		{
			System.out.println("Test Case is Fail");
		}
		System.out.println("user is navigate to the homepage");
	}

}
