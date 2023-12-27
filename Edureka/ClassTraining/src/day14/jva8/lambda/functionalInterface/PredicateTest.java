package day14.jva8.lambda.functionalInterface;

import java.util.function.Predicate;

public class PredicateTest {
    public static void main (String[] args) {

//        List<Integer> nums = Arrays.asList(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
//        System.out.println("Original numbers = " +nums);

        int num = 13;


        Predicate<Integer> evenPredicate = n -> n % 2 == 0;
        boolean isEven = evenPredicate.test(num);

        System.out.println("Is " + num + " even = " + isEven);
    }
}
