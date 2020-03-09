Feature: SmokeTest Hybrid Desktop GUI - Client

  Background: performLogin
    Given the user access the Hybrid Desktop Application
      | userid   |  |
      | password |  |
      | region   |  |

  @SmokeTest
  Scenario Outline: Perform SmokeTest On Client Application
    Given User in Landing Page, he selects the application from menu
      | menu | <ApplicationMenu> |
    Then Verify Client Main window should be displayed
    And Click on Cancel button in Client Main window

    Examples: 
      | ApplicationMenu   |
      | Hierarchy->Client |
