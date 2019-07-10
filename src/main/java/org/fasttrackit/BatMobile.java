package org.fasttrackit;

public class BatMobile extends Vehicle {

    @Override
    //co-variant return type
    public double accelerate(double speed, double durationInHours) {
        System.out.println(getName() + " is accelerating with " + speed + " km/h for " + durationInHours + "h.");

        double distance = speed * durationInHours * 2;

        System.out.println("Traveled " + distance + " km.");

        setTraveledDistance(getTraveledDistance() + distance);

        System.out.println("Total traveled distance " + getTraveledDistance() + " km");

        return distance;

    }
}

