@Search-Mobiles-Google
Feature: Check Google search page.
  In order to validate Mobile Search on Google 
  As a Google User
  I have to search the mobiles in google search box

  @Search-Mobiles-scenario-1
  Scenario: Validate Home Page
    Given I am on the Home Page "https://www.google.com/" of Google
    When I Enter "Mobiles" in Google search Box
    And click on search Icon
    Then Information Reated to mobiles will display