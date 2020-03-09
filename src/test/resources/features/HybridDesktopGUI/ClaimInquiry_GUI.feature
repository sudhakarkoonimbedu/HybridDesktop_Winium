Feature: SmokeTest Hybrid Desktop GUI - Claim Inquiry

  Background: performLogin
    Given the user access the Hybrid Desktop Application
      | userid   |  |
      | password |  |
      | region   |  |

  @SmokeTest
  Scenario Outline: Perform SmokeTest On Claim Inquiry Application
    Given User in Landing Page, he selects the application from menu
      | menu | <ApplicationMenu> |
    Then Verify Claim Main window should be displayed
    And Click on Cancel button in Claim Main window

    Examples: 
      | ApplicationMenu      |
      | Claim->Claim Inquiry |
