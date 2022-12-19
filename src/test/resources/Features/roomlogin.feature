
@tag
Feature: Room login
  

  @tag1
  Scenario: Accounts Login
    Given Open Browser and enter Room URL
    When User enters <username> and <password> and clicks login
    Then Home page should display with <status>
    And check more outcomes

 
    Examples: 
      | name  | value | status  |
      | admin	|  admin| success |
      | name2 |     7 | Fail    |
