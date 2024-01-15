package org.example;

public class Main {
    public static void main(String[] args) {
        forCinema();
    }
    public static void forCinema(){
        CinemaPlace place = new CinemaPlace(7, 5);
        System.out.println("Our seat № " +  place.getPlaceNumber() + " in row " + place.getRowPlace());
        place.setPlaceStatus(false);
        boolean status = place.isPlaceStatus();
        System.out.println("Now our ticket status is free? - " + status);
    }
}