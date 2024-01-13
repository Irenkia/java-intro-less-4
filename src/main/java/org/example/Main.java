package org.example;

public class Main {
    public static void main(String[] args) {
        forCinema();
    }
    public static void forCinema(){
        Cinema cinema = new Cinema();
        System.out.println("Our cinema hall has 5 rows and each row has 10 seats");
        cinema.printCinema();

        System.out.println("\nLet's buy ticket № 7 in row 2");
        int row = 2;
        int place = 7;
        int ticket1 = cinema.buyTicket(row,place);
        System.out.println("Here's our ticket - " + ticket1);

        boolean isFree = cinema.checkTicket(row,place);
        System.out.println("Let's check if you can buy such a ticket one more time.");
        System.out.println("Ticket № " + ticket1 + " in row " + row + " can buy now - " + isFree);

        System.out.println("\nOur cinema hall now");
        cinema.printCinema();

        System.out.println("\nI want to buy ticket № 3 in row 9 (but we know that there is no such ticket)");
        boolean canBuy = cinema.isTicket(9,3);
        System.out.println("can I buy such a ticket - " + canBuy);
    }

}