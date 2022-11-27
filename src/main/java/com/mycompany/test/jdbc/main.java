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
public class main {
    
    public static void main(String[] args) {
       
        menu();
        
    }
      
    public static void menu(){
        
       
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Lua chon: ");
        int n;

        do{
        System.out.println("1. Thong Tin Hinh Tron");
        System.out.println("2. Thong Tin Hinh Chu Nhat");
        System.out.println("3. Thong Tin Hinh Vuong");
        System.out.println("4. Exit");
        System.out.println("Lua chon: ");
        n = sc.nextInt();
        switch (n) {
        
            case 1: {
              Circle c = new Circle();
              c.input();
              System.out.println("Chu vi: "+ c.getArea() + " - Dien tich: " + c.getPerimeter());
              break;
            }
            case 2: {
              Rectangle r = new Rectangle();
              r.input();
              System.out.println("Chu vi: "+ r.getArea() + " - Dien tich: " + r.getPerimeter());
              break;
            }
            case 3: {
              Square s = new Square();
              s.input();
              System.out.println("Chu vi: "+ s.getArea() + " - Dien tich: " + s.getPerimeter());
              break;
            }
            
            case 4: {
              System.out.println("Exit");
              break;
            }
            
        }
        }while(n<4);
    }
            
}
