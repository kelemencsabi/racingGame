package org.fasttrackit;


public class App {
    public static void main(String[] args) {

        Engine engine2 = new Engine();
        engine2.capacity = 100;
        engine2.manufacturer = "Renault";

        Car car = new Car();
        car.name = "Dacia";
        car.color = "red";
        car.doorCount = 4;
        car.running = true;
        car.maxSpeed = 120;
        car.fuelLevel = 50;
        car.mileage = 8;
        car.engine = engine2;


        //System.out.println("Distance in App.main " + distance + " km.");

        Engine engine1 = new Engine();
        engine1.capacity = 120;
        engine1.manufacturer = "Opel";

        Car car2 = new Car();
        car2.name = "Opel";
        car2.color = "black";
        car2.doorCount = 4;
        car2.mileage = 9.8;
        car2.maxSpeed = 180;
        car2.running = false;
        car2.engine = engine1;


        Car car3 = car;
        System.out.println(car.name);


        System.out.println("changing values...");
        car.name = "Dacia Logan";

        System.out.println(car.name);


        System.out.println("max speed: " + car.maxSpeed);

        System.out.println( "Engine manufacturer: " + car.engine.manufacturer);
        double distance = car.accelerate(60, 0.5);

    }
}
