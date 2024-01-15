package org.example;

public class Main {
    public static void main(String[] args) {
        forCheckTriangleIsRectangular();
    }
    public  static void forCheckTriangleIsRectangular(){
        System.out.println("Check if the triangle is rectangular :");
        System.out.println("rectangle with cathetus 7 and cathetus 4 and hypotinuse 8 - " + CheckTriangleIsRectangular.isTriangleRectangular(7.0,4.0,8.0));
        System.out.println("rectangle with cathetus 12 and cathetus 5 and hypotinuse 13 - " + CheckTriangleIsRectangular.isTriangleRectangular(12.0,5.0,13.0));
    }
}