Feature: Test my library Example

Scenario Outline: Does the book available?
Given I would like to rent "<book>"
When  I ask the librarian
Then  I should be told "<answer>"

Examples:
| book           | answer |
| Effective Java | Yeppers|
| Saturnine      | Nope   |
| 1982           | Nope   |
| A book      | Nope   |