package day2;

public class IntegerTypes {
    public static void main(String[] args) {
//        byte b = -128;
//        byte b = 12;
        byte b = 127;
//        byte b = 128; //Type mismatch: cannot covert from int to byte
        System.out.println(b);

//        long pop = 2147483647;
//        long pop = 2147483648; //The literal 2147483648 of type int is out of range
        long pop = 2147483648L;
        System.out.println("world population is: " +pop);

//        int n = 12;
        //converting long type to int: Type-casting
        int n = (int)12L;
        System.out.println(n);
    }
}
