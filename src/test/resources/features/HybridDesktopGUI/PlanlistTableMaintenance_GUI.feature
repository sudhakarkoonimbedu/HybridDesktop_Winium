Feature: SmokeTest Hybrid Desktop GUI - Planlist Table Maintenance

  Background: performLogin
    Given the user access the Hybrid Desktop Application
      | userid   |  |
      | password |  |
      | region   |  |

  @SmokeTest
  Scenario Outline: Perform SmokeTest On Planlist Table Maintenance Application
    Given User in Landing Page, he selects the application from menu
      | menu | <ApplicationMenu> |
    Then Verify Table Definition and Maintenance window should be displayed

    Examples: 
      | ApplicationMenu                        |
      | Benefits->Planlist - Table Maintenance |
