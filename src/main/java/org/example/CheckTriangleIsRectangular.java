package org.example;

public class CheckTriangleIsRectangular {
    public static boolean isTriangleRectangular(double cathetus1, double cathetus2, double hypotenuse){
        return hypotenuse * hypotenuse == ((cathetus1 * cathetus1) + (cathetus2 * cathetus2));
    }
}
