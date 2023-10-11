package Lesson7;
// This is LESSON 7 EXERCISE 2
import java.util.Scanner;

public class L7E2V2 {
    public static void main (String[] args) {
        System.out.println("Enter your first number: ");
        int number1 = getnumber();
        System.out.println("Enter your second number: ");
        int number2 = getnumber();
        int total = gettotal(number1, number2);

        System.out.println("The sum between " + number1 + " and " + number2 + " is " + total + " ");
    }
    public static int gettotal(int number1, int number2){
        return number1 + number2;

    }
    public static int getnumber(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();

    }
}
