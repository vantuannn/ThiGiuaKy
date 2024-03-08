package Bai1;

import Bai1.Shape;

public class TestRectangle {
    public static void main(String[] args) {
        Shape.Rectangle rectangle = new Shape.Rectangle("Blue", 4.0, 5.0);

        double area = rectangle.calculateArea();
        double perimeter = rectangle.calculatePerimeter();
        System.out.println("Color: " + rectangle.getColor());
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}

