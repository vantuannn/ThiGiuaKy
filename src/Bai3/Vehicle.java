package Bai3;

public class Vehicle {
    private String brand;
    private String color;

    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public Vehicle() {
    }

    public void start() {
        System.out.println("Khởi động xe...");
    }

    public void accelerate() {
        System.out.println("Tăng tốc...");
    }

    public void stop() {
        System.out.println("Dừng lại...");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static class Truck extends Vehicle {

        private int payload;

        public Truck(String brand, String color, int payload) {
            super(brand, color);
            this.payload = payload;
        }

        @Override
        public String toString() {
            return "Truck{" +
                    "payload=" + payload +
                    '}';
        }
    }

    public static class Motorcycle extends Vehicle {

        private int dungTichDongCo;

        public Motorcycle(String brand, String color, int dungTichDongCo) {
            super(brand, color);
            this.dungTichDongCo = dungTichDongCo;
        }

        @Override
        public String toString() {
            return "Motorcycle{" +
                    "dungTichDongCo=" + dungTichDongCo +
                    '}';
        }
    }

    public static class Car extends Vehicle {

        private int seats;

        public Car(String brand, String color, int seats) {
            super(brand, color);
            this.seats = seats;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "brand='" + getBrand() + '\'' +
                    ", color='" + getColor() + '\'' +
                    ", numSeats=" + seats +
                    '}';
        }
    }
}

