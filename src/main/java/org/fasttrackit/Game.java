package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Game {

    Scanner input = new Scanner(System.in);
    DecimalFormat df2 =new DecimalFormat("#.##");

    private Track[] tracks = new Track[3];
    private List<Vehicle> competitors = new ArrayList<>();

    public void start() {
        initializeTracks();
        displayTracks();
        System.out.println("enter competitor count ");
        int competitorCount =input.nextInt();
        for(int i=0;i<competitorCount;i++){
            addCompetitor();
        }
        displayCompetitors();
    }

    private void addCompetitor() {
        Vehicle vehicle = new Vehicle();
        System.out.println("Enter competitor name:");
        vehicle.setName(input.next());
        System.out.println("Enter fuel level:");
        vehicle.setFuelLevel(input.nextInt());
        System.out.println("Enter max speed:");
        vehicle.setMaxSpeed(input.nextInt());
        vehicle.setMileage(ThreadLocalRandom.current().nextDouble(5, 10));
        competitors.add(vehicle);
    }

    private void displayCompetitors() {
        System.out.println("todays competitors are:");
        for (int i = 0; i < competitors.size(); i++) {
            ;
            if (competitors.get(i) != null) {
                ;
                System.out.println(competitors.get(i).getName());
                System.out.println("-mileage:" + df2.format(competitors.get(i).getMileage()));

            }
        }
    }


    private void initializeTracks() {
        Track city = new Track();
        city.setName("Cluj Track");
        city.setLength(100);
        tracks[0] = city;

        Track forest = new Track();
        forest.setName("Faget Track");
        forest.setLength(120);
        tracks[1] = forest;
    }

    private void displayTracks() {
        System.out.println("available tracks:");
        for (int i = 0; i < tracks.length; i++) {
            if (tracks[i] != null)
                System.out.println((i + 1) + " " + tracks[i].getName());
        }
    }
}