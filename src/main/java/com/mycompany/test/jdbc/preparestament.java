/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Acer
 */
public class preparestament {
    public static void main(String[] args) {
        String sqlInsert = "INSERT INTO student VALUES(?, ?, ?)";
        String selectAll = "SELECT * FROM student";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
       String connectionUrl = "jdbc:sqlserver://LAPTOP-IF6TPV5C\\SQLEXPRESS04;encrypt=true;database=testdatabase;trustServerCertificate=true"  ;
       String userString = "sa";
       String passString = "12345678";
       Connection con = DriverManager.getConnection(connectionUrl,userString,passString);
            PreparedStatement stmt = con.prepareStatement(sqlInsert);
            stmt.setInt(1, 5);
            stmt.setString(2, "Vinh");
            stmt.setString(3, "Hanoi");
            
            //select all student
            stmt = con.prepareStatement(selectAll);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {                
                 System.out.println(rs.getInt(1) + "  " + rs.getString(2) 
                        + "  " + rs.getString(3));
            }
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
