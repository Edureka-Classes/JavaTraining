package day3.oops.array;

import java.util.Arrays;

public class PositiveNagetiveArrays {
    /* Separating positive and negative arrays in a given array*/
    public static void main(String[] args) {
        int[] n = {-13,8, -3, -9, 9, 10, -2, 16};
        System.out.println(Arrays.toString(n));

        int positiveCount = 0;
        for(int x : n){
            if(x > 0){
                positiveCount++;
            }
        }

        int negativeCount = n.length - positiveCount;

        int[] positiveElements = new int[positiveCount];
        int[] negativeElements = new int[negativeCount];

        int i=0, j=0;

        for(int x : n){
            if(x > 0){
                positiveElements[i] = x;
                i++;
            }else {
                negativeElements[j] = x;
                j++;
            }
        }

        System.out.println();
        System.out.println("Negative Elements = " +Arrays.toString(negativeElements));
        System.out.println("Positive Elements = " +Arrays.toString(positiveElements));
    }
}
