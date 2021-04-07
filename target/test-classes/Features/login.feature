Feature: feature to test login for Amazone functionality


  Scenario Outline: Check login is successful with valid credentials
    Given user is on login page
    #When user clicks on sign in
    And user enter the <username> and <password>
    Then I should redirect to home page

    Examples: 
      | username               | password     |
      | ismaildhibi1@gmail.com | ismail124521 |
