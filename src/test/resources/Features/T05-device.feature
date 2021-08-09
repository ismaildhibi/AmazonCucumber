Feature: feature to create new device 
 @SanityTest
  Scenario: create new device 
    Given the user is on login page
    When the user enter username "tenant@mt.com" and password "A12345"
    When click to Shift button and click to add new device 
    When I should redirect to device page
    When enter the name "A0A10121" and label "testautomation" of device and select deviceprofile
     Then the user save device and verify "A0A10121" to contractor 
    
      #Scenario: delete device 
    #Given the user is on login page
    #When the user enter username "tenant@mt.com" and password "A12345"
    #When click to Shift button and click to add new device 
    #When I should redirect to device page
    #Then the user search the device "A0A10121" and click to button delete 
    #
    #
    #
         #Scenario: edite device 
    #Given the user is on login page
    #When the user enter username "tenant@mt.com" and password "A12345"
    #When click to Shift button and click to add new device 
    #When I should redirect to device page
    #When the user search the device "10123456" and click to double click to edit 
    #Then the user edit divice : type , label , description and click to save