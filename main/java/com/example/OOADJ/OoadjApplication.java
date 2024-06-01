package com.example.OOADJ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class OoadjApplication {

	public static void main(String[] args) {

		SpringApplication.run(OoadjApplication.class, args);
		try {
			// Establishing a database connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/OOADJ_project", "root", "1977@shivani");
			if (connection != null) {
				System.out.println("Connected to the database!");
			} else {
				System.out.println("Failed to connect to the database!");
			}
			// Don't forget to close the connection when done
			connection.close();
		} catch (SQLException e) {
			// Handle any SQL exceptions
			System.out.println("Exception occurred while connecting to the database:");
			e.printStackTrace();
		}
	}

}
