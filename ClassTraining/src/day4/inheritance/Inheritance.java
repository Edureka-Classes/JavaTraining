package day3.oops.inheritance;

class A{
    int a=10, b =20;
    void displayAB(){
        System.out.println("In class A ---> " +a+ " | " +b);
    }
}

class B extends A{
    int c=30;
    void displayABC(){
        System.out.println("In class B ---> " +a+ " | " +b+ " | " +c);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.a + " | " + obj.b+ " | ");
    }
}
