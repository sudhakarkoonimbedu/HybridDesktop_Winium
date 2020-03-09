Feature: SmokeTest Hybrid Desktop GUI - Planlist Benefit Plan

  Background: performLogin
    Given the user access the Hybrid Desktop Application
      | userid   |  |
      | password |  |
      | region   |  |

  @SmokeTest
  Scenario Outline: Perform SmokeTest On Planlist Benefit Plan Application
    Given User in Landing Page, he selects the application from menu
      | menu | <ApplicationMenu> |
    Then Verify Benefit Plan window should be displayed

    Examples: 
      | ApplicationMenu                   |
      | Benefits->Planlist - Benefit Plan |
