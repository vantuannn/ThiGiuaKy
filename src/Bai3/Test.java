package Bai3;

public class Test {
    public static void main(String[] args) {
        Vehicle.Car car = new Vehicle.Car("Toyota", "Xám", 5);
        car.start();
        car.accelerate();
        car.stop();
        System.out.println(car);

        Vehicle.Motorcycle motorcycle = new Vehicle.Motorcycle("Honda", "Đỏ", 150);
        motorcycle.start();
        motorcycle.accelerate();
        motorcycle.stop();
        System.out.println(motorcycle);

        Vehicle.Truck truck = new Vehicle.Truck("Hyundai", "Trắng", 5000);
        truck.start();
        truck.accelerate();
        truck.stop();
        System.out.println(truck);
    }
}
