package org.fasttrackit;

import java.time.LocalDate;

// inheritance or "is-a" relationship
public class Car extends AutoVehicle {

    public Car(Engine engine) {
        super(engine);
    }

    int doorCount;

    LocalDate createdDate;
}




