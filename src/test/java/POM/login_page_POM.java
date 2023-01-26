package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page_POM {
	WebDriver driver;
	@FindBy(id = "username")
	private WebElement user_name;

	@FindBy(id = "password")
	private WebElement user_pass;

	@FindBy(id = "submit")
	private WebElement user_submit;

	@FindBy(xpath = "//*[text()='Log out']")
	private WebElement user_logout;

	public login_page_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enter_user_name(String username) {
		user_name.sendKeys(username);
	}

	public void enter_user_password(String password) {
		user_pass.sendKeys(password);
	}

	public void enter_user_submit() {
		user_submit.click();
	}

	public void enter_user_logout() {
		boolean temp = user_logout.isDisplayed();
		if (temp == true) {
			System.out.println("Test Case is Pass");
		} else {
			System.out.println("Test Case is Fail");
		}
		System.out.println(temp);
	
	}
	public void logout() throws InterruptedException
	{	Thread.sleep(5000);
		user_logout.click();
	}
}
