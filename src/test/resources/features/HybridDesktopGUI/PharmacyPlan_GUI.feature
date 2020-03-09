Feature: SmokeTest Hybrid Desktop GUI - Pharmacy Plan

  Background: performLogin
    Given the user access the Hybrid Desktop Application
      | userid   |  |
      | password |  |
      | region   |  |

  @SmokeTest
  Scenario Outline: Perform SmokeTest On Pharmacy Plan Application
    Given User in Landing Page, he selects the application from menu
      | menu | <ApplicationMenu> |
    Then Verify Pharmacy Plan Maintenance window should be displayed
    And Click on Cancel button in Pharmacy Plan Maintenance window

    Examples: 
      | ApplicationMenu           |
      | Provider->Pharmacy - Plan |
