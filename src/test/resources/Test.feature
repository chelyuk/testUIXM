Feature: Calendar


  Scenario Outline: operate with Economic Calendar
    Given open HomePage
    And set browser "<screen size>"
    And click Research and Education
    And open Economic Calendar
    When  click date check that it is correct
      | Yesterday |
      | Today     |
      | Tomorrow  |
      | This Week |
    And click here
    Then Check that Risk Disclosure document was opened in a new tab

    Examples:
      | screen size |
      | 800x600     |
      | 1024x768    |
      | fullscreen  |



