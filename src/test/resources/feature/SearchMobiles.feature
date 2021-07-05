@Search-Mobiles
Feature: Acceptance testing to validate Search Mobiles Page is working.
  In order to validate Mobile 
  the Search Cars page is working
  Doing the Acceptance Testing

  @Search-Mobiles-Positive
  Scenario: Validate Home Page
    Given I am on the Home Page "https://www.amazon.in/" of Amazon Website
    When I click on Mobiles section on flipkart
    Then The Electronics section is displayed having following items
