package controller;

import java.sql.Connection;

import utility.ConnectionManager;

public class Main {
	public static void main(String args[]) throws Exception {
		
	// Fill your code
		Connection con;
		con = ConnectionManager.getConnection();
		
		if(con!=null)
			System.out.println(" Connection established");
		else
			System.out.println("Check your connection");
		
	}
}
