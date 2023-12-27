package day6.java.util;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {
    public static void main (String[] args) {
        List<String> names = new ArrayList<>();

        System.out.println("Is the list empty = " +names.isEmpty());
        System.out.println("No. of participnts = " +names.size());

        names.add("Buhari");
        names.add("Nasir");
        names.add("Fatima");
        names.add("Maryam");
        names.add("Aisha");
        names.add("Maiwada");
        names.add("Buhari");
        System.out.println(names + " | size = "+names.size());

        names.add(1, "Gide"); //add an element
        names.set(1, "GIDE"); // replace an element

        System.out.println(names + " | size = "+names.size());
        System.out.println("Person in index(0) = " +names.get(0));

        System.out.println("Index of \"Buhari\" = " +names.indexOf("Buhari"));
        System.out.println("Last index of \"Buhari\" = " +names.lastIndexOf("Buhari"));
        System.out.println("Index of \"edureka\" = " +names.indexOf("edureka"));

        System.out.println("Is \"Maiwada\" = " +names.contains("Maiwwada"));
        System.out.println("Is \"edureka\" = " +names.contains("edureka"));

        System.out.println("Remove(0) = " +names.remove(0)); // Buhari
        System.out.println("Remove(Buhari) = " +names.remove("Buhari")); // true

        System.out.println(names + " | size = "+names.size());

    }
}
