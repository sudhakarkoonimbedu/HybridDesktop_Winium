Feature: SmokeTest Hybrid Desktop GUI - Member Record

  Background: performLogin
    Given the user access the Hybrid Desktop Application
      | userid   |  |
      | password |  |
      | region   |  |

  @SmokeTest
  Scenario Outline: Perform SmokeTest On Member Record Application
    Given User in Landing Page, he selects the application from menu
      | menu | <ApplicationMenu> |
    Then Verify Member Main window should be displayed
    And Click on Cancel button in Member Main window

    Examples: 
      | ApplicationMenu      |
      | Hierarchy->Member Record |
