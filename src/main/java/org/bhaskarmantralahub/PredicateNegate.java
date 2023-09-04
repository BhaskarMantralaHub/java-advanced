package org.bhaskarmantralahub;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateNegate {

    private static final Predicate<String> stringToNumericPredicate = input -> {
        try {
            Integer.valueOf(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    };

    private static final Function<Integer, Boolean> isEven = input -> input % 2 == 0;


    public static void main(String[] args) {
        Stream.of("1", "Bhaskar", "12").filter(stringToNumericPredicate).toList().forEach(System.out::println); // 1 12


        //Negate
        Stream.of("1", "Bhaskar", "12").filter(stringToNumericPredicate.negate()).toList().forEach(System.out::println); //Bhaskar


        //Negate with class method
        Stream.of(1, 2, 3).filter(Predicate.not(isEven::apply)).toList().forEach(System.out::println); //Prints odd number


        System.out.println(stringToNumericPredicate.test("123"));
        System.out.println(stringToNumericPredicate.test("123!"));


        Boolean response = isEven.apply(10);
        System.out.println(response);
    }


}
