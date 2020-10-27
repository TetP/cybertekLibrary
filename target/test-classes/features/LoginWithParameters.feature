Feature: Login with parameters

  @librarianLogin11
  Scenario: Login as librarian 11
    Given I am on the login page
    When I enter username "librarian11@library"
    And I enter password 'I61FFPPf'
    And click the sign in button
    Then dashboard should be displayed


  @librarianLogin12
  Scenario: Login as librarian 12
    Given I am on the login page
    When I enter username "librarian12@library"
    And I enter password 'AOYKYTMJ'
    And click the sign in button
    Then dashboard should be displayed
    And there should be 1421 users
#number can be whatever you have there


  @oneLineLibrarianLogin
  Scenario: Login as librarian same line
    Given I am on the login page
    When I login using "librarian12@library" and "AOYKYTMJ"
    Then dashboard should be displayed
    And there should be 2119 'Books'
#number can be whatever you have there