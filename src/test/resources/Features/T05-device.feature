Feature: feature device

  Scenario: create new device
  Given the user is on login page
   When Click to  Devices menu and click to add new device
  When I should redirect to device page
  When enter the name "A0A10121" and type "wearableTag" of device
  When the user save device and verify "A0A10121" to contractor
  Then The device is added successfully
  
   Scenario: edite device 
    Given the user is on login page
    When the user search the device "A0A10121" and click to double click to edit 
    Then the user edit divice : type , label , description and click to save
  
  
  Scenario: delete device
  Given the user is on login page
  When Click on Devices menu
  When I should redirect to device page
  When the user search the device "A0A10121" and click to button delete
  When Delete pop up is displayed showing the message
  Then The user confirm delete device and the device is deleted successfully

  Scenario:  add multiple device
    Given the user is on login page
    When click to add new device
    When I should redirect to device page
    When add multiple device name  
    | Username  | 
    | testuser_1 | 
    | testuser_2 | 
    | testuser_3 |
    Then the devices are added
    
    
    Scenario:  Delete  multiple devices
     Given the user is on login page
      When Click to  Devices menu and chose device UID 
      And search the device "testuser" will be delete 
      And Select devices  and click to delete 
      And Delete pop up is displayed showing the message delete multiple device 
      Then The user confirm delete device and the device is deleted successfully
    
   