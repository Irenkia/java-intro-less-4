package org.example;

public class Main {
    public static void main(String[] args) {
        forConvertMinutesToSeconds();
    }
    public static void forConvertMinutesToSeconds(){
        System.out.println("\nLet's convert minutes to seconds : ");
        System.out.println("20 min = " + ConvertMinutesToSeconds.convertMinToSec(20) + " sec");

        System.out.println("\n2 hours 30 min = " + ConvertMinutesToSeconds.convertMinToSec((2 * 60) + 30) + " sec");
        System.out.println("3 day 12 hours 15 min = " + ConvertMinutesToSeconds.convertMinToSec(((3 * 24 + 12) * 60) + 15) + " sec");

        System.out.println("\nExamination :");

        int seconds1 = ConvertMinutesToSeconds.convertHoursToSec(2) + ConvertMinutesToSeconds.convertMinToSec(30);
        System.out.println("2 hours 30 min = " + seconds1 + " sec");
        int seconds2 = ConvertMinutesToSeconds.convertDaysToSec(3) + ConvertMinutesToSeconds.convertHoursToSec(12) + ConvertMinutesToSeconds.convertMinToSec(15);
        System.out.println("3 day 12 hours 15 min = " + seconds2 + " sec");
    }
}
