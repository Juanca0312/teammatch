Feature: Offer rewards for completing achievements

  Scenario Outline:
    Given I have <loggedIn> logged in to my account
    When I complete <completed> all <numberOfRequirements> requirements for an achievement
    Then I should see a reward available <rewardMsg>
    Examples:
    |loggedIn   |completed    |numberOfRequirements   |rewardMsg                                  |
    |true       |3            |3                      |"Achievement complete. Reward available!"|
    |false      |0            |0                      |"No response"                                       |
    |true       |4            |5                      |"No response"                                       |
    |true       |2            |2                      |"Achievement complete. Reward available!" |

  Scenario Outline:
    Given I am viewing my profile
    When I click <achievementClick> on the See achievements section
    Then I should see a <achievementsResponse> Achievements response screen
    Examples:
    |achievementClick    |achievementsResponse               |
    |true     |"Achievement progress:"            |
    |false    |"No response"  |