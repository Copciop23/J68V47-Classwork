package Lesson2;
import java.util.*;
/**
 * Lesson 2 Exercise 2
 * @author Bogdan-Cristian Ardeleanu
 * @version 1
 */
public class L2E2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        double number1 = Double.parseDouble(input.nextLine());

        System.out.println("\nEnter your Second number: ");
        double number2 = Double.parseDouble(input.nextLine());

        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1/number2;
        double modulo = number1 % number2;
        double exponent = Math.pow(number1, number2);
        // Calculating every possible outcome and calculations using all the math operators


        System.out.println("All the calculations are here: \n" + addition +
                " which is the addition result.\n" + subtraction +
                " which is the subtraction result\n" + multiplication +
                " which is the multiplication result\n" + division +
                " which is the division result\n" + modulo +
                " which is the modulo result\n" + exponent +
                " which is the exponent result");
    }

}
