package day14.jva8.lambda;

import java.util.*;
import java.util.function.*;

public class LambdaTest {
    public static void main (String[] args) {

        List<String> names = Arrays.asList("Buhari", "Fatima", "Nasir", "Asiah", "Maryam");
        System.out.println("Original list = " +names);
        System.out.println();

        /*
        Collections.sort(names);
        System.out.println("Names in sorted order = " +names);

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare (String s1, String s2) {
                return s2.compareTo(s1);
            }
        });
         */

        // ---- To use lambda
        System.out.println("To use Lambda");
        Comparator<String> namesLambda = (s1, s2) -> (s2.compareTo(s1));
        Collections.sort(names, namesLambda);
        System.out.println("Names in sorted order = " +names);
        System.out.println("-----------------------------------------");

        System.out.println("To use Lambda method2");
        Collections.sort(names, (s1, s2) -> s2.compareTo(s1));
        System.out.println("Names in sorted order = " +names);

        /*
        names.forEach(new Consumer<String>(){
            public void accept(String data){
                System.out.println("----> " +data);
            }
        });
        */

        Consumer<String> namesConsumer = data -> System.out.println("----> " +data);
//        names.forEach(namesConsumer); //OR
        names.forEach(name -> System.out.println("----> " +name));

    }

}
