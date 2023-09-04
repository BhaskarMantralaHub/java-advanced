package org.bhaskarmantralahub.streams;

import java.util.Arrays;

public class StreamsTakeWhile {

    public static void main(String[] args) {
        Integer[] input = {1, 2, 3, 4, 5, 6, 3, 1, 2, 3, 0};

        //Iterates until the condition satisfies
        //123
        //Like for loop with break
        Arrays.stream(input).takeWhile(integer -> integer <= 3).forEach(System.out::print);

        System.out.println();

        //12331230
        //Like for loop with continue
        Arrays.stream(input).filter(integer -> integer <= 3).forEach(System.out::print);
    }
}
