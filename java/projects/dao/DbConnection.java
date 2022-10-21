package projects.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import projects.exception.DbException;


	//Constants to easily change something like the PW
public class DbConnection {
		private static final String HOST = "Zoovie";
		private static final String PASSWORD = "projects";
		private static final int PORT = 3306;
		private static final String SCHEMA = "projects";
		private static final String USER = "projects";

		public static Connection getConnection() {
			String uri = //This is a format string with these format specifiers and takes them in order. So the parameter first is: HOST, next is PORT, SCHEMA, USER, PASSWORD.
					String.format("jdbc:mysql://%s:%d/%s?user=%s&password=%s", 
					HOST, PORT, SCHEMA, USER, PASSWORD);
			//Then we printed our connection uri.
		
			try {// and asked the driver manager to look up the driver for us, and ask the driver to make the connection.
				Connection conn = DriverManager.getConnection(uri);
				System.out.println("Successfully obtained connection!"); // We know if we get this print-line, that we got a connection. Otherwise it would throw an exception, then a checked exception and unchecked exception.
				return conn;
				
			} catch (SQLException e) {
				System.out.println("Error getting connection.");
				throw new DbException(e);
			}
		}
	}

