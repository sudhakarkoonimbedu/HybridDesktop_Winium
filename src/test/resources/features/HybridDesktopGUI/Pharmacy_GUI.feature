Feature: SmokeTest Hybrid Desktop GUI - Pharmacy

  Background: performLogin
    Given the user access the Hybrid Desktop Application
      | userid   |  |
      | password |  |
      | region   |  |

  @SmokeTest
  Scenario Outline: Perform SmokeTest On Pharmacy Application
    Given User in Landing Page, he selects the application from menu
      | menu | <ApplicationMenu> |
    Then Verify Pharmacy Network Rate Maintenance window with Search Pharmacies by Network radio button should be displayed
    And Click on Cancel button in Pharmacy - Pharmacy Network Rate Maintenance window

    Examples: 
      | ApplicationMenu               |
      | Provider->Pharmacy - Pharmacy |
