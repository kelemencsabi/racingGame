package org.fasttrackit;


public class App {
    public static void main(String[] args) {

        new Car();

        Engine engine1 = new Engine();
        engine1.capacity = 100;
        engine1.manufacturer = "Renault";

        Car car = new Car(engine1);
        car.setName("dacia");
        car.setColor("red");
        car.doorCount = 4;
        car.setRunning(true);
        car.setMaxSpeed(120);
        car.setFuelLevel(50);
        car.setMileage(8);

        Engine engine2 = new Engine();
        engine2.capacity = 120;
        engine2.manufacturer = "Opel";

        Car car2 = new Car(engine2);
        car2.setName("Opel");
        car2.setColor("blue");
        car2.doorCount = 4;
        car2.setMaxSpeed(180);
        car2.setFuelLevel(60);
        car2.setRunning(false);

        BatMobile batMobile = new BatMobile();
        batMobile.setName("Batman");

        batMobile.accelerate(60,1);
        car.accelerate(60,1);
        batMobile.accelerate(60);




        Car car3 = car;
        System.out.println(car.getName());


        System.out.println("changing values...");
        //car.setName("Dacia Logan");

        System.out.println(car.getName());


        System.out.println("max speed: " + car.getMaxSpeed());

        System.out.println("Engine manufacturer: " + car.engine.manufacturer);

        double distance = car.accelerate(60, 0.5);

        System.out.println("Studying static variables...");

//        car.totalCount=1;
//        System.out.println("total count of cars: " + car.totalCount);
//        car2.totalCount=2;
//        System.out.println("total count of cars: " + car.totalCount);
//        System.out.println("total count of cars: " + car2.totalCount);
//        System.out.println("total count from Vehicle class: " + Vehicle.totalCount);

        System.out.println(Vehicle.getTotalCount());

        car2.accelerate(100);

        System.out.println("Today...");

        System.out.println(car.toString());


    }
}
