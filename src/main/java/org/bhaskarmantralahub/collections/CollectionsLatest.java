package org.bhaskarmantralahub.collections;

import java.util.List;
import java.util.Set;

public class CollectionsLatest {

    public static void main(String[] args) {
        var set = Set.of("Bhaskar", "Sarma");
        var list = List.of("Bhaskar", "Sarma");

        System.out.println(set);
        System.out.println(list);

        var listToSet = Set.of(list);

        System.out.println(listToSet);


        var setToList = List.of(set);
        System.out.println(setToList);


//        [Sarma, Bhaskar]
//[Bhaskar, Sarma]
//[[Bhaskar, Sarma]]
//[[Sarma, Bhaskar]]
    }
}
