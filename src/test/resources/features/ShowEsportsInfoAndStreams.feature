Feature: Show Esports Info and Streams

  Scenario Outline: Access Esports information
    Given I am in the website
    When I <click> the Esports section
    Then I should see a <response> Esports Information screen
    Examples:
    |click|   response                                            |
    |true | "Welcome to the Esports information and streams page!"|
    |false| "No response"                                         |

  Scenario Outline: Access Livestream section
    Given I am in the <Esports> section
    When I <clickStreams> the Streams section
    Then I should see a <responseStreams> Livestreams response screen
    Examples:
    |Esports    |clickStreams       |responseStreams                                        |
    |true       |true               |"You can choose to watch any of the following streams:"|
    |false      |false              |"No response"                                          |
    |true       |false              |"No response"                                          |