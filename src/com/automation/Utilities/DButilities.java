package com.automation.Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DButilities {

	public Connection getconnection(String driver, String url, String un, String pwd)
			throws ClassNotFoundException, SQLException {

		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, un, pwd);

		return con;

	}

	public ArrayList<Map<String, Object>> getresults(ResultSet rs) throws SQLException {

		ArrayList<Map<String, Object>> arrymap = new ArrayList<Map<String, Object>>();

		while (rs.next()) {
			HashMap<String, Object> mapvalues = new HashMap<String, Object>();

			int colcount = rs.getMetaData().getColumnCount();

			for (int i = 1; i <= colcount; i++) {

				mapvalues.put(rs.getMetaData().getColumnLabel(i), rs.getObject(i));

			}

			arrymap.add(mapvalues);
		}

		return arrymap;
	}

}
