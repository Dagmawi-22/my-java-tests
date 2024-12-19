package com.example;

import java.time.LocalDateTime;
import java.util.Scanner;

public class HowOldIsMe {

    public static String calculateAge(int day, int month, int year) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        int currentDay = currentDateTime.getDayOfMonth();
        int currentMonth = currentDateTime.getMonthValue();
        int currentYear = currentDateTime.getYear();

        int ageYears = currentYear - year;
        int ageMonths = currentMonth - month;
        int ageDays = currentDay - day;

        if (ageDays < 0) {
            ageMonths--;
            ageDays += currentDateTime.minusMonths(1).getMonth().length(currentDateTime.toLocalDate().isLeapYear());
        }

        if (ageMonths < 0) {
            ageYears--;
            ageMonths += 12;
        }

        return "You are: " + ageYears + " years, " + ageMonths + " months, and " + ageDays + " days old.";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your date of birth (day): ");
        int day = scanner.nextInt();
        System.out.print("Enter your month of birth (month): ");
        int month = scanner.nextInt();
        System.out.print("Enter your year of birth (year): ");
        int year = scanner.nextInt();
        scanner.close();

        String result = calculateAge(day, month, year);
        System.out.println(result);
    }
}
