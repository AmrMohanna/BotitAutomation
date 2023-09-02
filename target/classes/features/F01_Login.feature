@test
Feature: F01_login | user login
  Scenario: user can login with valid data
    Given Go to login page
    When User fill valid data and click login
    And user click on catalog
    And user click on item
    And user find product and click on edit
    And user change the price
    And user click save
    Then price should save and navigate to catlog page
    And price at grid updated with new value


