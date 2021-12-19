Feature: Login
  As a user
  I want to be able to login successfully
  So I can access my account

  Background: Access the Sauce Demo homepage
    Given I navigate to the Sauce Labs Login Page

  Scenario Outline: Login Successfully
    When I enter the credentials "<Username>" and "<Password>"
    And I click the login button
    Then I should be logged in successfully

    Examples:
      | Username                | Password     |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |

    Scenario: Login Failed
      When I enter the Username "locked_out_user"
      And I enter the Password "secret_sauce"
      And I click the login button
      Then an error message is displayed