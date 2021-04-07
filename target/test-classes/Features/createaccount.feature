Feature: feature Create account for Amazone

   Scenario Outline: Check create new account
    Given go to amazone page
    And click to sign in page
    And click to create accounte button
    And add <username>&<email>&<password>&<repassword>
    And click on button  create account
    Then go to page home
    
    
    Examples: 
      | username       | email     |  password               | repassword     |
      | ismail144 |  ismaildhibi11@gmail.com  | ismail1232456     |ismail1232456|
    
    
    
