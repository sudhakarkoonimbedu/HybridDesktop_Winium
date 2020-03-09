Feature: SmokeTest Hybrid Desktop GUI - Coverage

  Background: performLogin
    Given the user access the Hybrid Desktop Application
      | userid   |  |
      | password |  |
      | region   |  |

  @SmokeTest
  Scenario Outline: Perform SmokeTest On Coverage Application
    Given User in Landing Page, he selects the application from menu
      | menu | <ApplicationMenu> |
    Then Verify Coverage Main window should be displayed
    And Click on Cancel button in Coverage Main window

    Examples: 
      | ApplicationMenu    |
      | Benefits->Coverage |
