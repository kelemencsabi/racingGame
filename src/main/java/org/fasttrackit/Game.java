package org.fasttrackit;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Game {

    Scanner input = new Scanner(System.in);
    DecimalFormat df2 = new DecimalFormat("#.##");


    private Track[] tracks = new Track[3];
    private List<Vehicle> competitors = new ArrayList<>();

    public void start() throws Exception {
        initializeTracks();
        displayTracks();
        Track selectedTrack = getTrackSelectedByUser();
        int competitorCount = getCompetitorCountFromUser();
        for (int i = 0; i < competitorCount; i++) {
            addCompetitor();
        }
        displayCompetitors();
        boolean winnerNotKnown = true;
        int competitorsWithoutFuel=0;

        while (winnerNotKnown || competitorsWithoutFuel<competitors.size()) {
            for (Vehicle competitor : competitors) {
                double speed = getSpeedFromUser();
                competitor.accelerate(speed);

                if (competitor.getTraveledDistance() >= selectedTrack.getLength()) {
                    System.out.println("Congrats! The winner is : " + competitor.getName());
                    winnerNotKnown=false;
                }

            }
        }
    }

    private double getSpeedFromUser() {
        System.out.println("Please enter acceleration speed");
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("You have entered an invalid value");
            return getSpeedFromUser();
        }
    }


    private Track getTrackSelectedByUser() {
        System.out.println("Please enter track number:");
        try {
            Scanner input = new Scanner(System.in);
            int trackNumber = input.nextInt();
            Track track = tracks[trackNumber - 1];
            System.out.println("Selected track:" + track.getName());
            return track;
        } catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
            System.out.println("You entered an invaid track number. Please try again...");
            //recursion - a method invoking itself
            return getTrackSelectedByUser();
        }
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

    private int getCompetitorCountFromUser() throws Exception {
        System.out.println("please enter vehicle count:");
        try {
            return input.nextInt();
        } catch (InputMismatchException e) {
            throw new Exception("you entered an invalid value");
        } finally {
            //finally block is always executed
            System.out.println("Read input from user");
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
