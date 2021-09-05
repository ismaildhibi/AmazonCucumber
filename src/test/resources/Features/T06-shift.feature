Feature: Create new Shift

  Scenario Outline: Create new Shift
    Given user is on login page
    When user enter username and password
      | tenant@mt.com | A12345 |
    When go to workforcepage and click to button settnigs
    When click to Shift button and click to add new shift
    When the user enter shift <name>  and <description>
    When the user will shoose the days of shift
    Then message should be display when the shift is add

    Examples:
      | name           | description              |
      | AutomationRole | this role for automation |

  Scenario Outline: add holiday
    Given user is on login page
    When user enter username and password
      | tenant@mt.com | A12345 |
    When go to workforcepage and click to button settnigs
    When click to Shift button shift and srarch "AutomationRole" the shift will be add holiday
    When the user click to holiday then enter the date <dateofholiday>  and name <nameholiday>
    When the user will shoose the days of shift

    Examples:
      | dateofholiday | nameholiday |
      | 11102021      | aid elfeter |


  Scenario: delete Shift
    Given user is on login page
    When user enter username and password
      | tenant@mt.com | A12345 |
    When go to workforcepage and click to button settnigs
    When click to Shift button shift and srarch "AutomationRole" the shift will be delete it
    Then the user delete shift 
