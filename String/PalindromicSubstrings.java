class PalindromicSubstrings {
    public static int countSubstrings(String s) {
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String t = s.substring(i, j);
                if (palindrome(t)) {

                    c++;
                }

            }

        }

        return c;
    }

    static boolean palindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(countSubstrings("abcc"));
    }
}
