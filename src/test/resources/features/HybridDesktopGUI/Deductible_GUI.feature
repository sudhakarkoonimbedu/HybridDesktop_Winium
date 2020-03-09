Feature: SmokeTest Hybrid Desktop GUI - Deductible

  Background: performLogin
    Given the user access the Hybrid Desktop Application
      | userid   |  |
      | password |  |
      | region   |  |

  @SmokeTest
  Scenario Outline: Perform SmokeTest On Deductible Application
    Given User in Landing Page, he selects the application from menu
      | menu | <ApplicationMenu> |
    Then Verify Deductible Main window should be displayed
    And Click on Cancel button in Deductible Main window

    Examples: 
      | ApplicationMenu      |
      | Benefits->Deductible |
