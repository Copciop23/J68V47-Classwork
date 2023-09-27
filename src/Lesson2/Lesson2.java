package Lesson2;

import java.util.*;
/**
 * My First Program
 * @author Bogdan-Cristian Ardeleanu
 * @version 1
 */
public class Lesson2 {
    public static void main (String[] args) {
        System.out.println("Hello World");
        Scanner input = new Scanner(System.in);
        // we create a scanner object to detect the users input
        System.out.print("What is your name? ");
        String name = input.nextLine();
    }
}
