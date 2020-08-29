package ru.geekbrains.lesson1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LeapYear {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("напиши год");
        String year1 = reader.readLine();
        int year = Integer.parseInt(year1);
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year + " - високосный год!");
        }
        else {
            System.out.println(year + " - не високосный год!");
        }
    }
}
