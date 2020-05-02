Feature: Validaton of google  search sugggestions 
@google
Scenario Outline: Validation  of google search suggestions 
	Given user is launched google home page 
	When page title is "<pagetitle>" 
	And User enters "<Searchkeyword>" 
	And user selects "<Dropdownval>" from suggestions 
	Then validate that if user navigates to respective home page "<Expectedpage>" 
	Examples: 
	
		|pagetitle|Searchkeyword|Dropdownval|Expectedpage|
		|Google|singapore|singapore capital|test|