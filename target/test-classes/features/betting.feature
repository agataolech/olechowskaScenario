Feature: Place a  bet

  Scenario: Check the return value
    Given user is on betting page
    When user navigate to football event
    And user select a <event>
    And place a <stake> for the home team to ‘Win’
    Then the <return> is equals to <odds> multiplied by <stake>


