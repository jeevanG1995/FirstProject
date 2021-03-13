Feature: Login to stack overflow website 
	existing user should be able to login to website

Scenario: Login to account with valid credentials 
	Given user navigates to stack overflow website 
	And user clicks on the login button 
	And  user enters a valid user name 
	And  user enter a valid password 
	When  user clicks on the submit login button 
	Then  user should be taken to success page