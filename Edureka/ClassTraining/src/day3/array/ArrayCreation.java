package day3.array;

import java.util.Arrays;

public class ArrayCreation {
    public static void main(String[] args) {
        int[] marks = new int[10];
        marks[0] = 98;
        marks[1] = 87;
        System.out.println("Array size = " +marks.length);
        System.out.println(Arrays.toString(marks));

        float []salaries = new float[9];
        System.out.println(Arrays.toString(salaries));

        boolean status[] = new boolean[10];
        System.out.println(Arrays.toString(status));

        String[] names = new String[12];
        System.out.println(Arrays.toString(names));

        for(String name : names){
            System.out.print(name + "    ");
        }
    }
}
