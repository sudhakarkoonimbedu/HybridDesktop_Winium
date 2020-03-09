Feature: SmokeTest Hybrid Desktop GUI - Payment History Inquiry

  Background: performLogin
    Given the user access the Hybrid Desktop Application
      | userid   |  |
      | password |  |
      | region   |  |

  @SmokeTest
  Scenario Outline: Perform SmokeTest On Payment History Inquiry Application
    Given User in Landing Page, he selects the application from menu
      | menu | <ApplicationMenu> |
    Then Verify Payment History Search window should be displayed
    And Click on Cancel button in Payment History Search window

    Examples: 
      | ApplicationMenu                        |
      | Miscellaneous->Payment History Inquiry |
