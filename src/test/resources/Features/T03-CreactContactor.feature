Feature: Create New contractor

  Scenario Outline: create new Contractor
    Given admin is on login page
    When user enter username and password
      | tenant@mt.com | A12345 |
    When go to workforcepage and click to button settnigs
    When click to Contractor button
    When click to add new Contractor then set<ContractorName>and <ContractorCommercialRegistration>
    When select  ContractorType and Zone
    Then verfy if contracor is add<ContractorName>

    Examples: 
      | ContractorName | ContractorCommercialRegistration |
      | ismaildhibi    |                             5050 |

  
  Scenario Outline: Edit Contractor
  Given admin is on login page
  When user enter username and password
  | tenant@mt.com | A12345 |
  When go to workforcepage and click to button settnigs
  When click to Contractor button
  When click to edit  Contractor then set<ContractorName>and <ContractorCommercialRegistration>
  When select  ContractorType and Zone
  Then verfy if contracor is updated<ContractorName>
  
  
  Examples:
  | ContractorName | ContractorCommercialRegistration |
  | ismail         |                              101 |
  Scenario Outline: delete Contractor
    Given admin is on login page
    When user enter username and password
      | tenant@mt.com | A12345 |
    When go to workforcepage and click to button settnigs
    When click to Contractor button
    When search  contractor will be delete it <ContractorName>
    Then click to button delete Contractor 
    
     Examples:
  | ContractorName | 
  | ismail         |
