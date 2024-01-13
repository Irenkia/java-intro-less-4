package org.example;

public class Cinema {
    private int row = 5;
    private int place = 10;
    private int[][] cinema = new int[row][place];

    public Cinema() {
        for(int i = 0; i < cinema.length; i++){
            for (int j = 0; j < cinema[i].length; j++){
                cinema[i][j] = j + 1;
            }
        }
    }

    public Cinema(int[][] cinema) {
        this.cinema = cinema;
    }

    public int[][] getCinema() {
        return cinema;
    }

    public void setCinema(int[][] cinema) {
        this.cinema = cinema;
    }

    public void printCinema() {
        for (int i = 0; i < cinema.length; i++) {
            for (int j = 0; j < cinema[i].length; j++) {
                System.out.print(cinema[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public boolean isTicket(int row, int column){
        int[][]arr = getCinema();
        return (row - 1 >= 1 && row - 1 <= arr.length) && (column - 1 >= 1 &&  column - 1 <= arr[0].length);
    }

    public boolean checkTicket(int row, int column){
        if (isTicket(row, column)){
            int[][]arr = getCinema();
            for(int i = 0; i < arr.length; i++){
                for (int j =0; j < arr[i].length; j++){
                    if(arr[row - 1][column - 1] != 0){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int buyTicket(int row, int column){
        int place = 0;
        if(isTicket(row, column)){
            int[][]arr = getCinema();
            for(int i = row - 1; i < arr.length; i++){
                for (int j =0; j < arr[i].length; j++){
                    if(arr[i][j] == arr[row - 1][column - 1]){
                        place = arr[i][j];
                        arr[i][j] = 0;
                        break;
                    }
                }
            }
            setCinema(arr);
            return place;
        }
        return 0;
    }
}
