Feature: login funtionality

@login
Scenario Outline: login with valid username

Given user is on LUMA app
When user enters valid "<username>" and "<password>"
Then user is logged in successfully

Examples:
| username | password |
| roni_cost@example.com | roni_cost3@example.com |


Scenario Outline: login with invalid username

Given user is on LUMA app
When user enters valid "<username>" and "<password>"
Then user is not logged in successfully

Examples:
| username | password |
| guna	| Guna21334 |


