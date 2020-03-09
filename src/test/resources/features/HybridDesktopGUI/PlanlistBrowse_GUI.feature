Feature: SmokeTest Hybrid Desktop GUI - Planlist Browse

  Background: performLogin
    Given the user access the Hybrid Desktop Application
      | userid   |  |
      | password |  |
      | region   |  |

  @SmokeTest
  Scenario Outline: Perform SmokeTest On Planlist Browse Application
    Given User in Landing Page, he selects the application from menu
      | menu | <ApplicationMenu> |
    Then Verify Browse window should be displayed

    Examples: 
      | ApplicationMenu             |
      | Benefits->Planlist - Browse |
