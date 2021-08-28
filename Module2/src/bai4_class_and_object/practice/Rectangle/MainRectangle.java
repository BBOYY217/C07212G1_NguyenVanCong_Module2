package bai4_class_and_object.practice.Rectangle;

public class MainRectangle {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        Rectangle rectangle = new Rectangle(a, b);
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
        System.out.println(rectangle.display());
    }
}
