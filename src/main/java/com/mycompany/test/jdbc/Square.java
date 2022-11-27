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
public class Square extends Shape{
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    
    public double getArea() {
        return side*4;
    }

    public double getPerimeter() {
        return side * side;
    }
    
     @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input(); 
        System.out.println("Nhap thong tin canh hinh vuong:");
        System.out.println("Nhap do dai canh: ");
        side = sc.nextDouble();
       
    }

    @Override
    public String toString() {
        return "Hinh vuong (side=" + side + ")" +
                " co: P= " + getPerimeter() + ";S= " + getArea() + ";Color: " + getColor() + ";Filled: " + isFilled();
    }
    
    
    
    
}
