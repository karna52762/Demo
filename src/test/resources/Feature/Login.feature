Feature: Validating login fb

Scenario: valid username and invalid password
Given user is on FB Page
When User enter username and password
And user should click login button
Then user need to validaate