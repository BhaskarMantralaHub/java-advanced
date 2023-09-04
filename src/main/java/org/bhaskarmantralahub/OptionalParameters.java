package org.bhaskarmantralahub;

public class OptionalParameters {

    public static void main(String[] args) {
        methodWithOptionalParams("Hello");
        methodWithOptionalParams("Hello", "Hello", "Hola");
    }

    static void methodWithOptionalParams(String input1, String... inputs) {
        String[] inputArray = inputs;

        System.out.println(inputArray.length);
    }

}
