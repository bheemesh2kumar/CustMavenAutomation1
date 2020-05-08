$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DBValidation.feature");
formatter.feature({
  "line": 1,
  "name": "Validation of DB results in mysql db",
  "description": "",
  "id": "validation-of-db-results-in-mysql-db",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "validation of Student table records in schoolinfo",
  "description": "",
  "id": "validation-of-db-results-in-mysql-db;validation-of-student-table-records-in-schoolinfo",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@studentinfo"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is already connected to MySQL DB successfully",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user retrives students information from student table",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "check two tables student and student1 data is matched",
  "keyword": "Then "
});
formatter.match({
  "location": "DBStepDef.user_is_already_connected_to_MySQL_DB_successfully()"
});
formatter.result({
  "duration": 836250278,
  "status": "passed"
});
formatter.match({
  "location": "DBStepDef.user_retrives_students_information_from_student_table()"
});
formatter.result({
  "duration": 21720053,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 36
    }
  ],
  "location": "DBStepDef.check_two_tables_student_and_student_data_is_matched(int)"
});
formatter.result({
  "duration": 45285007,
  "status": "passed"
});
});