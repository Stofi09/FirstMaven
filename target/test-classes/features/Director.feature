Feature: Test the Director

    Scenario: I check the name of the director
      Given The director's name is "Tarantino"
      When I check the name in the list
      Then It should return a "true"