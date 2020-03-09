Feature: SmokeTest Hybrid Desktop GUI - Deductible Plan

  Background: performLogin
    Given the user access the Hybrid Desktop Application
      | userid   |  |
      | password |  |
      | region   |  |

  @SmokeTest
  Scenario Outline: Perform SmokeTest On Deductible Plan Application
    Given User in Landing Page, he selects the application from menu
      | menu | <ApplicationMenu> |
    Then Verify Deductible Plan Main window should be displayed
    And Click on Cancel button in Deductible Plan Main window

    Examples: 
      | ApplicationMenu           |
      | Benefits->Deductible Plan |
