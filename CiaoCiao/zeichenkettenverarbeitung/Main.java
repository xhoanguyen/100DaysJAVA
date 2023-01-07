package zeichenkettenverarbeitung;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // System.out.println(htmlElement("b", "Hello"));
        // System.out.println(emphasized("LOL"));
        // System.out.println(strong("Java"));

        // System.out.println(isEveryCharacterTwice("222"));
        YZswapper.printSwappedXZWithSwitch("yootaxz");
        YZswapper.printSwappedXZWithSwitch("Yanthoxzl");
        // System.out.println(isEveryCharacterTwice(null));

    }

    public static int isEveryCharacterTwice(String str) {

        if (str == null) {
            throw new NullPointerException("NullPointerException");
        }
        if (str.length() % 2 != 0) {
            return 0;
        }

        for (int i = 0, j = 1; i < str.length() && j < str.length(); i = i + 2, j = j + 2) {

            if (str.charAt(i) != str.charAt(j)) {
                return -(i + 1);
            }

        }

        return new Random().nextInt(0, 100);
    }

    public static String mix(String s, String sign) {

        String result = "";

        if (s.isEmpty())
            return result;
        if (s.length() == 1 && sign.length() == 1)
            return s;
        if (s == null || sign == null)
            return "";

        // Traverse the string
        for (int i = 0; i < s.length(); i++) {

            if (i == s.length() - 1) {

                result += s.charAt(i);
            } else {

                result += s.charAt(i) + sign;
            }

        }

        return result;

    }

    static String htmlElement(String tag, String body) {
        if (tag == null)
            tag = "";
        if (body == null)
            body = "";
        if (tag.isEmpty())
            return body;
        else
            return "<" + tag + ">" + body + "<\\" + tag + ">";
    }

    static String strong(String body) {

        return htmlElement("strong", body);

    }

    static String emphasized(String body) {

        return htmlElement("em", body);

    }

}
