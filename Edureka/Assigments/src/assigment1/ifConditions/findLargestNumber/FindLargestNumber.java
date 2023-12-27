package assigment1.ifConditions.findLargestNumber;

public class FindLargestNumber {
    public static void main(String[] args) {

        /* Write a program to find largest of three numbers. */
        int num1 = -33;
        int num2 = -1;
        int num3 = -6;

        //using if-statement
        if(num1 > num2 && num1 > num3){
            System.out.println(num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2);
        }else {
            System.out.println(num3);
        }
    }
}
