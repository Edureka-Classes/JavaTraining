package OOP.Polymorphism;

class A {
    void display(){
        System.out.println("In class A");
    }
}

class B extends A {
    void display(){
        System.out.println("In class B");
    }
}

public class Polymorphism {

    public static void main(String[] args) {
        //A obj = new A(); // display "In class A"
        //B obj = new B(); // display "In class B"
        A obj = new B();
        obj.display();
    }
}
