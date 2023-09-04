package org.bhaskarmantralahub.string;

import java.util.stream.Stream;

public class StringLinesMethod {

    public static void main(String[] args) {
        String input = "Hello World! \nBhaskar\nSarma\nMantrala";

        Stream<String> lines = input.lines();
        System.out.println(lines.count()); //3

        long count = input.lines().distinct().count();
        System.out.println(count); //2

        input.lines().distinct().forEach(System.out::println);
    }
}
