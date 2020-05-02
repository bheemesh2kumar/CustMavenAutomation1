Feature: vlidation of stock markets 

@markets
Scenario Outline: validation of market maodule link and page 

	Given user is launched moneycontrol site 
	When user navigates fixed deposite calculator section"<pageTitle>" 
	And user clicks on Market value link 
	And user navigates to Market page 
	
	Examples: 
		|pageTitle|
		|Fixed Deposit Calculator: Compound Interest Calculator on Monthly, Quarterly, Half Yearly or Yearly basis, Bank FD Calculator. Fixed Deposit Compound/Simple Interest Calculator India, FD Maturity/Deposit Calculator|
		
	