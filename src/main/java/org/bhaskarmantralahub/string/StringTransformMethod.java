package org.bhaskarmantralahub.string;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringTransformMethod {

    public static void main(String[] args) {
        String input = "Hello World! 12345";

        String[] s1 = input.transform(s -> s.split(" "));
        String transform = input.transform(String::toLowerCase);
        String transform1 = input.transform(s -> {
            String[] stringSplit = s.split(" ");
            Stream<String> objectStream = Arrays.stream(stringSplit).mapMulti((val, consumer) -> {
                try {
                    Integer integer = Integer.valueOf(val);
                    consumer.accept(String.valueOf(integer));
                } catch (NumberFormatException ignore) {

                }
            });
            return objectStream.reduce("", (a, b) -> a + b);
        });

        System.out.println(transform1);
    }
}
