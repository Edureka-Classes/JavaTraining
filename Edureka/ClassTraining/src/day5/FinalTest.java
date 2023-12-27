package day5;

public class FinalTest {

    //final FinalTest(){} // error: modifier final not allowed here
    final String name; //blank final variable

    FinalTest(){
        name = "edureka";
    }

    public static void main (String[] args) {

        final  int n = 10; // local variable
        // n = 12; // error: cannot assign a value to final variable n
        System.out.println(n);

        FinalTest obj = new FinalTest();
        //obj.n = 12; //error: cannot assign a value to final variable n
        System.out.println(obj.name);
    }
}
