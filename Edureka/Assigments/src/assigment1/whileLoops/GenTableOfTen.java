package assigment1.whileLoops;

public class GenTableOfTen {
    public static void main(String[] args) {
        /* Write a program to generate tables of 10. */
        int num = 10;
        int i = 1;

        System.out.println("Table of Ten");
        while(i<=num){
            int result = num * i;
            System.out.printf("%d X %d = %d \n", num, i, result);
            i++;
        }
    }
}
