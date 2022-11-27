/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Acer
 */
public class TestJdbc {

    public static void main(String[] args) {
        try {
       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
       String connectionUrl = "jdbc:sqlserver://LAPTOP-IF6TPV5C\\SQLEXPRESS04;encrypt=true;database=testdatabase;trustServerCertificate=true"  ;
       String userString = "sa";
       String passString = "12345678";
       Connection con = DriverManager.getConnection(connectionUrl,userString,passString);
         Statement stmt = con.createStatement();
         //Chen du lieu
         stmt.executeUpdate("INSERT INTO student(id,name,address) " + "VALUES (5,'Vinh','Hanoi')");
         //Lay du lieu tu bang student
         //duy tri mot con tro den mot hang cua bang, ban dau con tro se tro den hang dau tien
            ResultSet rs = stmt.executeQuery("select * from student");
            //hien thi du lieu
            // boolean next() di chuyen con tro den mot hang tiep theo tu vi tri hien tai
             while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) 
                        + "  " + rs.getString(3));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
