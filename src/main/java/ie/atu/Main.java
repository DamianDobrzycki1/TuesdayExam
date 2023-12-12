package ie.atu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int[] crew;
        int[] passengers;

        crew = new int[2];
        passengers = new int[2];

        crew[1] = 40;

        passengers[1] = 50;

        for(int i = 1; i < crew.length; i++){
            System.out.println("Minimum number of crew members on Ship is: " + crew[1]);
        }
        for(int i = 1; i <passengers.length; i++){
            System.out.println("Maximum number of passengers on Ferry is: " + passengers[1]);
        }

        Ship myShip = new Ship("Titanic", "1985", "32");
        System.out.println(myShip.toString());
        Ferry myFerry = new Ferry(" Atlantic Way point","24", "1998");
        System.out.println(myFerry.toString());
    }

}