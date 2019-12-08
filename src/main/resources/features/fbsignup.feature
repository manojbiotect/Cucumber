Feature:  In this feature we will signup to facebook website.
In this feature we will signup to facebook website.
 
  Scenario: Signup to Facebook
    Given I navigate to Facebook page
    Then I enter all required details
      | Manoj                   |
      | Adhikari                |
      | manojbi.merim@gmail.com |
      | manojbi.merim@gmail.com |
      | password                |
      | Pasupathin              |
      | Female                  |
    Then I Clicked on the signup button
    