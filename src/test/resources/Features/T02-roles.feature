Feature:  Role

  Scenario Outline: Create new role
    Given the user is on login page
    When go to workforcepage and click to button settnigs
    When click to Role button
    When click to add new role then set <name> and <description>
    When selecct Operations and save
    Then verfifay the <name>

    Examples:
      | name           | description              |
      | AutomationRole | this role for automation |


  Scenario Outline: edit role
    Given the user is on login page
    #When go to workforcepage and click to button settnigs
    #When click to Role button
    #When search the rol will be edit
    When click to button edit
    When set the new <name> and <description>
    Then verify the role is edit
    Examples:
      | name               | description                      |
      | AutomationRoleedit | this role for automation is edit |


  Scenario: delete role
    Given the user is on login page
    And click to delete button and confirm
    When message delete is display
    Then Confirm delete then the role  successfully deleted
    
