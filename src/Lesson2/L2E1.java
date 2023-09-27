package Lesson2;
import java.util.Scanner;
/**
 * My First Program
 * @author Bogdan-Cristian Ardeleanu
 * @version 1
 */
public class L2E1 {
    public static void main (String[] args) {
        System.out.println("Hello World");
        Scanner input = new Scanner(System.in);
        // we create a scanner object to detect the users input
        System.out.print("Please Enter your name: ");
        String name = input.nextLine();

        // We get the name from the user, so we can use it in the future

        System.out.print("Please Enter your hobby: ");
        String hobby = input.nextLine();

        String story = name + " loves" + hobby + " in their free time.\nThey find it relaxing and satisfying to see their "
           + hobby + " come to life.\n" + hobby + " allows " + name + " to express their creative side.";

        System.out.println(story);
    }
}
