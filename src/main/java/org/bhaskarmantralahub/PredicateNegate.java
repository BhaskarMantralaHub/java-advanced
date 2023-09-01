package org.bhaskarmantralahub;

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


    public static void main(String[] args) {
        Stream.of("1", "Bhaskar", "12").filter(stringToNumericPredicate).toList().forEach(System.out::println); // 1 12


        //Negate
        Stream.of("1", "Bhaskar", "12").filter(stringToNumericPredicate.negate()).toList().forEach(System.out::println); //Bhaskar


        System.out.println(stringToNumericPredicate.test("123"));
        System.out.println(stringToNumericPredicate.test("123!"));
    }



}
