package Lesson7;
import java.util.*;
/**
 * Lesson 6 Exercise 2
 * @author Bogdan-Cristian Ardeleanu
 * @version 1
 */
public class L7E1 {
    public static Random rand = new Random();
    public static boolean start = true;
    public static int count = 1;
    public static void main(String[] args) {
        String secondtime = "";
        while (start) {
            showMenu(secondtime);
            int choice = getoption();
            switch (choice){
                case 1:
                    option1();
                    break;
                case 2:
                    option2();
                    break;
                case 3:
                    option3();
                    break;
                case 4:
                    option4();
                    break;
            }
            count = count + 1;
            secondtime = "AGAIN";

        }

    }

    public static int getoption(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();

    }
    public static void showMenu(String Message){
        System.out.println("Please choose one of the four options by inputing the number of your choice " + Message + " \n 1: Say Hello \n 2: Tell me the  time\n 3: Tell me a joke\n 4: Quit");

    }
    public static void option1(){
        System.out.println("Hello");
    }

    public static void option2(){
        System.out.println("The time is 13:30 pm");
    }
    public static void option3(){
        int randomnum1 = rand.nextInt(1, 5);
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
            }
    }

    public static void option4(){
        System.out.println("You have finally quit the program, Goodbye after " + count + " try/tries");
        start = false;
    }
}