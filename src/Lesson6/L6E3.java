package Lesson6;
import java.util.*;


public class L6E3 {
    public static void main (String[] args) { // Random gibberish
        Random rand = new Random();
        int height = 50;
        int totalscore = 0;
        int lives = 3;
        int count = 10;  // The count can be changed to any number and it will be able to have unlimited amount of questions
        Scanner input = new Scanner(System.in);
        while (lives != 0 && count != 0)
        {
            int randomnum1 = rand.nextInt(height);
            int randomnum2 = rand.nextInt(height);

            int total = randomnum1 + randomnum2;
            System.out.println("What does " + randomnum1 + " + " + randomnum2 + " equal to?");
            int numbeeeeeer = input.nextInt();
            if (numbeeeeeer == total){
                totalscore = totalscore + 1;
            }
            else {
                System.out.println("The correct answer is: " + total);
                lives = lives - 1;

            }
            count = count - 1;
        }
        System.out.println("Your score is: " + totalscore);

    }
}
