@SmokeTest, @RegressionTest
Feature: This is our first feature
@First
Scenario: We are learning cucumber

Given The chrome browser is launch 
When The url is launch
Then verify the title of homepage is "IJmeet"

@Second
Scenario: We are learning cucumber-2.
Given The chrome browser is launched
When The url is launched
Then verify the url of homepage is "https://ijmeet.com/"