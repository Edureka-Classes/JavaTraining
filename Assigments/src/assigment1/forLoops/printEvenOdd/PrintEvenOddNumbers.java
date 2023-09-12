package assigment1.forLoops.printEvenOdd;

public class PrintEvenOddNumbers {
    public static void main(String[] args) {

        /* Write a program to print 10 even numbers and 10 odd numbers. */

        for(int i = 1; i <= 20; i++){
            if(i % 2 == 0){
                System.out.println(i + " EVEN");
            } else {
                System.out.println(i + " ODD");
            }
        }

        System.out.println();
        System.out.println("******** USING ARRAYS ********");

        int [] num = {1,2,3,4,5,6,7,8,9,10};

        for(int i = 0; i < num.length; i++){
            if(i % 2 == 0){
                System.out.println(num[i] + " is EVEN");
            } else {
                System.out.println(num[i] + " is ODD");
            }
        }

    }
}
