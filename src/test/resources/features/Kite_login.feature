Feature: Feature to test login functionlity
 @Regreesion
  Scenario Outline: Check login is successful with valid credentials
    Given users is on login page
    When users enters <username> and <password>
    And clicks on login button
    Then users is navigate to the homepage
    Then Clicks on logout button

    Examples: 
      | username | password    |
      | student  | Password123 |
      | st1dent  | Password223 |