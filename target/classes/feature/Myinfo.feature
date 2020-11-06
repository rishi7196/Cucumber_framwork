#Feature: OrangeHRM myinfo feature
#	
#Scenario Outline: OrangeHrm Myinfo test 
#	Given  user allready in login page 
#	When  title of login page is OrangeHRM 
#	Then User enters "<username>" and "<password>" 
#	Then user clicks on Login button 
#	Then user is home_page 
#	Then click on MyInfo page
#	Then click on edit button 
#	Then enters "<firstname>" and "<lastname>" 
#	Then enters "<employee_id>"
#	Then select male radio button
#	Then select nationlity
#	Then clicks on save button
#	
#	Examples: 
#		| username | password |firstname |lastname   |employee_id|
#		| Admin    | admin123 |Lindaa     |Anderson  |10002      |
#		