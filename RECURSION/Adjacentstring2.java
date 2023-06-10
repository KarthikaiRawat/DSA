// 13.Given a String find the adjacent element if it is same as the previous element so add the star in between

// e.g "aabbcc"

// output a*ab*bc*c

import java.util.*;

public class Adjacentstring2 {

    // public static String name(String s, String k) {
    // if (s.length() == 1) {
    // return s;
    // }

    // k = name(s.substring(1), k);
    // char ch = s.charAt(0);
    // if (ch == k.charAt(0)) {
    // k = ch + "*" + k;
    // } else {
    // k = ch + k;
    // }
    // return k;

    // }
    public static void name(String s, String k) {
        if (s.length() == 0) {
            System.out.println(k);

        } else {
            if (k.charAt(k.length() - 1) != s.charAt(0)) {
                k = k + s.charAt(0);
            } else {
                k = k + "*" + s.charAt(0);
            }

            name(s.substring(1), k);
        }
    }

    public static void main(String[] args) {
        // System.out.println(name("aabbcc", ""));
        name("aabbcc", " ");
    }

}
