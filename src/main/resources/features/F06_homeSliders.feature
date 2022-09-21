@smoke
Feature:user check the correctness of the two sliders
  Scenario: verify that guest user could click in slider wrapper
    When user select first slider
    Then nokia page open
    When user select second slider
    Then iphone page open