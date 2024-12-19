package com.example;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("2 + 3 = " + calculator.add(2, 3));
        System.out.println("5 - 3 = " + calculator.subtract(5, 3));
    }
}
