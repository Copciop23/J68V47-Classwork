package Lesson3;
import java.util.Scanner;
/**
 * Lesson 3 exercise 2
 * @author Bogdan-Cristian Ardeleanu
 * @version 1
 */

public class L3E2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        String spaincapital = "madrid";
        String ukcapital = "london";
        String italycapital = "rome";

        System.out.print("Q1. What is the capital of Spain? ");
        String answer1 = input.nextLine();
        System.out.println(answer1.toLowerCase().contains(spaincapital));

        System.out.print("Q1. What is the capital of UK? ");
        String answer2 = input.nextLine();
        System.out.println(answer2.toLowerCase().contains(ukcapital));

        System.out.print("Q1. What is the capital of Italy? ");
        String answer3 = input.nextLine();
        System.out.println(answer3.toLowerCase().contains(italycapital));


    }
}
