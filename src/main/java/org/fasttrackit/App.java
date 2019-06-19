package org.fasttrackit;


public class App {
    public static void main(String[] args) {

        Engine engine1 = new Engine();
        engine1.capacity = 100;
        engine1.manufacturer = "Renault";

        Car car = new Car(engine1);
        car.name = "Dacia";
        car.color = "red";
        car.doorCount = 4;
        car.running = true;
        car.maxSpeed = 120;
        car.fuelLevel = 50;
        car.mileage = 8;

        Engine engine2 = new Engine();
        engine2.capacity = 120;
        engine2.manufacturer = "Opel";

        Car car2 = new Car(engine2);
        car2.name = "Opel";
        car2.color = "black";
        car2.doorCount = 4;
        car2.mileage = 9.8;
        car2.maxSpeed = 180;
        car2.running = false;



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
