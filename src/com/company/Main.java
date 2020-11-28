package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public enum Season {
        WINTER, SPRING, SUMMER, AUTUMN
    }

    public static void main(String[] args) {
	// write your code here

        Season season = null;

        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Input month to get season...");
            String month = br.readLine().toLowerCase();

            switch (month) {
                case "december":
                case "january":
                case "february":
                    season = Season.WINTER;
                    System.out.println(season);
                    break;
                case "march":
                case "april":
                case "may":
                    season = Season.SPRING;
                    System.out.println(season);
                    break;
                case "june":
                case "july":
                case "august":
                    season = Season.SUMMER;
                    System.out.println(season);
                    break;
                case "september":
                case "october":
                case "november":
                    season = Season.AUTUMN;
                    System.out.println(season);
                    break;
                default:
                    System.out.println("Sorry, no such month");
            };
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
