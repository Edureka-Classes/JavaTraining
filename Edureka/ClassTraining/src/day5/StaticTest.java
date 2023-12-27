package day5;

public class StaticTest {
    // int n = 10;
    static int n = 10;

    void inc(){
        n = n + 1;
    }

    public static void main (String[] args) {
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
        StaticTest st3 = new StaticTest();

        st1.inc();
        st2.inc();
        st3.inc();

        System.out.println(st1.n);
        System.out.println(st2.n);
        System.out.println(st3.n);
    }
}
