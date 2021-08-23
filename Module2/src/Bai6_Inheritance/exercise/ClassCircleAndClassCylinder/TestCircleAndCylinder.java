package Bai6_Inheritance.exercise.ClassCircleAndClassCylinder;


public class TestCircleAndCylinder {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5);
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(5);
        cylinder.setHeight(15);
        System.out.println(cylinder.getVolume());

        Cylinder cylinder1=new Cylinder(5,"black",10);
        System.out.println(cylinder1.getVolume());
    }
}
