package ie.atu;

import java.util.Scanner;
public class Ship {
    public static void main(String[] args){

        String name;

        String year;

        int[] crew;

        crew = new int[2];

        crew[1] = 20;

        for(int i = 1; i < crew.length; i++){
            System.out.println("Select the amount of crew members that can enter: " + crew[1]);
        }
    }
}
