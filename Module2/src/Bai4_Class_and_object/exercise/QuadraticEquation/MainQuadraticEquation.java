package Bai4_Class_and_object.exercise.QuadraticEquation;

import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a");
        double a = scanner.nextDouble();
        System.out.println("Enter b");
        double b = scanner.nextDouble();
        System.out.println("Enter c");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);

        if (a==0) {
            if (b==0) {
                System.out.println("there are countless solutions");
            }else {
                System.out.println("there is only 1 solution :"+quadraticEquation.oneExperiences());
            }
        }else if (quadraticEquation.getDelTa()<0) {
            System.out.println("the equation has no solution");
        }else if (quadraticEquation.getDelTa()==0) {
            System.out.println("infinitely many solutions: "+quadraticEquation.Experiences());
        }else {
            quadraticEquation.twoExperiences();
        }
    }

}
