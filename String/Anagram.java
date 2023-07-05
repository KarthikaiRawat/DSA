import java.util.HashMap;

public class Anagram {
    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        if (s.length() != t.length())
            return false;
        // HashMap<Character,Integer> mapp= new HashMap<>();
        for (char i : s.toCharArray()) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        for (char i : t.toCharArray()) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) - 1);
                if (map.get(i) == 0)
                    map.remove(i);
            }

        }
        return map.isEmpty();

    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));

    }
}
