package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(-2));
    }

    public static int getEvenDigitSum(int number) {

        int sum = 0;
        int last = 0;

        if (number < 0) {
            System.out.println("You can't use negative numbers.");
            return -1;
        }

        while (number > 0) {

            last = number % 10;

            if (last % 2 == 0) {

                sum += last;
            }

            number /= 10;
        }

        return sum;
    }
}
