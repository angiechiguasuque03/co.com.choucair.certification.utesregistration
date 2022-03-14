#Autor: Angie Lorena Chiguasuque Nieto


  @stories
  Feature: User UTest
    As a user, I want to registrer in Utest.com, to create a login user to the website.

  Scenario: Create new user
    Given Nikol wants to sign up for Utest
    When she finds "Join Today", click and fill in the requires fields.
    Then confirm the user creation.