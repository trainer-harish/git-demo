Feature: Account Registration feature



Scenario: Validate user able to register his account

Given user is on new Account Registration form
When a new customer is created
When user enters the following details
|	First Name	|	Last Name	|	E-mail						|	Password	|
|	sfdscxdsvdsv			|	Rdajcdscsddsdad			|	hcsarsdcsidsdhss@gmail.com	|	Adbscsxsxdsdc@1234	|
And user Clicks on Create Account button
Then a new account is created