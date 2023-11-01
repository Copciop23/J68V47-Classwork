package Lesson8;
import java.util.*;
public class L8E3 {
    public static void main(String[] args) {
        // Set up the directions array
        String[] directions = {"Start by exiting the building you are currently in and turning left onto the main road.",
                "Walk down the road for two blocks until you reach the traffic lights.",
                "At the traffic lights, turn right onto Oak Street.",
                "Follow Oak Street for one block then turn left onto Elm Street.",
                "Walk to the end of Elm Street. Your doctor's office will be the third building on the right side of the road.",
                "Enter through the front door of the office. Let the receptionist know you have arrived for your appointment.",
                "Take a seat in the waiting room. The doctor will call your name when it's time to be seen. You've arrived!"
        };
        String stepadded = "After turning onto Elm Street, walk past the grocery store on your right.";
        directions = addElementAt(directions, 4, stepadded);


        // Print out each direction
        printouarrays(directions);
        directions = removeLastElement(directions);
        printouarrays(directions);





        Scanner input = new Scanner(System.in);
        System.out.println("What step would you like to add: ");
        String userstep = input.nextLine();
        System.out.println("What number should be your step: ");
        int usernumber = input.nextInt();
        directions = addElementAt(directions, usernumber - 1, userstep);
        printouarrays(directions);

    }
    public static String[] addToStringArray(String[] oldArray, String newString) {
        String[] newArray = Arrays.copyOf(oldArray, oldArray.length + 1);
        newArray[oldArray.length] = newString;
        return newArray;

    }
    public static String[] removeLastElement(String[] oldArray) {
        return Arrays.copyOf(oldArray, oldArray.length - 1);
    }
    public static String[] addElementAt(String[] oldArray, int index, String newstring) {
        int length = oldArray.length;
        String[] newArray = new String[index]; // Create the new array
        // Copy old values before the index to remove
        System.arraycopy(oldArray, 0, newArray, 0, index);
        newArray = addToStringArray(newArray, newstring);
        newArray = addToStringArraylength(newArray, (oldArray.length - index));
        System.arraycopy(oldArray, index , newArray, index + 1, (length - index));
        return newArray;
    }
    public static void printouarrays(String[] arrayprinted) {
        int step = 1;
        for(String direction : arrayprinted) {
            System.out.format("%d. %s %n",step,direction);
            step ++;
        }
    }
    public static String[] addToStringArraylength(String[] oldArray, int length) {
        return Arrays.copyOf(oldArray, oldArray.length + length);

    }


}
