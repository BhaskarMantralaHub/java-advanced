package org.bhaskarmantralahub;


public record MyRecordClass(String name, Integer age) {

    public static void main(String[] args) {
        var obj = new MyRecordClass("Bhaskar", 30);
        var obj1 = new MyRecordClass("Bhaskar", 30);
        System.out.println(obj);
        System.out.println(obj.equals(obj1));
        System.out.println(obj.age());

//        obj.age = 31; Cannot assign a value to final variable 'age'

    }
}
