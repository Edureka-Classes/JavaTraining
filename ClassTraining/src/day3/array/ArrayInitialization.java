package day3.oops.array;

import java.util.Arrays;

public class ArrayInitialization {

    public static void main(String[] args) {
        int [] marks = {78, 84, 96, 82, 91, 76, 63};
        System.out.println(marks);
        System.out.println("No of subjects = " + marks.length);
        System.out.println(Arrays.toString(marks));
        System.out.println();

        /* Array Iteration using For-Loop */
        for(int i = 0; i < marks.length; i++){
            System.out.println("Marks for subject " + (i + 1) + " = " + marks[i]);
        }
        System.out.println();

        /* Array Iteration using For-Loop */
        System.out.print("Marks obtained ------> ");
        for(int mark : marks){
            System.out.print(mark + " | ");

            try{
                Thread.sleep(1000);
            }catch (Exception e){};
        }
        System.out.println();
        System.out.println(marks[6]);
        // System.out.println(marks[7]); // generate ArrayIndexOutOfBoundsException
    }
}
