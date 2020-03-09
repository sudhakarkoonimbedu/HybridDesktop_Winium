Feature: SmokeTest Hybrid Desktop GUI - Pharmacy Network

  Background: performLogin
    Given the user access the Hybrid Desktop Application
      | userid   |  |
      | password |  |
      | region   |  |

  @SmokeTest
  Scenario Outline: Perform SmokeTest On Pharmacy Network Application
    Given User in Landing Page, he selects the application from menu
      | menu | <ApplicationMenu> |
    Then Verify Pharmacy Network Rate Maintenance window should be displayed
    And Click on Cancel button in Pharmacy Network Rate Maintenance window

    Examples: 
      | ApplicationMenu              |
      | Provider->Pharmacy - Network |
