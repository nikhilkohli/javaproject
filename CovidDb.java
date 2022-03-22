package com.covid.Dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class CovidDb {
	
	public static Connection getConnection() 
			  throws Exception
			  {
				
				 String driverName = "org.postgresql.Driver";
				  Class.forName(driverName);
				  Connection conn = DriverManager.getConnection(
				             "jdbc:postgresql://localhost/covid","postgres","nikhil"
				             		+  "");
				
				return conn; 
			  }


}
