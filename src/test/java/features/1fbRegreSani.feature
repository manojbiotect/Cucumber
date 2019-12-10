Feature: Test login and signup on facebook 

	//look to know more: https://qatechhub.com/tags-in-cucumber/
// if you write given on top under background then given runs every time.
Background: 
	Given user navigates to facebook website 
@SanityTest @RegressionTest 
Scenario: Login with correct credentials. 
	Given user navigates to facebook website 
	Then user enters the emailId as gitabiotech@yahoo.com 
	Then user enters the password as kalpana 
	Then user clicks on login button 
	And user logged in successfully 
	And user closes the browser 
	
	
@SanityTest 
Scenario: Signup to Facebook 
#	Then I enter all required details 
#		| Manoj                   |
#		| Adhikari                |
#		| manojbi.merim@gmail.com |
#		| manojbi.merim@gmail.com |
#		| Pasupathin              |
	Given user navigates to facebook website 
	
	Then I enter all required details 
		| firstname| Manoj                   |
		| lastname | Adhikari                |
		| email    | manojbi.merim@gmail.com |
		| reemail  | manojbi.merim@gmail.com |
		| password | Pasupathin              |
		
	Then I Clicked on the signup button 
	And user is signed up successfully 
	And user closes the browser 
	
@RegressionTest 
Scenario: Reset the password 
	Given user navigates to facebook website 
	Then user clicks on Reset password 
	Then user resets the password 
	And user closes the browser 
	