Feature: feature user

  Scenario Outline: create new User  with valid credentials
    Given the user is on login page
    When go to workforcepage and verify if btn user is display
    When click to user button and click  to icone add
    When click to add user and send <FirstName> and <LastName> and <Email> and <Mobile>
  #  When i filtre the user will be delete FirstName "ismaildhibi"
    Then verify if user is add

    Examples:
      | FirstName | LastName | Email                  | Mobile   |
      | ismail    | dhibi    | ismaildhibi904@gmail.com | 521813265 |

  #Scenario: Check  message error in input
    #Given the user is on login page
    #When go to workforcepage and verify if btn user is display
    #When click to user button and click  to icone add
    #When click to add user then click to save
    #When verify if error message is displayed.
    #When verifiy  email is existe
      #| tenant@mt.com | 218132652 |
    #Then verify phone is existe
      #| tenant@mt.comm | 21813265 |

#
  #Scenario Outline: Edit profile user
    #Given the user is on login page
    #When click to button settnigs  and click to button user
    #When i filtre the user will be edit FirstName
      #| ismail |
    #When i choose user and edit <FirstName> and <LastName>
    #Then verfiy if user is edited
#
    #Examples:
      #| FirstName   | LastName   |
#      | ismailEdit2 | DhibiEdit2 |


  Scenario: delete user
    Given the user is on login page
    When i filtre the user will be delete it
      | ismail |
    Then i choose user and delete it 

  Scenario:  logout
    Given the user is on login page
    When the user click to button profil click to Logout 
    Then  the user logout
