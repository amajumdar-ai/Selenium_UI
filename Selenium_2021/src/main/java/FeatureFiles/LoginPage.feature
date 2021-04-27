Feature: Login page feature

Scenario: Login Page Title 

Given I have landed on the Login Page
When I get the title of the page
Then I should see title as "Amazon"

Scenario: User should able to login with valid credentials

Given I am on the login page
When I enter valid username "9113396216"
And I enter valid password "aa2345678"
And I click on the login button
Then I should be logged in successfully