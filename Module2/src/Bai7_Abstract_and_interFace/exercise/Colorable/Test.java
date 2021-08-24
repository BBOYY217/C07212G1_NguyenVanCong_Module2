package Bai7_Abstract_and_interFace.exercise.Colorable;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes =new Shape[3];
        shapes[0] = new Square(5.0);
        shapes[1] = new Rectangle(6.0,7.5);
        shapes[2] = new Circle(3.5);
        System.out.println(" Square Area : " + ((Square)shapes[0]).getArea());
        System.out.println(" Rectangle Area : " + ((Rectangle)shapes[1]).getArea());
        System.out.println(" Circle Area : " + ((Circle)shapes[2]).getArea());

        for (int i = 0 ; i<shapes.length;i++) {
            if (shapes[i] instanceof Colorable) {
                System.out.println("it is Square ");
                ((Colorable)shapes[i]).howToColor();
            }
        }
    }
}
