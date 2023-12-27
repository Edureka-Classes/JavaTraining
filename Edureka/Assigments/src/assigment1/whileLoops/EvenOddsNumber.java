package assigment1.whileLoops;

public class EvenOddsNumber {
    public static void main(String[] args) {
        /* Write a program to print 10 even numbers and 10 odd numbers.*/
        int num = 10;

        while(num != 0 ){
            if(num % 2 == 0){
                System.out.println(num + " Even");
            }
            else {
                System.out.println(num + " Odds");
            }
            --num;
        }
    }
}
