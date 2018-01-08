package com.andy;

/**
 * Created by Chama on 1/8/2018.
 */
public class LeapYear {
    public static void main(String[] args) {

        int LeapYear = 0;

        for (int year = 2001; year <= 2100; year++) {

            if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){

                LeapYear++;
                System.out.print(year + " ");

                if (LeapYear % 10 == 0) {
                    System.out.println();
                }
            }
        }

        System.out.println("\nThe number of leap year between 2001 and 2100 is "
                + LeapYear);

    }

}
