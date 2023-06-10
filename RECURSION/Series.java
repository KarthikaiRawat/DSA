
// 1/1^1 + 2 / 2 ^2 + 3 / 3^3
//import java.util.*;

public class Series {

    // public static double series(int n, int x) {

    // if (x == n)
    // return (x / (Math.pow(x, x)));

    // double s = (x / (Math.pow(x, x))) + series(n, x + 1);

    // return s;

    // }

    public static void series(int n, double s, int x) {

        if (x > n)
            System.out.println(s);
        else {

            s = s + (x / (Math.pow(x, x)));
            series(n, s, x + 1);
        }
    }

    public static void main(String[] args) {
        // System.out.println(series(3, 1));
        series(3, 0.0, 1);
    }
}