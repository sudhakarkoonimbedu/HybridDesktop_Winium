Feature: SmokeTest Hybrid Desktop GUI - Auth Record

  Background: performLogin
    Given the user access the Hybrid Desktop Application
      | userid   |  |
      | password |  |
      | region   |  |

  @SmokeTest
  Scenario Outline: Perform SmokeTest On Auth Record Application
    Given User in Landing Page, he selects the application from menu
      | menu | <ApplicationMenu> |
    Then Verify Authorization Main window should be displayed
    And Click on Cancel button in Authorization Main window

    Examples: 
      | ApplicationMenu    |
      | Claim->Auth Record |
