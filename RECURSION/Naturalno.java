// 3. Sum of N Natural Numbers

/**
 * Naturalno
 */
public class Naturalno {

    // public static int nn(int num) {
    // if (num == 1)
    // return 1;
    // return (num + nn(num - 1));

    // }

    public static void nn(int num, int res) {
        if (num == 0)
            System.out.println(res);
        else {
            res = res + num;
            nn(num - 1, res);
        }
    }

    public static void main(String[] args) {

        // System.out.println(nn(10));
        nn(10, 0);

    }
}