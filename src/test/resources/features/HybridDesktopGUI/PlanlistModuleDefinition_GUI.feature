Feature: SmokeTest Hybrid Desktop GUI - Planlist Module Definition

  Background: performLogin
    Given the user access the Hybrid Desktop Application
      | userid   |  |
      | password |  |
      | region   |  |

  @SmokeTest
  Scenario Outline: Perform SmokeTest On Planlist Module Definition Application
    Given User in Landing Page, he selects the application from menu
      | menu | <ApplicationMenu> |
    Then Verify Module Definitions window should be displayed

    Examples: 
      | ApplicationMenu                        |
      | Benefits->Planlist - Module Definition |
