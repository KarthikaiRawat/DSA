public class atoi {

    static int stringToInteger1(String s) {
        int n = 0, p = 0;
        double x = 0;
        s = s.trim();
        // System.out.println(s);
        if (s.length() == 0)
            return 0;
        if (s.charAt(0) == '-')
            n = 1;
        else if (s.charAt(0) == '+')
            p = 1;
        // System.out.println(s.charAt(1) > '0');
        for (int i = 0; i < s.length(); i++) {
            if ((n == 1 || p == 1) && i == 0) {
                continue;
            }

            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                // System.out.println(s.charAt(i));
                x = x * 10 + (s.charAt(i) - '0');
                // System.out.println(x);
            } else {
                break;
            }

        }

        if (n == 1)
            x = x * -1;

        return (int) x;

    }

    public static void main(String[] args) {
        System.out.println(stringToInteger1("words and 987"));

    }
}
