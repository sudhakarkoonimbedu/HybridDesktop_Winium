Feature: SmokeTest Hybrid Desktop GUI - Planlist Post Pay

  Background: performLogin
    Given the user access the Hybrid Desktop Application
      | userid   |  |
      | password |  |
      | region   |  |

  @SmokeTest
  Scenario Outline: Perform SmokeTest On Planlist Post Pay Application
    Given User in Landing Page, he selects the application from menu
      | menu | <ApplicationMenu> |
    Then Verify Post Pay Report Definition window should be displayed

    Examples: 
      | ApplicationMenu               |
      | Benefits->Planlist - Post Pay |
