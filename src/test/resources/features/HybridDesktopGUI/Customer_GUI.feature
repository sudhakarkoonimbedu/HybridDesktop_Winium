Feature: SmokeTest Hybrid Desktop GUI - Customer

  Background: performLogin
    Given the user access the Hybrid Desktop Application
      | userid   |  |
      | password |  |
      | region   |  |

  @SmokeTest
  Scenario Outline: Perform SmokeTest On Customer Application
    Given User in Landing Page, he selects the application from menu
      | menu | <ApplicationMenu> |
    Then Verify Customer Main window should be displayed
    And Click on Cancel button in Customer Main window

    Examples: 
      | ApplicationMenu     |
      | Hierarchy->Customer |
