Feature: Test the Vehicle feature


  Scenario: user click on submit button without entering data
    Given User go to add new vehicle
    When User click directly on submit vehicle button
    Then Error messages should be displayed vehicle
    And User quit the add page vehicle

  Scenario: To Add a new vehicle
    Given User go to vehicle page
    And click on add new vehicle
    When User type vehicle new information
      | 123654789 | 123654789 |
    And click on submit button vehicle to confirm
    Then User should navigate to vehicle dashboard


  Scenario: To update vehicle
    Given User select vehicle to update
      | 123654789 |
    When User update vehicle information
      | 123654788 |
    Then User click on save vehicle update button


  Scenario: To delete vehicle
    Given User select vehicle to delete
      | 123654788 |
    When User click the delete vehicle button
    Then User should navigate to vehicle dashboard


  Scenario: To import vehicle
    Given User go to vehicle menu
    When User click on import vehicle list
    Then User add the vehicle list
      | C:\Users\ismail\eclipse-workspace\RedSea-PageFactoryV0\src\test\resources\Data\Vehicle.xlsx |


  Scenario: To export the list of vehicle
    Given User go to vehicle page
    When User click on export vehicle button
    Then User should navigate to vehicle dashboard


  Scenario: To add multiple vehicles then delete them
    Given User go to vehicle page
    When Add multiple vehicles
      | vehicleID | plateNumber |
      | 789654123 | 789654123   |
      | 963258741 | 963258741   |
      | 632145897 | 632145897   |

   And  select the vehicles added
   Then  Click on delete vehicles button

