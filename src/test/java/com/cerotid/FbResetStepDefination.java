//package com.cerotid;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//
//public class FbResetStepDefination {
//	
//	WebDriver driver;
//	
//	@Given("^user navigates to facebook website$")
//	public void invokeBrowsery() throws Throwable{
//
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\\\Users\\\\Manoj Adhikari\\\\CerotidWorkspace\\\\libs\\\\chromedriver_win32\\\\chromedriver.exe ");
//
//		driver = new ChromeDriver();
//
//		driver.manage().window().maximize();
//
//		driver.manage().deleteAllCookies();
//
//		driver.get("https://facebook.com");
//	}
//	
//	@Then("^user clicks on Reset password$")
//	 public void resetPassword() throws Throwable{
//		driver.findElement(By.xpath("//a[contains(text(),'Forgot account?')]")).click();
//	}
//
//	@Then("^user resets the password$")
//	public void resetThePassword()  throws Throwable{
//		driver.findElement(By.xpath("//input[@class='inputtext']")).sendKeys("manoj@gmail.com");
//		driver.findElement(By.xpath("//input[@id='u_0_5']")).click();
//		String title;
//		title = driver.findElement(By.xpath("//div[@class='phl ptm uiInterstitialContent']")).getText();
//		System.out.println(title);
//		driver.quit();
//	  
//	}
//
//	
//
//}
