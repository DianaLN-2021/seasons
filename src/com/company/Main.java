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
                    break;
                case "march":
                case "april":
                case "may":
                    season = Season.SPRING;
                    break;
                case "june":
                case "july":
                case "august":
                    season = Season.SUMMER;
                    break;
                case "september":
                case "october":
                case "november":
                    season = Season.AUTUMN;
                    break;
                default:
                    System.out.println("Sorry, no such month");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        if (season != null) {
            System.out.println(season);
        }

    }
}
