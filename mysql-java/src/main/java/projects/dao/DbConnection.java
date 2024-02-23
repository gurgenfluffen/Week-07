package projects.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import projects.exception.DbException;

public class DbConnection {

	private static String HOST = "local host";
	private static String PASSWORD = "projects";
	private static int PORT = 3306;
	private static String SCHEMA = "projects";
	private static String USER = "projects";
	
	public static Connection getConnection() {
		String uri = String.format("jdbc:mysql://local host:3306/projects?user=projects&password=projects",
				HOST, PORT, SCHEMA, USER, PASSWORD);
		
		try {
			Connection con = DriverManager.getConnection(uri);
			System.out.println("Connection to " + SCHEMA + " is successful.");
			return con;
		} catch (SQLException e) {
			System.out.println("Unable to connect at " + uri);
			throw new DbException ("Unable to connect at " + uri);
		}
	}
}
