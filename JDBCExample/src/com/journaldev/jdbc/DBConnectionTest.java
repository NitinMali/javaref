package com.journaldev.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnectionTest {
	
	private static final String QUERY = "select activity_id,assigned_to from appointment";

	public static void databaseOperation() throws MyException {
		//using try-with-resources to avoid closing resources (boiler plate code)
				try{
					Connection con = DBConnection.getConnection();
					//con = null; //To test exception uncomment this line
						Statement stmt = con.createStatement();
						ResultSet rs = stmt.executeQuery(QUERY); 
					
					while(rs.next()){
						String activity_id = rs.getString("activity_id");
						String assigned_to = rs.getString("assigned_to");
						System.out.println(activity_id + "," +assigned_to);
					}
				}
				catch(SQLException e){
					throw new MyException("It is my SQLException");
				}
				catch(NullPointerException e){
					throw new MyException("It is my NullPointerException");
				}

	}
	public static void main(String[] args){				
		try {
			databaseOperation();
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}	
		System.out.println("End...!");
		
	}

}
class MyException extends Exception{
	
	public MyException(String message){
		super(message);
	}
}
