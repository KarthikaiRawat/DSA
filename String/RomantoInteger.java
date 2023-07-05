import java.util.HashMap;

public class RomantoInteger {
    public static int romanToInt(String s) {
        s = s + " ";
        int total = 0;
        HashMap<Character, Integer> map = new HashMap();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        map.put(' ', 0);

        char ch, ch1;
        for (int i = 1; i < s.length(); i++) {
            ch = s.charAt(i - 1);
            ch1 = s.charAt(i);
            if (map.get(ch) >= map.get(ch1)) {
                total += map.get(ch);

            } else {
                total += map.get(ch1) - map.get(ch);
                i = i + 1;
            }

        }
        return total;

    }

    public static void main(String[] args) {
        String s = "LXIII";
        System.out.println(romanToInt(s));

    }

}
