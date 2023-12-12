package ie.atu;

import java.util.Scanner;
public class Ship {
       // public static void main(String[] args) {

         //   int[] crew;

         //   crew = new int[2];

        //    crew[0] = 10;
        //    crew[1] = 40;
        //    for(int i = 1; i < crew.length; i++){
        //        System.out.println("Minimum number of crew members is: " + crew[1]);
        //    }
    //}
        String name;
        String year;

        String crew;

        public Ship(){
            this.name = " ";
            this.year = " ";
            this.crew = " ";
        }
        public Ship(String name, String year, String crew){
            this.name = name;
            this.year = year;
            this.crew = crew;
        }

    public String getCrew() {
        return crew;
    }

    public void setCrew(String crew) {
        this.crew = crew;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Ship " +
                "name='" + name + '\'' +
                ", year='" + year + '\'' +
                ", crew='" + crew + '\''
                ;
    }
}
