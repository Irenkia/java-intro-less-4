package org.example;

public class Movie {
    private String nameMovie;
    private String nameDirector;
    private String surnameDirector;
    private int movieTime;
    private int movieYear;
    public Movie() {
    }

    public Movie(String nameMovie) {
        this.nameMovie = nameMovie;
    }

    public Movie(String nameMovie, String nameDirector, String surnameDirector, int movieTime, int movieYear) {
        this.nameMovie = nameMovie;
        this.nameDirector = nameDirector;
        this.surnameDirector = surnameDirector;
        this.movieTime = movieTime;
        this.movieYear = movieYear;
    }

    public String getNameMovie() {
        return nameMovie;
    }

    public void setNameMovie(String nameMovie) {
        this.nameMovie = nameMovie;
    }

    public String getNameDirector() {
        return nameDirector;
    }

    public void setNameDirector(String nameDirector) {
        this.nameDirector = nameDirector;
    }

    public String getSurnameDirector() {
        return surnameDirector;
    }

    public void setSurnameDirector(String surnameDirector) {
        this.surnameDirector = surnameDirector;
    }

    public int getMovieTime() {
        return movieTime;
    }

    public void setMovieTime(int movieTime) {
        this.movieTime = movieTime;
    }

    public int getMovieYear() {
        return movieYear;
    }

    public void setMovieYear(int movieYear) {
        this.movieYear = movieYear;
    }

    @Override
    public String toString() {
        return "Movie\n" +
                "Name Movie : '" + nameMovie + '\'' +
                ", \nDirector : '" + nameDirector +
                " " + surnameDirector + '\'' +
                ", \nTime : " + movieTime + " min." +
                ", \nProduction year : " + movieYear + "";
    }
}
