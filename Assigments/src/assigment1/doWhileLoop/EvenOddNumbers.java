package assigment1.doWhileLoop;

public class EvenOddNumbers {
    public static void main(String[] args) {

        /* Write a program to print 10 even numbers and 10 odd numbers. */
        int num = 10;
        int i = 0;
        do {
            if(i % 2  == 0){
                System.out.println(i +" is Even.");
            } else {
                System.out.println(i +" is Odd.");
            }
            i++;
        }
        while (i <= num);
    }
}
