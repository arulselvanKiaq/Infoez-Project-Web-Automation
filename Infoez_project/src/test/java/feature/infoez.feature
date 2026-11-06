Feature: Registration Function

  Background:
    Given user launches the Register page Application URL
    Given user click the sigin button
    Given user click the create one link
  
 
  Scenario Outline: validate register an account with valid and invalid multiple user details
    When user enters Full name "<full name>"
    And user enters Email "<email>"
    And user enters Phone "<phone>"
    And user enters Password "<password>"
    And user click the create account button
    Then user should see "<result>"

    Examples:
      | full name  | email                   | phone      | password     | result                                 |
      |            | lalith23@gmail.com      | 9882876541 | lalith$456   | Please fill out this field             |
      | Vicky      |                         | 9782874234 | v@123        | Please fill out this field             |
      | karthi     | karthi456gmail.com      | 9682677235 | karthi@123   | Ener Valid Email Address               |
      | karthi     | karthi456@.com          | 9834874432 | karthi@123   | Ener Valid Email Address               |
      | karthi     | karthi456@gmail.        | 9836287234 | karthi@123   | Ener Valid Email Address               |
      | Sathish    | sathish@gmail.com       | 6433287484 | sathish@123  | Email already registered               |
      | Gowthami   | gowtham264@gmail.com    | 8765676435 | gowtham@123  | Account Created Successfully           |
