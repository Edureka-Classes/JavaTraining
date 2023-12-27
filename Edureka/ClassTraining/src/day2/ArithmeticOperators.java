package day2;

public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println(10 + 12);
        System.out.println(10 - 12);
        System.out.println(10 * 12);


        System.out.println(10 / 3);
        System.out.println(10f / 3);
        System.out.println(10.0 / 3);


        System.out.println(10 % 3);
        System.out.println(-10 % 3);
        System.out.println(10 % -3);
        System.out.println(-10 % -3);


       //  System.out.println(10 / 0); //java.lang.ArithmeticException
        System.out.println(10.0f / 0); //infinity
        System.out.println(10.0 / 0); //infinity
        System.out.println(-10.0 / 0); //-infinity
        System.out.println(0.0 / 0); //NaN (Not a Number)
    }
}
