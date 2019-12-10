package steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FbLoginStepDefination {
	ChromeDriver driver;
	/*
	 * @Given("user navigates to facebook website") public void invokeBrowser() {
	 * 
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\\\Users\\\\Manoj Adhikari\\\\CerotidWorkspace\\\\libs\\\\chromedriver_win32\\\\chromedriver.exe "
	 * );
	 * 
	 * driver = new ChromeDriver();
	 * 
	 * driver.manage().window().maximize();
	 * 
	 * driver.manage().deleteAllCookies();
	 * 
	 * driver.get("https://facebook.com"); }
	 * 
	 * @Then("user enters the emailId as (.*)") public void enterEmailId(String
	 * emailId) { driver.findElement(By.id("email")).sendKeys(emailId); }
	 * 
	 * @Then("user enters the password as (.*)") public void enterPassword(String
	 * password) { driver.findElement(By.id("pass")).sendKeys("abc@123"); }
	 * 
	 * @Then("user clicks on login button") public void click_login_button() {
	 * driver.findElement(By.id("u_0_b")).click();
	 * 
	 * }
	 * 
	 * @Then("user logged in successfully") public void verifyLoginIsSuccessful() {
	 * System.out.println("Logged in successful"); }
	 * 
	 * @And("user closes the browser I navigated to homepage of facebook website")
	 * public void closeBrowser() { driver.quit();
	 * 
	 * 
	 * 
	 */

	@Given("^user navigates to facebook website$")
	public void invokeBrowsers() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Manoj Adhikari\\\\CerotidWorkspace\\\\libs\\\\chromedriver_win32\\\\chromedriver.exe ");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://facebook.com");
	}

	@Then("^user enters the emailId as (.*)$")
	public void enterEmailId(String emailId) throws Throwable {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(emailId);
	}

	@Then("^user enters the password as (.*)$")
	public void enterPassword(String password) throws Throwable {
		driver.findElement(By.id("pass")).sendKeys("kalpana");
	}

	@Then("^user clicks on login button$")
	public void click_login_button() throws Throwable {
		driver.findElement(By.id("u_0_b")).click();
	}

	@Then("^user logged in successfully$")
	public void verifyLoginIsSuccessfull() throws Throwable {
		System.out.println("Logged in successful");
	}

	@Then("^I enter all required details$")
	public void enterAllDetails(DataTable testData) throws Throwable {
/*  method 1
		List<String> details = testData.asList(String.class);
		driver.findElement(By.name("firstname")).sendKeys(details.get(0));
		driver.findElement(By.name("lastname")).sendKeys(details.get(1));
		driver.findElement(By.name("reg_email__")).sendKeys(details.get(2));
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys(details.get(3));
		driver.findElement(By.name("reg_passwd__")).sendKeys(details.get(4));
		*/
		
	//method 2
		Map<String, String> userDetails = testData.asMap(String.class,String.class);
		driver.findElement(By.name("firstname")).sendKeys(userDetails.get("firstname"));
		driver.findElement(By.name("lastname")).sendKeys(userDetails.get("lastname"));
		driver.findElement(By.name("reg_email__")).sendKeys(userDetails.get("email"));
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys(userDetails.get("reemail"));
		driver.findElement(By.name("reg_passwd__")).sendKeys(userDetails.get("password"));

	}

	@Then("^I Clicked on the signup button$")
	public void clickOnSgnUpButton() throws Throwable {
		driver.findElement(By.id("u_0_2")).click();
	}

	@Then("^user is signed up successfully$")
	public void verifyLoginIsSuccessful() throws Throwable {
		System.out.println(driver.getTitle());
	}

	@Then("^user clicks on Reset password$")
	public void resetPassword() throws Throwable {
		driver.findElement(By.xpath("//a[contains(text(),'Forgot account?')]")).click();
	}

	@Then("^user resets the password$")
	public void resetThePassword() throws Throwable {
		driver.findElement(By.xpath("//input[@class='inputtext']")).sendKeys("manoj@gmail.com");
		driver.findElement(By.xpath("//input[@id='u_0_5']")).click();
	}

	@Then("^user closes the browser$")
	public void closeBrowser() throws Throwable {
		driver.quit();
	}

}
