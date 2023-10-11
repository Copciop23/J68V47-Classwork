package Lesson7;

import java.util.Scanner;

public class calculator {
    public static int count = 1;
    public static int choice = 0;
    public static void main(String[] args) {
        while (true) {
            startertrtr();
            int number1 = getnumber();
            startertrtr();
            int number2 = getnumber();
            showMenu();
            choice = getnumber();
            calculatethenumber(number1, number2);
            count = 1;
        }

    }
    public static void startertrtr(){
        System.out.println("Please enter number " + count + ": ");
        count = count + 1;

    }

    public static int getnumber(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();

    }
    public static void showMenu(){
        System.out.println("What would you like to do with your 2 numbers  \n 1: + \n 2: -\n 3: *\n 4: /");

    }
    public static void calculatethenumber(int numbers1, int numbers2){
        int total = 0;
        switch(choice){
            case 1:
                total = numbers1 + numbers2;
                showmessage(total);
                break;
            case 2:
                total = numbers1 - numbers2;
                showmessage(total);
                break;
            case 3:
                total = numbers1 * numbers2;
                showmessage(total);
                break;
            case 4:
                total = numbers1/numbers2;
                showmessage(total);
                break;

        }
    }
    public static void showmessage(int total){
        System.out.println("The total of your operation is " + total);
    }
}
