  Feature: Accessories
 @smoke
  Scenario: To check Functionality of Hair Accessories

    Given User On HomePage

    When User move-Over Accessories Department

    Then User should be able to Shop and Purchase desire Product Successfully.


@Regression
Scenario: To Check Functionality Of Hair Accessories Based On Colour and Brand.

 Given User On Hair-Accessories Page

  When User Selects Products By Using Filters With Colours and Brands

  Then User Should be able to See the Product