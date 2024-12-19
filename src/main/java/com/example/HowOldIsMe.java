package com.example;

import java.time.LocalDateTime;
import java.util.Scanner;

public class HowOldIsMe {

    public static String CalculateAge(int day, int month, int year) {
        LocalDateTime dateTime = getDateTime();
        int currentDay = dateTime.getDayOfMonth();
        int currentMonth = dateTime.getMonthValue();
        int currentYear = dateTime.getYear();
        String yearDifference = String.valueOf(currentYear - year);
        String monthDifference = String.valueOf(currentMonth - month);
        String dateDifference = String.valueOf(currentDay - day);

        return "You are is: " + yearDifference + ", " + monthDifference + ", " + dateDifference;
    }

    public static LocalDateTime getDateTime() {
        return LocalDateTime.now();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your date of birth:");
        int dateOfBirth = scanner.nextInt();
        System.out.print("month:");
        int monthString = scanner.nextInt();
        System.out.print("year:");
        int yearString = scanner.nextInt();
        scanner.close();
        System.out.print("You were born: " + dateOfBirth);
        System.out.print(", " + monthString);
        System.out.print(", " + yearString);
        String res = CalculateAge(dateOfBirth, monthString, yearString);
        System.out.print(res);
    }
}
