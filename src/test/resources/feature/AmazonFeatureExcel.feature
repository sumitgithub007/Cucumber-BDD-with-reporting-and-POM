@createAccountonAmazonUsingExcel
Feature: Create New Amazon Account using Excel
  In order to create new Amazon Account 
  As a new User
  I have to provide my details by clicking on create new Account

  @CreateAmazonAccount-scenario-Excel
  Scenario Outline: Validate create new account fuctionality without password excel
    Given I am on the Home Page "https://www.amazon.in/" of Amazon Website excel
    When I click on Hello Sign In Accounts & List excel
    Then "Sign-In" page displays excel
    And I click on create Your Amazon Account Button excel
    Then I will land on "Create Account" page excel
    And I will enter details from "<SheetName>" and <RowNumber> 
    And I will click on continue Button excel
    Then A message "Enter your password" will be displayed to user excel

Examples:
   |SheetName |RowNumber|
   |Sheet1|    1|
   |Sheet1|  2|
   |Sheet1| 3 |