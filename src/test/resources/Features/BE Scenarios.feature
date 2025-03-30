Feature: Get random jokes
  @BE
  Scenario: Verify that the user can get 6 random jokes
    When I set end point "endPoint"
    And I get params for Api call from "test.json" for "random6"
    And I perform "GET" request
    Then I verify that the status code is "200"
    And I verify that number of jokes is "6"

  @BE
  Scenario: Verify that the user can get programming joke
    When I set end point "endPoint"
    And I get params for Api call from "test.json" for "programming"
    And I perform "GET" request
    Then I verify that the status code is "200"
    And I verify that the type of joke is "programming"

  @BE
  Scenario: Verify that the user can get knock-knock joke
    When I set end point "endPoint"
    And I get params for Api call from "test.json" for "knock-knock"
    And I perform "GET" request
    Then I verify that the status code is "200"
    And I verify that the type of joke is "knock-knock"

    @BE
  Scenario: Verify that the user can get general joke
    When I set end point "endPoint"
    And I get params for Api call from "test.json" for "general"
    And I perform "GET" request
    Then I verify that the status code is "200"
    And I verify that the type of joke is "general"

    @BE
  Scenario: Verify that the user can get dad joke
    When I set end point "endPoint"
    And I get params for Api call from "test.json" for "dad"
    And I perform "GET" request
    Then I verify that the status code is "200"
    And I verify that the type of joke is "dad"




