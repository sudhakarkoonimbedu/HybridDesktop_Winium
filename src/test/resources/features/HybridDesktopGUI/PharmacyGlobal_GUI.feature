Feature: SmokeTest Hybrid Desktop GUI - Pharmacy Global

  Background: performLogin
    Given the user access the Hybrid Desktop Application
      | userid   |  |
      | password |  |
      | region   |  |

  @SmokeTest
  Scenario Outline: Perform SmokeTest On Pharmacy Global Application
    Given User in Landing Page, he selects the application from menu
      | menu | <ApplicationMenu> |
    Then Verify Pharmacy Address Maintenance window should be displayed
    And Click on Cancel button in Pharmacy Address Maintenance window

    Examples: 
      | ApplicationMenu             |
      | Provider->Pharmacy - Global |
