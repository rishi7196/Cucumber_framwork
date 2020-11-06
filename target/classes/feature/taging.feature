@functionalTesting
Feature: OrangeHrm application Testing
	Scenario: Login with correct username and correct password
	    Given this is valid login test
	    
	    @RegressionTest@smoketest
	  Scenario: Login with incorrect username and incorrect password
	    Given this is invalid login test
	    @smoketest
	    Scenario: create a leave 
	    Given this is a leave test case
	    
	    @smoketest
	    Scenario: Ceate a time 
	    Given this is a time test case
	    @Regressiontest
	    Scenario: Edit myInfo deatils
	    Given this is a muInfo details	    
	    
	    @RegressionTest@smoketest
	    Scenario: Click on logout application
	    Given this is a logout test case