/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ashay
 */
public class connectWithDB {
    
    public connectWithDB(){}
	
	public Connection getConnect() {
		// TODO Auto-generated method stub
		Connection con = null;
		  try {
	            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	            String url = "jdbc:oracle:thin:@localhost:1521:XE";
	            String name = "ashay";
	            String password = "hr";
	            con = DriverManager.getConnection(url,name,password);
	            System.out.println("Database connected successfully!!");
	            //Statement st = con.createStatement();
	            //String str = "select * from Login where U_NAME='Ashay'and PASSWORD='abc123'";
	            //st.executeUpdate(str);
	        } catch (ClassNotFoundException | SQLException ex) {
	        	ex.printStackTrace();
	        }
		  return con;
	}
}
