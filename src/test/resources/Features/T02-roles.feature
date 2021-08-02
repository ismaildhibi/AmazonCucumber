Feature: Create new Role

  Scenario Outline: Create new role
    Given user is on login page
    When user enter username and password
      | redsea@mt.com | A12345 |
    When go to workforcepage and click to button settnigs
    When click to Role button
    When click to add new role then set <name> and <description>
    When selecct Operations and save
    Then verfifay the <name>
    
     Examples:
    |name|description|
    |AutomationRole|this role for automation|
  
  
    Scenario Outline: edit role 
      Given user is on login page
    When user enter username and password
      | redsea@mt.com | A12345 |
    When go to workforcepage and click to button settnigs
    When click to Role button
    When search the rol will be edit 
    When click to button edit
    When set the new <name> and <description>    
    Then verify the role is edit 
     Examples:
    |name|description|
    |AutomationRoleedit|this role for automation is edit |
    
    
    Scenario: delete role 
      Given user is on login page
    When user enter username and password
      | redsea@mt.com | A12345 |
    When go to workforcepage and click to button settnigs
    When click to Role button
    Then click to delete button and confirm 
    
