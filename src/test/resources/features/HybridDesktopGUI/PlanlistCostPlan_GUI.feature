Feature: SmokeTest Hybrid Desktop GUI - Planlist Cost Plan

  Background: performLogin
    Given the user access the Hybrid Desktop Application
      | userid   |  |
      | password |  |
      | region   |  |

  @SmokeTest
  Scenario Outline: Perform SmokeTest On Planlist Cost Plan Application
    Given User in Landing Page, he selects the application from menu
      | menu | <ApplicationMenu> |
    Then Verify Cost Plan window should be displayed

    Examples: 
      | ApplicationMenu                |
      | Benefits->Planlist - Cost Plan |
