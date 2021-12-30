Feature: This is our second feature file.
@Regression
Scenario: We are providing int parameters through cucumber

Given We have two numbers 5 & 6
When We add them 
Then Print the result.
@Regression
Scenario: We providing word parameters to sort alphabetically.

Given We have two words "India" & "China"
Then Sort them alphabetically
@Regression
Scenario: We are providing float parameters through cucumber.
Given We have two float numbers 5.14 & 6.56
When We add float numbers. 
Then Print the output.

Scenario:We are providing list parameters through cucumber
Given I have following numbers :
      |11|
      |12|
      |14|
      |15|
      |16|
      |17|
Then Print all nummbers from list.
 