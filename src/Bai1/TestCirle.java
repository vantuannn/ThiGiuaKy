package Bai1;

import Bai1.Shape;

public class TestCirle {
        public static void main(String[] args) {
            Shape.Rectangle.Circle circle = new Shape.Rectangle.Circle("Green", 3.0);

            double area = circle.calculateArea();
            double perimeter = circle.calculatePerimeter();

            System.out.println("Circle Information:");
            System.out.println("Color: " + circle.getColor());
            System.out.println("Radius: " + circle.getRadius());
            System.out.println("Area: " + area);
            System.out.println("Circumference: " + perimeter);
        }
    }

