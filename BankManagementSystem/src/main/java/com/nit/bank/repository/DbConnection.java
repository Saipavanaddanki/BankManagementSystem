package com.nit.bank.repository;
import java.sql.Connection;
import static com.nit.bank.repository.DbConnectionData.*;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DbConnection  {

 private static	Connection conn=null;
	private DbConnection() {
		
	}
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection(URL,USERNAME,PASSWORD);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getRepository() {
		return conn;
	}
	
	
}
