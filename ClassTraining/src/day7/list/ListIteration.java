package day7;

import java.util.*;

public class ListIteration {
    public static void main (String[] args) {

        List<Integer> marks = Arrays.asList(92, 67, 78, 91, 64, 77, 82);
        System.out.println(marks);
        System.out.println();

        iteration1(marks);
        iteration2(marks);
        iterator3(marks);
        iterator4(marks);
        iteration5(marks);
        iteration6(marks);
    }

    private static void iteration1(List<Integer> marks) {
        System.out.println(">>> iteration using for loop and get() method - only applicable for list implementation");
        for (int i = 0; i < marks.size(); i++) {
            Integer n = marks.get(i);
            System.out.print(n + "    ");
        }
        System.out.println("\n");
    }

        private static void iteration2(List<Integer> marks){
            System.out.println(">>> iterartion using enhanced for each loop");
            for (Integer n : marks) {
                System.out.print(n + "    ");
            }
            System.out.println("\n");
    }
    private static void iterator3(List<Integer> marks){
        System.out.println(">>> iteration using java.util.iterator \"MOST WIDELY USED\"");
        Iterator<Integer> it = marks.iterator();
        while(it.hasNext()){
            Integer n = it.next();
            System.out.print(n + "    ");
        }
        System.out.println("\n");
    }

    private static void iterator4(List<Integer> marks){
        System.out.println(">>> iteration using java.util.iterator - only applicable for list implementation");
        ListIterator<Integer> it = marks.listIterator();
        System.out.println("Forward Direction");
        while (it.hasNext()){
            Integer n = it.next();
            System.out.print(n + "    ");
        }
        System.out.println("\n");

        System.out.println("Reverse Direction");
       // ListIterator<Integer> ite = marks.listIterator();
        while(it.hasPrevious()){
            Integer n = it.previous();
            System.out.print(n + "    ");
        }
        System.out.println("\n");
    }

    private static void iteration5(List<Integer> marks){
        System.out.println(">>> iteration using java.util.Enumeration");
        Enumeration<Integer> en = Collections.enumeration(marks);
        while (en.hasMoreElements()){
            Integer n = en.nextElement();
            System.out.print(n + "    ");
        }
        System.out.println("\n");
    }

    private static void iteration6(List<Integer> marks){
        System.out.println(">>> iteration using lambda expression");
        marks.forEach(n -> System.out.print(n + "   "));

        System.out.println("\n");
    }



}
