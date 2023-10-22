package OOP.Final;

public class FinalTest {
    final int n = 10; // instance variable
    //final FinalTest(){} // error : modifier final not allowed

    public static void main(String[] args) {
        final int n = 12; //local variable
        System.out.println(n);

        //n = 13; //error : cannot assign a value to final variable n

        FinalTest obj = new FinalTest();
        System.out.println(obj.n);
        //obj.n=10; // error : cannot assign a value to final variable n
    }
}
