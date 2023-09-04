package org.bhaskarmantralahub.streams;

import java.util.stream.Stream;

public class StreamsMultiMap {

    public static void main(String[] args) {
        Stream<Double> sensorDataStream = Stream.of(22.0, 25.5, 28.0, 21.5, 30.0, 20.5);

        double lowerBound = 22.0;
        double upperBound = 28.0;

//        220.0
//        255.0
//        280.0
        //It filters and transform the data
        sensorDataStream
                .mapMulti((value, consumer) -> {
                    if (value >= lowerBound && value <= upperBound) {
                        Double transformedValue = value * 10;
                        consumer.accept(transformedValue);
                    }
                }).forEach(System.out::println);

        System.out.println();
        System.out.println();

        //Only filters, no data transformation
        Stream.of(22.0, 25.5, 28.0, 21.5, 30.0, 20.5)
                .filter((value) -> value >= lowerBound && value <= upperBound).forEach(System.out::print);
    }
}
