package bai4_class_and_object.practice.Rectangle;

public class Rectangle {
    private int width;
    private int heigth;

    public Rectangle() {
    }

    public Rectangle(int width, int heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public int area() {
        return this.heigth * this.width;
    }

    public int perimeter() {
        return (this.width + this.heigth) * 2;
    }

    public String display() {
        return "chiều dài: " + heigth + " " + "chiều rộng: " + width;
    }
}
