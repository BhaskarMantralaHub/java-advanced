package org.bhaskarmantralahub;

public class StringStripMethod {

    public static void main(String[] args) {
        String stringWithWhiteSpaces = "    Hello Bhaskar \n\n\n \t    ";

        //Advanced version of trim()
        System.out.println(stringWithWhiteSpaces.strip());
    }

}
