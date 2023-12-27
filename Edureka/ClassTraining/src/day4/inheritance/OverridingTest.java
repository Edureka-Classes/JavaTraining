package day4.inheritance;

class A1{
    int a=10, b =20;

    void display(){
        System.out.println("In class A ---> " +a+ " | " +b);
    }
}

class B1 extends A1 {
    int a=30, b= 44;

//    @Override
    void display(){
        System.out.println("In class B ---> " +this.a+ " | " +this.b+ " | " +super.a + " | " +super.b);
//        super.display();
    }
}
public class OverridingTest {
        public static void main(String[] args) {
            A1 obj = new B1();
            obj.display();
        }
}
