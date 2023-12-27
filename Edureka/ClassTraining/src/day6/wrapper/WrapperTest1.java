package day6.wrapper;

public class WrapperTest1 {
    public static void main (String[] args) {
//        Integer i1 = new Integer(25); // deprecated
//        Integer i2 = new Integer("25"); // deprecated

        Integer i3 = Integer.valueOf(25);
        Integer i4 = Integer.valueOf("25");
//        System.out.println(i1 + " | " + i2 + " | " + i3 + " | " + i4);
        System.out.println(i3 + " | " + i4);

        Character ch = new Character('A');
        System.out.println(ch);
        Character ch2 = ('A');
        System.out.println(ch2);
    }
}
