package org.fasttrackit;

import java.time.LocalDate;

public class Vehicle {

    public static int getTotalCount() {
        return totalCount;
    }

    private static int totalCount = 0;

    public Vehicle() {
        totalCount++;
    }


    private String name;
    private double mileage;
    private String color;
    private double maxSpeed;
    private boolean running;
    private double fuelLevel;
    private double traveledDistance;
    private LocalDate createdDate;

    public void setName(String name) {
        this.name = name.trim();
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public void setTraveledDistance(double traveledDistance) {
        this.traveledDistance = traveledDistance;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public String getName() {
        return name;
    }

    public double getMileage() {
        return mileage;
    }

    public String getColor() {
        return color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public boolean isRunning() {
        return running;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public double getTraveledDistance() {
        return traveledDistance;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public double accelerate(double speed, double durationInHours) {

        System.out.println(name + " is accelerating with " + speed + " km/h for " + durationInHours + "h.");

        double distance = speed * durationInHours;

        System.out.println("Traveled " + distance + " km.");

        traveledDistance += distance;

        System.out.println("Total traveled distance " + traveledDistance + " km");

        double spentFuel = distance / 100 * mileage;

        System.out.println("spent Fuel: " + spentFuel + "1.");

        fuelLevel -= spentFuel;

        System.out.println("Remaining fuel: " + fuelLevel + "1.");

        return distance;

    }
    public double accelerate(double speed){
        return accelerate(speed,1);

    }
}





