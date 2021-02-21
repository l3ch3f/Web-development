package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class createDemo {


	public static void main(String[] args) {


		String jdbcUrl = "jdbc:mysql://localhost:3307/hb-01-one-to-one-uni? useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String user = "root";
		String pass = "Welkom01!";
		try {
			System.out.println("Connecting to db: " + jdbcUrl);
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
			System.out.println(myConn);
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}


	}

}
