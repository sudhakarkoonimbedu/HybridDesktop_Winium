Feature: SmokeTest Hybrid Desktop GUI - Pharmacy Customer

  Background: performLogin
    Given the user access the Hybrid Desktop Application
      | userid   |  |
      | password |  |
      | region   |  |

  @SmokeTest
  Scenario Outline: Perform SmokeTest On Pharmacy Customer Application
    Given User in Landing Page, he selects the application from menu
      | menu | <ApplicationMenu> |
    Then Verify Customer Pharmacy Search window should be displayed
    And Click on Cancel button in Customer Pharmacy Search window

    Examples: 
      | ApplicationMenu               |
      | Provider->Pharmacy - Customer |
