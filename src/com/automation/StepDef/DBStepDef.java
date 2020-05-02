package com.automation.StepDef;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Map;

import com.automation.Utilities.DButilities;
import com.automation.Utilities.Propertiesreader;

import cucumber.api.java.en.Given;
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
		
		finally
		{
			
			if(con!=null)
			{
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

			if (queryvalues.size() > 0) {
				
				
				for(int i=0;i<queryvalues.size();i++)
				{
					System.out.println(queryvalues.get(i));
				}
				
				
			}
			
			con.close();
			stmt.close();
			rs.close();

		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
		
		finally
		{
			
			if(con!=null)
			{
				con.close();
			}
			
		}
	}

}
