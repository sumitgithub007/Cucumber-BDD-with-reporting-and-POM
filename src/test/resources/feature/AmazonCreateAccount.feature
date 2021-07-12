@createAccountonAmazon
Feature: Create New Amazon Account
  In order to create new Amazon Account 
  As a new User
  I have to provide my details by clicking on create new Account

  @CreateAmazonAccount-scenario-1
  Scenario Outline: Validate create new account fuctionality without password
    Given I am on the Home Page "https://www.amazon.in/" of Amazon Website
    When I click on Hello Sign In Accounts & List
    Then "Sign-In" page displays
    And I click on create Your Amazon Account Button
    Then I will land on "Create Account" page
    And I will enter "<your name>" , "<phone> " , "<email>"
    And I will click on continue Button
    Then A message "Enter your password" will be displayed to user

Examples:
   |your name     |phone     |   email               |
   |sumit goyal   |9898989732|goyalsumit333@gmail.com|
   |ankit nigam   |8783232456|nankit676@gmail.com    |        