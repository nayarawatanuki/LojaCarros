package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {

	public static Connection getConnection()
			throws SQLException {
		Connection connection = null;

		connection = DriverManager.getConnection("jdbc:mysql://localhost/lojaCarros",
				"root",
				"");

		if (connection == null)
			throw new SQLException("Connection class could not be created.");

		return connection;
	}
}
