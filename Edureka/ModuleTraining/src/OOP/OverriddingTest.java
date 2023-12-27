package OOP;


import org.w3c.dom.ls.LSOutput;

class A1{
    int a = 10, b = 20;

    void display(){
        System.out.println("in class A --> " + a + " | " +b);
    }
}

class B1 extends A1 {
    int a = 30, b = 40;
    @Override
    void display() {
        System.out.println("in class B --> " + a + " | " + this.b + " | " + super.a+ " | " +super.b);
        super.display();
    }
}

public class OverriddingTest {

    public static void main(String[] args) {
        B1 obj = new B1();
        System.out.println(obj.a + " | " +obj.b);
        obj.display();
    }


}
