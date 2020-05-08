package com.automation.StepDef;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.automation.Utilities.DButilities;
import com.automation.Utilities.Propertiesreader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DBStepDef {

	DButilities DButilitiesef;
	Propertiesreader Propertiesreaderref;

	@Given("^user is already connected to MySQL DB successfully$")
	public void user_is_already_connected_to_MySQL_DB_successfully() throws ClassNotFoundException, SQLException {

		Connection con = null;
		try {
			DButilitiesef = new DButilities();
			Propertiesreaderref = new Propertiesreader();

			con = DButilitiesef.getconnection(Propertiesreaderref.getdrivername(), Propertiesreaderref.geturlname(),
					Propertiesreaderref.getusername(), Propertiesreaderref.getuserpwd());
			Statement stmt = con.createStatement();
			String query = "select * from student;";
			ResultSet rs = stmt.executeQuery(query);

			ArrayList<Map<String, Object>> queryvalues = DButilitiesef.getresults(rs);

			if (queryvalues.size() > 0) {
				System.out.println("****************************" + " " + "DB connected successfully");
			}

			con.close();
			stmt.close();
			rs.close();

		} catch (Exception ex) {

			ex.printStackTrace();
		}

		finally {

			if (con != null) {
				con.close();
			}

		}
	}

	@When("^user retrives students information from student table$")
	public void user_retrives_students_information_from_student_table() throws SQLException {

		Connection con = null;
		try {
			DButilitiesef = new DButilities();
			Propertiesreaderref = new Propertiesreader();

			con = DButilitiesef.getconnection(Propertiesreaderref.getdrivername(), Propertiesreaderref.geturlname(),
					Propertiesreaderref.getusername(), Propertiesreaderref.getuserpwd());
			Statement stmt = con.createStatement();
			String query = "select * from student;";
			ResultSet rs = stmt.executeQuery(query);

			ArrayList<Map<String, Object>> queryvalues = DButilitiesef.getresults(rs);

			System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

			con.close();
			stmt.close();
			rs.close();

		} catch (Exception ex) {

			ex.printStackTrace();
		}

		finally {

			if (con != null) {
				con.close();
			}

		}
	}

	@Then("^check two tables student and student(\\d+) data is matched$")
	public void check_two_tables_student_and_student_data_is_matched(int arg1) throws SQLException {

		Connection con = null;
		try {
			DButilitiesef = new DButilities();
			Propertiesreaderref = new Propertiesreader();

			con = DButilitiesef.getconnection(Propertiesreaderref.getdrivername(), Propertiesreaderref.geturlname(),
					Propertiesreaderref.getusername(), Propertiesreaderref.getuserpwd());
			Statement stmt1 = con.createStatement();
			Statement stmt2 = con.createStatement();
			String studentquery = "select * from student;";
			String student1query = "select * from student1;";
			ResultSet rs1 = stmt1.executeQuery(studentquery);
			ResultSet rs2 = stmt2.executeQuery(student1query);

			ArrayList<Map<String, Object>> Student1vals = DButilitiesef.getresults(rs1);
			ArrayList<Map<String, Object>> Student2vals = DButilitiesef.getresults(rs2);

			System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

			if (Student1vals.size() > 0) {

				for (int i = 0; i < Student1vals.size(); i++) {

					System.out.println(Student1vals.get(i));
				}

			}

			System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

			if (Student2vals.size() > 0) {

				for (int i = 0; i < Student2vals.size(); i++) {

					System.out.println(Student2vals.get(i));
				}

			}

			System.out.println("---------------------------------");

			for (int i = 0; i < Student2vals.size(); i++) {
				int flag = 0;
				Map<String, Object> mapval = Student2vals.get(i);

				Iterator<Entry<String, Object>> iter = mapval.entrySet().iterator();

				while (iter.hasNext()) {
					Entry<String, Object> entry = iter.next();
					if (entry.getKey().contains("demo1")) {
						iter.remove();

					}

				}

				for (int j = 0; j < Student1vals.size(); j++) {

					if (Student2vals.get(i).equals(Student1vals.get(j))) {
						System.out.println(Student2vals.get(i) + "record matched");
						flag = 1;
						break;

					}

				}

				if (flag == 0) {
					System.out.println("record" + Student2vals.get(i) + "not matched");
				}

			}

		} catch (Exception ex) {

			ex.printStackTrace();
		}

		finally {

			if (con != null) {
				con.close();
			}

		}

	}

}
