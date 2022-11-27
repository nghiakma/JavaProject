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
public class Circle extends Shape{
    private  double  radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    
    

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }
    
    public double getPerimeter(){
      return Math.PI * 2 * radius;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input(); 
        System.out.println("Nhap thong tin hinh tron: ");
        System.out.println("Nhap ban kinh: ");
        radius = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "Hinh tron (r=" + radius + ")" + "co: P=" + getPerimeter() + ";S= " + getArea() + ";Color: " + getColor() + ";Filled: " + isFilled();
    }
     
    
}
