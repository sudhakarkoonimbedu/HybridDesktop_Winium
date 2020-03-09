Feature: SmokeTest Hybrid Desktop GUI - Pharmacy Simulation

  Background: performLogin
    Given the user access the Hybrid Desktop Application
      | userid   |  |
      | password |  |
      | region   |  |

  @SmokeTest
  Scenario Outline: Perform SmokeTest On Pharmacy Simulation Application
    Given User in Landing Page, he selects the application from menu
      | menu | <ApplicationMenu> |
    Then Verify Simulated Pharmacy Rate Retrieval Facility window should be displayed
    And Click on Cancel button in Simulated Pharmacy Rate Retrieval Facility window

    Examples: 
      | ApplicationMenu                 |
      | Provider->Pharmacy - Simulation |
