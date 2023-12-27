package day4.inheritance;

class A2 {
    A2(){
        System.out.println("class A2 condtructor");
    }
}

class B2 extends A2 {
    B2 () {
        System.out.println("class B2 constructor");
    }

    public static void main (String[] args) {
        B2 obj = new B2();
    }
}
