package Lesson3;
import java.util.*;
/**
 * Lesson 3 Exercise 1
 * @author Bogdan-Cristian Ardeleanu
 * @version 1
 */

public class L3E1 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstname = input.nextLine();
        System.out.print("Enter your surname: ");
        String surname = input.nextLine();
        System.out.print("Enter your your year of birth: ");
        String year = input.nextLine();

        // The program then makes the password, username by adding different parts of the details into it.

        String username = firstname.substring(0,1) + surname.toLowerCase();
        System.out.println("username: "+username);

        String password = surname.substring(0,1).toLowerCase() + firstname.substring(0,3).toUpperCase() + year;
        System.out.println("Password: "+password);

    }
}
