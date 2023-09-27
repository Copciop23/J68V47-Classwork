package Lesson3;

import java.util.*;
/**
 * Lesson 3 Exercise 3
 * @author Bogdan-Cristian Ardeleanu
 * @version 1
 */
public class L3E3 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Loan ammount: £");
        float L = input.nextFloat();

        System.out.print("Enter interest rate: %");
        int rate = input.nextInt();

        System.out.print("Enter how long the loan is: ");
        int years = input.nextInt();

        float j = ((float) rate/100)/12;

        int n = years * 12;

        float M = (float) ( L*( j / (1 - Math.pow((1+j),-n))));

        System.out.format("Monthly payment for this loan = £%.2f",M);




    }
}
