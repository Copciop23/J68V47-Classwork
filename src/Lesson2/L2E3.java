package Lesson2;
import java.util.*;
/**
 * Lesson 2 exercise 3
 * @author Bogdan-Cristian Ardeleanu
 * @version 1
 */
public class L2E3 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of item 1: ");
        String item1 = input.nextLine();
        System.out.println("Enter the price of item 1: ");
        float price1 = input.nextFloat();
        System.out.println("Enter the name of item 2: \n");
        String item2 = input.next();
        System.out.println("Enter the price of item 2: ");
        float price2 = input.nextFloat();
        System.out.println("Enter the name of item 3: \n");
        String item3 = input.next();
        System.out.println("Enter the price of item 3: ");
        float price3 = input.nextFloat();

        float total = price1 + price2 + price3;

        System.out.println("NESMART");
        System.out.format("%s .......£%.2f %n", item1, price1);
        System.out.format("%s .......£%.2f %n", item2, price2);
        System.out.format("%s .......£%.2f %n", item3, price3);
        System.out.format("SUBTOTAL...£%.2f %n",total);


    }
}
