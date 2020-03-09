Feature: SmokeTest Hybrid Desktop GUI - Claim Test

  Background: performLogin
    Given the user access the Hybrid Desktop Application
      | userid   |  |
      | password |  |
      | region   |  |

  @SmokeTest
  Scenario Outline: Perform SmokeTest On Claim Test Application
    Given User in Landing Page, he selects the application from menu
      | menu | <ApplicationMenu> |
    Then Verify Claim Test Main window should be displayed
    And Click on Cancel button in Claim Test Main window

    Examples: 
      | ApplicationMenu   |
      | Claim->Claim Test |
