Feature: SmokeTest Hybrid Desktop GUI - Pharmacy Search

  Background: performLogin
    Given the user access the Hybrid Desktop Application
      | userid   |  |
      | password |  |
      | region   |  |

  @SmokeTest
  Scenario Outline: Perform SmokeTest On Pharmacy Search Application
    Given User in Landing Page, he selects the application from menu
      | menu | <ApplicationMenu> |
    Then Verify Pharmacy Search window should be displayed
    And Click on Cancel button in Pharmacy Search window

    Examples: 
      | ApplicationMenu             |
      | Provider->Pharmacy - Search |
