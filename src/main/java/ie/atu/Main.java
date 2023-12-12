package ie.atu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int[] crew;
        int[] passengers;
        int[] ShipCapacity;

        crew = new int[1];
        passengers = new int[1];
        ShipCapacity = new int[1];

        crew[0] = 40;

        passengers[0] = 50;

        ShipCapacity[0] = 100;

        for(int i = 0; i < crew.length; i++){
            System.out.println("Minimum number of crew members on Ship is: " + crew[0]);
        }
        for(int i = 0; i <passengers.length; i++){
            System.out.println("Maximum number of passengers on Ferry is: " + passengers[0]);
        }
        for(int i = 0; i < ShipCapacity.length; i++){
            System.out.println("Maximum number of weight the ship can handle is: " + ShipCapacity[0] + "ton");
        }

        Ship myShip = new Ship("Titanic", "1985", "32");
        System.out.println(myShip.toString());
        Ferry myFerry = new Ferry(" Atlantic Way point","24", "1998");
        System.out.println(myFerry.toString());
        Trawler myTrawler = new Trawler("60", "Titanic","Cars and Trucks only" );
        System.out.println(myTrawler.toString());
    }
}