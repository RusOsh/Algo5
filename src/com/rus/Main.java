package com.rus;

public class Main {

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(power(2, 10));
    }

    public static int factorial(int number) {
        if (number == 0) return 1;
        else return (number * factorial(number - 1));
    }

    public static int power(int number, int power) {
        if (power == 0) return 1;
        else return (number * power(number, power - 1));
    }
}
