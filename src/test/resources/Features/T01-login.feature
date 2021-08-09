Feature: feature to test login for redsea functionality
 @SanityTest1
  Scenario: Check login is successful with valid credentials
    Given the user is on login page
    When the user enter username "tenant@mt.com" and password "A12345"
    Then I should redirect to Workforce page

  #Scenario Outline: Check login  with Invalid credentials
    #Given user is on login page
    #When user enter the <username> and the <password>
    #Then an error message should be displayed
#
    #Examples: 
      #| username       | password |
      #| tenant@mt.com1 | A12345   |
      #| tenant@mt.com  |    f12345 |
      #| tenant@mt.com1 | A1412345 |
      #
  #
 #Scenario Outline: Verifying redirection to the Forgot password page and Check email
    #Given user is on login page
    #When user click to forget password button 
    #And I should redirect Forgot password page
    #And user enter  invalid <email> and click to submit 
    #Then  an error message should be displayed in page 
    #
     #Examples: 
     #| email       |
     #| tenant@mt.co |
     #| tenantmt |
     #| 111111111111 |
     #| tenantmt.com |
     #| aaaaaaaa |