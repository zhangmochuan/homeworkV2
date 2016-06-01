package com.guitar.util;

import java.sql.*;

public class DBUtil {
	private static String driverName;
	private static String dbURL;
	static{
		driverName = "org.sqlite.JDBC";
		dbURL="jdbc:sqlite:\\E:/GuitarData.db";
	}
	public static Connection open(){
		try {
				Class.forName(driverName);
				return DriverManager.getConnection(dbURL);
			} catch (Exception e) {
				e.printStackTrace();
			}
		return null;
	}
	public static void close(Connection Conn){
		if(Conn != null){
			try {
				Conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
