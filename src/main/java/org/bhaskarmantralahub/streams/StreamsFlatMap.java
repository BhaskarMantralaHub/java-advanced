package org.bhaskarmantralahub.streams;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsFlatMap {
    public static void main(String[] args) {
        Integer[] input = {1, 2, 3, 4, 5, 6, 3, 1, 2, 3, 0};

        //23456742341
//        Operates on Stream ----------> Stream<>
        //Mapping one element with another element
        //data transformation
        Arrays.stream(input).map(i -> ++i).forEach(System.out::print);

        //Flat map - Operates on Stream of Stream    ------> <Stream<Stream<>>>
        //Mapping one element with many values
        //data transformation + Flattering


        System.out.println();
        Integer[][] flatMapInput = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        //2345678910
        Arrays.stream(flatMapInput).flatMap(i -> Arrays.stream(i).map(j -> ++j)).forEach(System.out::print);

        System.out.println();
        //123456789 - Flattens map
        Arrays.stream(flatMapInput).flatMap(Arrays::stream).forEach(System.out::print);

    }
}
