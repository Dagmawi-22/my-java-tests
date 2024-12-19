package com.example;

import java.util.Scanner;

public class SayMyName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.next();
        scanner.close();
        System.out.println("Your name is:" + name);
    }
}
