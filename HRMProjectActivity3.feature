@HRMProjectActivity3
Feature: Add multiple employees
Scenario Outline: Add multiple employees using an the Examples table
	Given Open the ​OrangeHRM​ page and login with credentials provided
	When Find the PIM option in the menu and click it.
	When Click the Add button to add a new Employee.
	And  Make sure the Create Login Details checkbox is checked.
	And Fill in the required fields "<FirstName>" and "<LastName>" and "<UserName>" and "<PassWord>" and "<ConfirmPassWord>" and click Save.
	Then Verify that the employees have been created with "<FirstName>" and "<LastName>".
	And Close browser
Examples:
	|FirstName |LastName |UserName   |PassWord   |ConfirmPassWord|
	|Mat123|Shaik1|Matshaik1|Pa$$w0rd|Pa$$w0rd    |
	|Mat234|Shaik2|Matshaik2|Pa$$w0rd|Pa$$w0rd    |