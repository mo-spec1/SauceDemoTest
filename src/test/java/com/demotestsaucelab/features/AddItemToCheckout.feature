Feature: Add an item to basket
  As a user
  I want to be able to add an item to basket
  So I can checkout successfully

  Background: Access to the Products page
    Given I navigate to the Sauce Labs login page
    And I enter the credentials "standard_user" and "secret_sauce"
    Then I should be taken to the product page

  Scenario: Add item to basket
    When I add items to the basket
    Then it should be added successfully

  Scenario: Proceed to Checkout
    Given I have items in my basket
    When I click on the checkout button
    And I enter my name "Moses" "Test"
    And I enter my postal code "M11FT" and continue
    Then I should be taken to a Overview page

  Scenario: Successfully Checkout
    Given I am on the Checkout page
    When I enter my name "Moses" "Test"
    And I enter my postal code "M11FT" and continue
    And I click on the Finish button
    Then I should be taken to a Thank You page