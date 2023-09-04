package org.bhaskarmantralahub.streams;

import java.util.Arrays;

public class StreamsDropWhile {

    public static void main(String[] args) {
        Integer[] input = {1, 2, 3, 4, 5, 6, 3, 1, 2, 3, 0};

        //Iterates until the condition satisfies
        //Condition false to all numbers
        //45631230
        //Condition is false from 4, so 4 to last number
        Arrays.stream(input).dropWhile(integer -> integer <= 3).forEach(System.out::print);

        System.out.println();
        //12345631230
        //Condition false to all numbers
        //Condition is false from 1, so 1 to last number
        Arrays.stream(input).dropWhile(integer -> integer >= 3).forEach(System.out::print);

        System.out.println();

        //12331230
        //Like for loop with continue
        Arrays.stream(input).filter(integer -> integer >= 3).forEach(System.out::print);
    }
}
