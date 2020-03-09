Feature: SmokeTest Hybrid Desktop GUI - Prescriber Records

  Background: performLogin
    Given the user access the Hybrid Desktop Application
      | userid   |  |
      | password |  |
      | region   |  |

  @SmokeTest
  Scenario Outline: Perform SmokeTest On Prescriber Records Application
    Given User in Landing Page, he selects the application from menu
      | menu | <ApplicationMenu> |
    Then Verify Prescriber Main window should be displayed
    And Click on Close button in Prescriber Main window

    Examples: 
      | ApplicationMenu              |
      | Provider->Prescriber Records |
