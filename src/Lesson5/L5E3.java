package Lesson5;
import java.util.*;


public class L5E3 {
    public static void main (String[] args) {
        Random rand = new Random();
        int height = 50;
        int totalscore = 0;

        Scanner input = new Scanner(System.in);;
        for( int count=10; count>=1; count-- )
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

        };
        }
        System.out.println("Your score is: " + totalscore);

    }
}
