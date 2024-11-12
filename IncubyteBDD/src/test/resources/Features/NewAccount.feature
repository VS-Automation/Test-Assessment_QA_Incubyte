Feature: New Account creation automation of magento application
Scenario: Check login is successful with valid new creds
Given User is on account creation page
When User enters firstname, lastname, email_address, password and password-confirmation	
And Clicks on Create an Account
Then User is navigated to home page
And Closed the browser