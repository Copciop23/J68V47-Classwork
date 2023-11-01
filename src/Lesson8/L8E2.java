package Lesson8;
import java.util.*;
public class L8E2 {
    public static void main(String[] args) {
        int total = 0;
        int randomscore = 0;
        Random rand = new Random();
        int[] scores = {};
        for (int index = 0; index < 10; index ++ ){
            randomscore = rand.nextInt(100);
            scores = addToStringArray(scores, randomscore);
        }
        for (int index = 0; index < scores.length; index ++) {
            System.out.println("This is score number " + (index + 1) + ": " + scores[index]);
            total = total + scores[index];
        }
        int averagetotal = total/scores.length;
        System.out.println("The average test score is: " + averagetotal);

    }

    public static int[] addToStringArray(int[] oldArray, int newString) {
        int[] newArray = Arrays.copyOf(oldArray, oldArray.length + 1);
        newArray[oldArray.length] = newString;
        return newArray;

    }
}
