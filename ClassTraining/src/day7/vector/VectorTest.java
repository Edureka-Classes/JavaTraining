package day7;

import java.util.Vector;

public class VectorTest{
    public static void main (String[] args) {

        // Vector<Integer> v = new Vector<>();
        // Vector<Integer> v = new Vector<>(5); //5 - intial capacity
        // Vector<Integer> v = new Vector<>(5); //5 - initial capacity
        Vector<Integer> v = new Vector<>(5, 3); //5 - initial capacity, capacity increment

        System.out.println(v + " | size = " + v.size() + " | capacity = " +v.capacity());
        for (int i = 11; i <=20; i++) {
            v.add(i);
        }
        System.out.println(v + " | size = " + v.size() + " | capacity = " +v.capacity());
    }
}
