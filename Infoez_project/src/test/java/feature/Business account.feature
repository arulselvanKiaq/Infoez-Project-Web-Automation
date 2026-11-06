Feature: Business account functionality

Scenario Outline:: verify the Create Business account 

    Given user launches the Explore Page footer Application URL
    When user scrolls to the footer
    And user click the Add your business button
    And user enters the Full name "<full name>"
    And user enters the Email "<email>"
    And user enters the Phone "<phone>"
    And user enters the Password "<password>"
    And user click an create account button
    Then user should see the "<result>"
    
    Examples:
      | full name  | email                   | phone      | password     | result                                 |
      |            | SMBBakery@gmail.com     | 9882453541 | SMBBakery$456| Please fill out this field             |
      | SMB Bakery |                         | 9784324234 | SMB@123      | Please fill out this field             |
      | SMB Bakery | SMBBakerygmail.com      | 9853467723 | SMB@123      | Ener Valid Email Address               |
      | SMB Bakery | SMBBakery@.com          | 9834874432 | SMB@123      | Ener Valid Email Address               |
      | SMB Bakery | SMBBakery@gmail.        | 9456787234 | SMB@123      | Ener Valid Email Address               |
      | SMB Bakery | SMBBakery@gmail.com     | 6433287484 | SMB@123      | Email already registered               |
      | SMB Bakery | SMBBakery@gmail.com     | 8765456435 | SMB@123      | Account Created Successfully           |
      