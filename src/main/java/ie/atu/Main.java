package ie.atu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int[] crew;

        crew = new int[2];

        crew[0] = 10;
        crew[1] = 40;

        for(int i = 1; i < crew.length; i++){
            System.out.println("Minimum number of crew members is: " + crew[1]);
        }

        Ship myShip = new Ship("Titanic", "1985", "32");
        System.out.println(myShip.toString());
    }

}