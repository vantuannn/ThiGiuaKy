package Bai1;

import Bai1.Shape;

public class TestTriangle {
    public static void main(String[] args) {
        Shape.Rectangle.Circle.Triangle triangle = new Shape.Rectangle.Circle.Triangle("Red", 3.0, 4.0, 5.0);

        double area = triangle.calculateArea();
        double perimeter = triangle.calculatePerimeter();
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
