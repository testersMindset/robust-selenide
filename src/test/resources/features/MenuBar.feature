Feature: Validation of menu bar on demo page

  @anytest
  Scenario Outline: Check if the menu works correctly on the home page
    Given user validates links dropdown on the menu are working correctly
    And user registers new user with following values:
      | gender          | <gender>          |
      | firstName       | <firstName>       |
      | lastName        | <lastName>        |
      | day             | <day>             |
      | month           | <month>           |
      | year            | <year>            |
      | email           | <email>           |
      | password        | <password>        |
      | confirmPassword | <confirmPassword> |

    Examples:
      | gender | firstName | lastName | day | month | year | email            | password | confirmPassword |
      | male   | Michael   | Chapman  | 12  | May   | 1975 | male@email.com   | 1234890  | 1234890         |
      | male   | Michelle  | Chapman  | 11  | March | 1965 | female@email.com | 1234890  | 1234890         |


