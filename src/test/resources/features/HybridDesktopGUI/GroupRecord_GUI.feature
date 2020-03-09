Feature: SmokeTest Hybrid Desktop GUI - Group Record

  Background: performLogin
    Given the user access the Hybrid Desktop Application
      | userid   |  |
      | password |  |
      | region   |  |

  @SmokeTest
  Scenario Outline: Perform SmokeTest On Group Record Application
    Given User in Landing Page, he selects the application from menu
      | menu | <ApplicationMenu> |
    Then Verify Group Search window should be displayed
    And Click on Cancel button in Group Search window

    Examples: 
      | ApplicationMenu         |
      | Hierarchy->Group Record |
