//7Check Palindrome String   NITIN
public class palindrome {

    public static String name(String s, String k) {

        if (s.length() == 0) {
            return k;
        }
        k = name(s.substring(1), k);
        k = k + s.charAt(0);
        return k;
    }

    public static void main(String[] args) {
        String p = (name("NITIN", ""));
        System.out.println(p);
        System.out.println((p.equals("NITIN")) ? "palindrome no" : "not palindrome no");
    }
}
