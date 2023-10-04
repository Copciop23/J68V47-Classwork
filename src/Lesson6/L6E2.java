package Lesson6;
import java.util.*;
/**
 * Lesson 6 Exercise 2
 * @author Bogdan-Cristian Ardeleanu
 * @version 1
 */
public class L6E2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        String secondtime = "";
        int count = 1;
        int numberofchoices = 5;
        boolean start = true;
        while(start)
        {
            System.out.println("Please choose one of the four options by inputing the number of your choice " + secondtime +" \n 1: Say Hello \n 2: Tell me the  time\n 3: Tell me a joke\n 4: Quit");
            int choice = input.nextInt();
            if (choice == 1){
                System.out.println("Hello");
            }
            if (choice == 2){
                System.out.println("The time is 14:06 pm");
            }
            if (choice == 3) {
                int randomnum1 = rand.nextInt(1, numberofchoices);
                switch (randomnum1) {
                    case 1:
                        System.out.println("Did you hear about the cartoonist found dead at his home? Details are sketchy.");
                        break;
                    case 2:
                        System.out.println("A sandwich walks into a bar. The barman says: 'sorry we don't serve food here'");
                        break;
                    case 3:
                        System.out.println("Where did Napoleon keep his armies? Up his sleevies!");
                        break;
                    case 4:
                        System.out.println("Let me free of my misery I do not want to send out dad jokes anymore please LET ME FREE!!!");
                        break;
                }}
            if (choice == 4){
                System.out.println("You have finally quit the program, Goodbye after" + count + " tries");
                start = false;
            }
            count = count + 1;
            secondtime = "AGAIN";

        }


    }
}
