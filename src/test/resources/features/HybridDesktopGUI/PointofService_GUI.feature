Feature: SmokeTest Hybrid Desktop GUI - Point of Service

  Background: performLogin
    Given the user access the Hybrid Desktop Application
      | userid   |  |
      | password |  |
      | region   |  |

  @SmokeTest
  Scenario Outline: Perform SmokeTest On Point of Service Application
    Given User in Landing Page, he selects the application from menu
      | menu | <ApplicationMenu> |
    Then Verify POS Main window should be displayed
    And Click on Cancel button in POS Main window

    Examples: 
      | ApplicationMenu         |
      | Claim->Point of Service |
