Feature: validation of bookatable module 


Background: 
	Given user launches Zomato  application 
	When user finds Booktable option zomato web page 
	And user clicks on book a table page 
	
	
	
@booktable 
Scenario: validation sort by section and its hyper link functionality 


	And user should see Sort by lable is displayed at left on page 
	And user should see cost category items count under categorycount 
		|categorycount|
		|5|
	Then validate that if user is able to click all category items 
	
	
@goldpartnertestcase 
Scenario Outline: Validation of Zomoto Gold partner and page navigation 

	Then check if user can see Zomoto gold partner check box deselet by default 
	And user clicks on Zomoto gold partner check box 
	Then  validate that if user can see page number"<pagenumber>" 
	Then validate that if user can see left angle icon disable format 
	Then validate that if user can see all navigation numbers show data navigationnumbers when mouseover on numbers 
	
		|navigationnumbers|
		|Go to Page 1|
		|Go to Page 2|
		|Go to Page 3|
		|Go to Page 4|
		|Go to Page 5|
		|Next 5 Pages|
		
	Then validate that if user can see right angle icon enable format 
	Examples: 
	
		|pagenumber|
		|Page 1 of 10 |
		
		
