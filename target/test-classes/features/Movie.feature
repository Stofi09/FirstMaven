Feature: Test the Director

    Scenario: I check the name of the director
      Given   The director's name is "Tarantino"
      When    I check the name in the list
      Then    It should return a "true"

    Scenario Outline: I check the genre of the movie
      Given   The genre of the movie is "<genre>"
      When    I check the  genre type
      Then    It should return an "<answer>"

      Examples:
        | genre           | answer |
        | Biography       | Yeppers|
        | Poetry          | Nope   |
        | Science         | Nope   |
        | Non Fiction     | Nope   |