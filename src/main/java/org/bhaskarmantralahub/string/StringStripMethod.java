package org.bhaskarmantralahub.string;

public class StringStripMethod {

    public static void main(String[] args) {
        String stringWithWhiteSpaces = "    Hello Bhaskar \n\n\n \t    ";

        //Advanced version of trim()
        System.out.println(stringWithWhiteSpaces.strip());
        System.out.println(stringWithWhiteSpaces.stripLeading());
        System.out.println(stringWithWhiteSpaces.stripTrailing());

        String html = """
                <html>
                    <body>
                        <p>Hello, world</p>
                    </body>
                </html>
                    """;


        System.out.println(html.stripIndent());
        System.out.println(html);
    }

}
