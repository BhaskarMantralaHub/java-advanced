package org.bhaskarmantralahub.collections;

import java.util.ArrayList;
import java.util.List;

public class CopyOfList {

    public static void main(String[] args) {
        new CopyOfList().init();
    }

    public void init() {
        var list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");

        updateList(list);

        System.out.println(list); //[Hello, World, Bhaskar]

        //*********************************************************************

        List<String> immutableList = List.of("Hola", "Amigo");

//        Exception in thread "main" java.lang.UnsupportedOperationException
//        at java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:142)
//        at java.base/java.util.ImmutableCollections$AbstractImmutableCollection.add(ImmutableCollections.java:147)
//        at org.bhaskarmantralahub.collections.CopyOfList.updateList(CopyOfList.java:29)
//        at org.bhaskarmantralahub.collections.CopyOfList.init(CopyOfList.java:23)
//        at org.bhaskarmantralahub.collections.CopyOfList.main(CopyOfList.java:9)
       updateList(immutableList);

        System.out.println(immutableList);


        //*********************************************************************

        List<String> copyOfList = List.copyOf(list); //Mutable list - Convert Mutable to Immutable
        //Exception in thread "main" java.lang.UnsupportedOperationException
        updateList(copyOfList);

        System.out.println(copyOfList);
    }

    public void updateList(List<String> update) {
        update.add("Bhaskar");
    }

}
