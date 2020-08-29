package ru.geekbrains.lesson1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class NewApp {
    public static void main(String[] args) {
        System.out.println(calculate(150, 28, 96, 3));
        System.out.println(task10And20(7, 14));
        isNegativeOrPositive(-9);
        System.out.println(isNegative(-1));
        greetings("Андрей");

    }

    public static float calculate(int a, int b, int c, int d){
        return a * (b + (c / d));
    }
    public static boolean task10And20 (int x1, int x2){
        if (x1 + x2 >= 10 && x1 + x2 <= 20){
            return true;
        }
        else {
            return false;
        }
    }
    public static void isNegativeOrPositive (int x){
        if (x >= 0){
            System.out.println("Positive!");
        }
        else {
            System.out.println("Negative!");
        }
    }
    public static boolean isNegative (int x){
        if (x < 0){
            return true;
        }
        else {
            return false;
        }
    }
    public static void greetings (String name){
        System.out.println("Привет, " + name + "!");
    }

}
