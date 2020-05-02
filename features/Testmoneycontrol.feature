Feature: Validation of money control site 

@fixeddepo
Scenario Outline: Validation of fixed deposit calculator 

	Given user is launched moneycontrol site 
	When user navigates fixed deposite calculator section"<pageTitle>" 
	And user provides "<Prinipal>","<rateofIntrest>","<Period>","<Frequency>" 
	And user clicks on Calculate button 
	Then validate that if user is populated with maturity result 
	
	Examples: 
	
		|Prinipal|rateofIntrest|Period|Frequency|pageTitle|
		|500000|8.5|30|Simple Interest|Fixed Deposit Calculator: Compound Interest Calculator on Monthly, Quarterly, Half Yearly or Yearly basis, Bank FD Calculator. Fixed Deposit Compound/Simple Interest Calculator India, FD Maturity/Deposit Calculator|
		
