package com.cerotid;

import java.util.List;

import javax.annotation.concurrent.ThreadSafe;

import org.aspectj.runtime.internal.cflowstack.ThreadStackImpl11;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FbSignupStepDefination {

	WebDriver driver;

	String url = "https://www.facebook.com/";

	@Given("^I navigate to Facebook page$")
	public void setup() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manoj Adhikari\\CerotidWorkspace\\libs\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
	}

	@Then("^I enter all required details$")
	public void enterAllDetails(DataTable testData) throws Throwable {
		List<String> details = testData.asList(String.class);
		driver.findElement(By.name("firstname")).sendKeys(details.get(0));
		driver.findElement(By.name("lastname")).sendKeys(details.get(1));
		driver.findElement(By.name("reg_email__")).sendKeys(details.get(2));
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys(details.get(3));
		driver.findElement(By.name("reg_passwd__")).sendKeys(details.get(4));

//		Select date = new Select(driver.findElement(By.id("day")));
//		Select month = new Select(driver.findElement(By.id("month")));
//		Select year = new Select(driver.findElement(By.id("year")));
//		String[] dob = details.get(4).split("-");
//		date.selectByVisibleText(dob[0]);
//		month.selectByVisibleText(dob[1]);
//		year.selectByVisibleText(dob[2]);
//
//		String genderXpath = String.format("//label[text()='%s']//preceding-sibling::input[@type='radio']",
//				details.get(5));
//
//		driver.findElement(By.xpath(genderXpath)).click();
	}

	@Then("^I Clicked on the signup button$")
	public void clickOnSgnUpButton() throws Throwable {
		driver.findElement(By.id("u_0_2")).click();
		
		//print alert
		String title = driver.findElement(By.id("//div[@class='_4rbf _53ij']")).getText();
		System.out.println(title);
	}

	@Then("^I verified that login is successful$")
	public void verifyLoginIsSuccessful() throws Throwable {
		System.out.println(driver.getTitle());
        Thread.sleep(30000);
	}
//
//	@Then("^user clicks on Reset password$")
//	public void resetPassword() throws Throwable {
//		driver.findElement(By.xpath("//a[contains(text(),'Forgot account?')]")).click();
//	}
//
//	@Then("^user resets the password$")
//	public void resetThePassword() throws Throwable {
//		driver.findElement(By.xpath("//input[@class='inputtext']")).sendKeys("manoj@gmail.com");
//		driver.findElement(By.xpath("//input[@id='u_0_5']")).click();
//		String title;
//		title = driver.findElement(By.xpath("//div[@class='phl ptm uiInterstitialContent']")).getText();
//		System.out.println(title);
//		driver.quit();
//	}

}
