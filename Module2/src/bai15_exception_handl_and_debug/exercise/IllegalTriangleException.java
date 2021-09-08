package bai15_exception_handl_and_debug.exercise;

import java.util.Scanner;

public class IllegalTriangleException extends Exception {
    private double side1;
    private double side2;
    private double side3;
    
    
    public IllegalTriangleException(String message, double side1, double side2, double side3) {
        super(message);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public IllegalTriangleException(String s) {
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
}