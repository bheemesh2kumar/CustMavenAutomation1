Feature: validation of bookatable module 

@booktable
Scenario: validation sort by section and its hyper link functionality 

	Given user launches Zomato  application 
	When user finds Booktable option zomato web page 
	And user clicks on book a table page 
	And user should see Sort by lable is displayed at left on page 
	And user should see cost category items count under categorycount 
		|categorycount|
		|5|
	Then validate that if user is able to click all category items 
	
