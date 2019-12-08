package com.cerotid;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FbLoginStepDefination {
	ChromeDriver driver;
/*
	@Given("user navigates to facebook website")
	public void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Manoj Adhikari\\\\CerotidWorkspace\\\\libs\\\\chromedriver_win32\\\\chromedriver.exe ");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://facebook.com");
	}

	@Then("user enters the emailId as (.*)")
	public void enterEmailId(String emailId) {
		driver.findElement(By.id("email")).sendKeys(emailId);
	}

	@Then("user enters the password as (.*)")
	public void enterPassword(String password) {
		driver.findElement(By.id("pass")).sendKeys("abc@123");
	}

	@Then("user clicks on login button")
	public void click_login_button() {
		driver.findElement(By.id("u_0_b")).click();

	}

	@Then("user logged in successfully")
	public void verifyLoginIsSuccessful() {
		System.out.println("Logged in successful");
	}

	@And("user closes the browser I navigated to homepage of facebook website")
	public void closeBrowser() {
		driver.quit();

		

*/

	@Given("^user navigates to facebook website$")
	public void invokeBrowsers() throws Throwable{

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Manoj Adhikari\\\\CerotidWorkspace\\\\libs\\\\chromedriver_win32\\\\chromedriver.exe ");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://facebook.com");
	}

	@Then("^user enters the emailId  as (.*)$")
	public void enterEmailId(String emailId) throws Throwable{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(emailId);
	}

	@Then("^user enters the password  as (.*)$")
	public void enterPassword(String password) throws Throwable{
		driver.findElement(By.id("pass")).sendKeys("kalpana");
	}

	@Then("^user clicks on login button$")
	public void click_login_button() throws Throwable{
		driver.findElement(By.id("u_0_b")).click();
	}

	@Then("^user logged in successfully$")
	public void verifyLoginIsSuccessful() throws Throwable{
		System.out.println("Logged in successful");
	}

	@Then("^user closes the browser$")
	public void closeBrowser() throws Throwable{
		driver.quit();
	}
}
