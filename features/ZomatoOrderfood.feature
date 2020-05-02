Feature: validaiton of order food 

@orderfood 
Scenario Outline: validation of order food module 
	Given user launches Zomato  application 
	When user is navigated to Zamoto home page 
	And user clicks on OrderFood button 
	And user provides searching location "<searchinglocation>" 
	And user selects value from suggestions "<suggestionval>" 
	And user provides restaurants name "<restaurantsname>" 
	
	#https://www.zomato.com/hyderabad/order?city_id=6
	Examples: 
	
		|searchinglocation|restaurantsname|suggestionval|
		|madhapur|biriyani|Best Western Jubilee Ridge, Madhapur, Ranga Reddy, Hyderabad|
		
		
