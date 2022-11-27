/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.jdbc;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Shape {
   private String color ;
   private boolean filled ;

    public Shape() {
    }
   
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    
   
    public void input(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Color: ");
      color = sc.nextLine();
      System.out.println("Filled: ");
      filled = sc.nextBoolean();
    }    

 
     
    
}
