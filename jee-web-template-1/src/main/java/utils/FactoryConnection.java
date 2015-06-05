package utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

public class FactoryConnection {

	// private final static String URL = "jdbc:mariadb://localhost:3306/coffee";
	//
	// public static Connection getConection() throws SQLException {
	// Connection
	//
	// con = DriverManager.getConnection(URL, "root", "root");
	//
	// return con;
	// }

	public static DataSource setupDataSource() {
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName("org.mariadb.jdbc.Driver");
		ds.setUrl("jdbc:mariadb://localhost:3306/recruit");
		ds.setPassword("root");
		ds.setUsername("root");
		return ds;
	}

	public static Connection getConection() throws SQLException {

		Connection con = null;
		try {
			InitialContext initContext = new InitialContext();
			DataSource ds = setupDataSource();
			// DataSource ds = (DataSource)
			// initContext.lookup("java:comp/env/jdbc/appname");

			con = ds.getConnection();

		} catch (NamingException e) {

			e.printStackTrace();
		}

		return con;
	}
}
