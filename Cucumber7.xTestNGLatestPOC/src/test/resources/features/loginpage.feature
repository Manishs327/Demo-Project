@Test
Feature: This is my first feature

@Smoke @Regression
Scenario Outline: Login to the application
Given i am in the login page with <LoginPageTitle>
When i have entered the email as <email>
And i have entered the password as <password>
And i have clicked on the Sign In button
And I should be logged in to the application
Then the title of the page should be <Title>

Examples:
|LoginPageTitle		|email							|password|Title																	|
|Your store. Login|admin@yourstore.com|admin	 |Dashboard / nopCommerce administration|
#|Your store. Login|admin@yourstore.com|admin	 |Dashboard / nopCommerce administration|
#|Your store. Login|admin@yourstore.com|admin	 |Dashboard / nopCommerce administration|
#|Your store. Login|admin@yourstore.com|admin	 |Dashboard / nopCommerce administration|

#@Smoke
#Scenario Outline: Login to the application
#Given i am in the login page with <LoginPageTitle>
#When i have entered the email as <email>
#And i have entered the password as <password>
#And i have clicked on the Sign In button
#And I should be logged in to the application
#Then the title of the page should be <Title>
#
#Examples:
#|LoginPageTitle		|email							|password|Title																	|
#|Your store. Login|admin@yourstore.com|admin	 |Dashboard / nopCommerce administration|
#|Your store. Login|admin@yourstore.com|admin	 |Dashboard / nopCommerce administration|
#|Your store. Login|admin@yourstore.com|admin	 |Dashboard / nopCommerce administration|
#|Your store. Login|admin@yourstore.com|admin	 |Dashboard / nopCommerce administration|
