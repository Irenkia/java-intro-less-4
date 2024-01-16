package org.example;

public class CinemaPlace {
    private int placeNumber;
    private  int rowPlace;
    private boolean placeStatus = true;

    public CinemaPlace(int placeNumber, int rowPlace) {
        this.placeNumber = placeNumber;
        this.rowPlace = rowPlace;
    }

    public int getPlaceNumber() {
        return placeNumber;
    }

    public int getRowPlace() {
        return rowPlace;
    }

    public boolean isPlaceStatus() {
        return placeStatus;
    }

    public void setPlaceStatus(boolean placeStatus) {
        this.placeStatus = placeStatus;
    }
}
