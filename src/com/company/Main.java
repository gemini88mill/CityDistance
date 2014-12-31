package com.company;

import java.util.Scanner;

public class Main {

    /**
     * Distance Between Two Cities –
     * Calculates the distance between two cities and allows the user
     * to specify a unit of distance. This program may require finding
     * coordinates of the cities like latitude and longitude.
     * @param args
     */

    //------------------Globals-----------------------------

    //------------------------------------------------------

    public static void main(String[] args) {
        String startingcity = null;

        Main main = new Main();

        startingcity = main.citySearch(startingcity);
        System.out.println(startingcity);
    }

    private String citySearch(String city1) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please Select City:");
        city1 = scan.nextLine();
        city1 = city1.toUpperCase();

        return city1;
    }
}
