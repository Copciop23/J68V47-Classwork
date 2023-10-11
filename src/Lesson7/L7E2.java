package Lesson7;
import java.util.*;
// This is lesson 7 exercise 3

public class L7E2 {
    public static Random rand = new Random();
    public static int height = 50;
    public static int totalscore = 0;
    public static int lives = 3;
    public static String fordifficulty = "";
    public static String difficulty = "";
    public static void main (String[] args) { // Random gibberish
        int totalscore = 0;
        int count = 10;  // The count can be changed to any number and it will be able to have unlimited amount of questions
        difficultyset();
        while (lives != 0 && count != 0)
        {
            int randomnum1 = getrandomnumbers();
            int randomnum2 = getrandomnumbers();

            int total = getsumtotal(randomnum1, randomnum2);
            int numbeeeeeer = askquestion(randomnum1, randomnum2);
            checkifcorrectanswer(total, numbeeeeeer);
            count = count - 1;
        }
        gameover();

    }
    public static int getsumtotal(int number1, int number2){
        int totalnumber = 0;
        if (difficulty.toLowerCase().equals("easy")){
            totalnumber = number1 + number2;
        } else if (difficulty.toLowerCase().equals("hard")) {
            totalnumber = number1 * number2;
        }
        return totalnumber;
    }
    public static int getrandomnumbers(){
        int randomnum1 = rand.nextInt(height);
        return randomnum1;
    }
    public static int askquestion(int randomnum1, int randomnum2){
        Scanner input = new Scanner(System.in);
        System.out.println("What does " + randomnum1 + fordifficulty + randomnum2 + " equal to?");
        return input.nextInt();
    }
    public static void checkifcorrectanswer(int total, int number){
        if (number == total){
            totalscore = totalscore + 1;
        }
        else {

            lives = lives - 1;
            System.out.println("You have " + lives + " lives left.");
        }
    }
    public static void gameover() {
        System.out.println("Game over, your total score is: " + totalscore);
        if (lives > 0) {
            System.out.println("Well done you finished this quiz");
        }
    }
    public static void difficultyset(){
        Scanner input = new Scanner(System.in);
        System.out.println("What difficulty would you like to play in: \n Easy(E) \n Hard(H)");
        String difficultyanswer = input.nextLine();
        if (difficultyanswer.toLowerCase().equals("e")){
            difficulty = "easy";
            fordifficulty = " + ";
        } else if (difficultyanswer.toLowerCase().equals("h")) {

            difficulty = "hard";
            fordifficulty = " * ";
            height = 100;
        }
    }
}