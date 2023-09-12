package assigment1.forLoops.genTable;

public class GenerateTableOfTen {
    public static void main(String[] args) {

        /* Write a program to generate tables of 10. */
        int number = 10;

        System.out.println("Table of " + number);
        for(int i = 1; i <= 10; i++){
            int result = number * i;
            System.out.println(number + " X " + i + " = " + result);
        }
    }
}
