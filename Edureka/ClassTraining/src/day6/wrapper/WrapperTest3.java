package day6.wrapper;

public class WrapperTest3 {

    public static void main (String[] args) {
        int n1 = 23;
        Integer n2 = n1; // auto-boxing = converting primitive data to Object
        int n3 = n2; // auto unboxing = converting Object to primitive
        System.out.println(n1 + " | " + n2 + " | " +n3 );
    }
}
