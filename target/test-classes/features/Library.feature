Feature: Test my library

      Scenario: Get my library's name
        Given : My library is called "myLib"
        When  : When somebody asks "myLib" is my library
        Then  : I should say "Yes"


      Scenario: Where is my library
        Given : My library is in "Edinburgh"
        When  : somebody asks whether my library is in "Edinburgh"
        Then  : I should say to him "Yes"