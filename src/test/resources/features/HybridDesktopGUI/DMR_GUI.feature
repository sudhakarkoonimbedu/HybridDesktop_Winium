Feature: SmokeTest Hybrid Desktop GUI - DMR

  Background: performLogin
    Given the user access the Hybrid Desktop Application
      | userid   |  |
      | password |  |
      | region   |  |

  @SmokeTest
  Scenario Outline: Perform SmokeTest On DMR Application
    Given User in Landing Page, he selects the application from menu
      | menu | <ApplicationMenu> |
    Then Verify DMR Main window should be displayed
    And Click on Close button in DMR Main window

    Examples: 
      | ApplicationMenu |
      | Claim->DMR      |
