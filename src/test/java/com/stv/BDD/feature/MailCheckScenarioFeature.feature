Feature: Load New customer page

  Scenario Outline: 01. Initialization/first step of a new customer's creation
    Given The page with 2 input forms Sign in and New customer opened
    When Enter "<email>" in the field Email address inside the input form New customer
    And Press the button Continue
    Then The full registration input form New customer opened
    Examples:
      | email                 |
      | skutova2.20@gmail.com |
      | ivanova2.20@gmail.com |
      | petrova2.20@gmail.com |
