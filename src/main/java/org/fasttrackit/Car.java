package org.fasttrackit;

import java.time.LocalDate;

// inheritance or "is-a" relationship
public class Car extends AutoVehicle {

    public Car(Engine engine) {
        super(engine);
    }


    public Car() {
        super(new Engine());
    }
    int doorCount;

    LocalDate createdDate;
}




