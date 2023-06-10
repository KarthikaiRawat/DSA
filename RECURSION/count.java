// 2. Count Zero in a Given Number

// Num = 102030

// Count 0 - 3

public class count {

    static int c = 0;

    // public static int zero(int num) {

    // if (num == 0) {
    // return 0;
    // }
    // int d = num % 10;
    // if (d == 0) {
    // c++;
    // }
    // num = num / 10;
    // zero(num);
    // return c;

    // }

    public static void zero(int num) {
        if (num == 0) {
            System.out.print("zero= 1");
        } else if (num == 1) {
            System.out.print("zero=" + c);
        } else {
            int d = num % 10;
            if (d == 0) {
                c++;
            }
            num = num / 10;
            zero(num);

        }

    }

    public static void main(String[] args) {

        zero(00);

    }

}
