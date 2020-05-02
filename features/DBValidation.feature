Feature: Validation of DB results in mysql db

@studentinfo
Scenario: validation of Student table records in schoolinfo
Given user is already connected to MySQL DB successfully
When user retrives students information from student table
