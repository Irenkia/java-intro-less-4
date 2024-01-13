package org.example;

public class Main {
    public static void main(String[] args) {
        forMovie();
    }
    public static void forMovie(){
        Movie movie = new Movie("Forrest Gump", "Robert", "Zemeckis",142, 1994);
        System.out.println("\nThere is a film currently showing in our cinema:");
        String showing = movie.toString();
        System.out.println(showing);
    }
}