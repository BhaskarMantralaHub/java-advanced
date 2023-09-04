package org.bhaskarmantralahub.string;

public class StringFormatted {

    public static void main(String[] args) {
        String input = "Hello world, %s";

        var formattedString = input.formatted("Bhaskar");
        System.out.println(formattedString);
    }
}
