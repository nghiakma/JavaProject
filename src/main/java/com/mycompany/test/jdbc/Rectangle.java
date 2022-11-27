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
public class Rectangle extends  Shape{
    private double width;
    private double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    
    

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    public double getArea() {
        return (width + length) * 2;
    }

    public double getPerimeter() {
        return width * length;
    }
    
    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input(); 
        System.out.println("Nhap thong tin hinh chu nhat:");
        System.out.println("Nhap chieu dai: ");
        width = sc.nextDouble();
        System.out.println("Nhap chieu rong: ");
        length = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "Hinh chu nhat (width=" + width + ";length=" + length + ")" +
                " co: P= " + getPerimeter() + ";S= " + getArea() + ";Color: " + getColor() + ";Filled: " + isFilled();
    }
    
    
   
}
