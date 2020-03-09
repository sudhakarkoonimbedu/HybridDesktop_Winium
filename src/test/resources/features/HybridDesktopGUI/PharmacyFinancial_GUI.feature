Feature: SmokeTest Hybrid Desktop GUI - Pharmacy Financial

  Background: performLogin
    Given the user access the Hybrid Desktop Application
      | userid   |  |
      | password |  |
      | region   |  |

  @SmokeTest
  Scenario Outline: Perform SmokeTest On Pharmacy Financial Application
    Given User in Landing Page, he selects the application from menu
      | menu | <ApplicationMenu> |
    Then Verify Pharmacy Financial Balance Inquiry window should be displayed
    And Click on Cancel button in Pharmacy Financial Balance Inquiry window

    Examples: 
      | ApplicationMenu                |
      | Provider->Pharmacy - Financial |
