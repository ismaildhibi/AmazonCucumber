Feature: Create New contractor

  Scenario: create new Contractor
    Given the user is on login page
    When click to Contractor button
    When click to add new Contractor then set ContractorName and CommercialRegistration
      | ContractorName | ContractorCommercialRegistration |
      | DhibiIsmail    |                              606 |
    Then verfy if contracor is add ContractorName
    
      #Scenario Outline: Edit Contractor
    #When click to edit  Contractor then set<ContractorName>and <ContractorCommercialRegistration>
    #When select  ContractorType and Zone
    #Then verfy if contracor is updated<ContractorName>
#
#
    #Examples:
      #| ContractorName | ContractorCommercialRegistration |
      #| ismail         | 101                              |
      
      
  Scenario Outline: delete Contractor
    Given the user is on login page
    When search  contractor will be delete it <ContractorName>
    Then click to button delete Contractor

    Examples:
      | ContractorName |
      | DhibiIsmail         |
      
      
