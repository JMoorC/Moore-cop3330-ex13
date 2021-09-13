/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 James Moore
 */

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args){
        Scanner inScan = new Scanner(System.in);

        System.out.print("What is the principal amount? ");
        double principle = inScan.nextDouble();
        System.out.print("What is the rate? ");
        double rate = inScan.nextDouble();
        System.out.print("What is the number of years? ");
        int years = inScan.nextInt();
        System.out.print("What is the number of times the interest is compounded per year? ");
        int timesX = inScan.nextInt();

        // result = principle * ( (1 + ( (rate / 100) / timesX) ) ^ (timesX * years) );
        double multiplier = (1 + ( (rate / 100) / timesX) );
        double result = multiplier;
        for (int i = timesX * years; i > 1; i--){
            result *= multiplier;
        }
        result *= principle;
        int hold = (int) (result * 1000000);
        result = Math.ceil( (hold / 10000.0) ) / 100.0;

        System.out.printf("$%.2f invested at %.2f%% for %d years compounded %x times per year is $%.2f.",
                principle, rate, years, timesX, result);
    }
}

// What is the principal amount?
// what is the rate?
// what is the number of years?
// what is the number of times the interest is compounded per year?
// x invested at x% for x years compounded x times per year is x
// A = P(1 + r/n)^(n*t)