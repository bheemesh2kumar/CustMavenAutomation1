Feature: validation of zamoto filters 


@zamotofilter 
Scenario Outline: Validaton of zomato filters 

	Given user launches Zomato  application 
	When applicaton page title is "<pagetitle>" 
	And user selects place locaton "<placelocation>" 
	And user selects place of restaurants "<restaurant>" 
	Then validate that if user is able to navigate to respective page 
	Examples: 
	
		|pagetitle|placelocation|restaurant|
		|Restaurants - Hyderabad Restaurants, Restaurants in Hyderabad | Zomato India| Zomato India|Zomato India|Biriyani|
		
		
		
	