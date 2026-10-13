import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        char[] str1 = s.toLowerCase(Locale.ROOT).toCharArray();
        char[] str2 = t.toLowerCase(Locale.ROOT).toCharArray();
        if (str1.length != str2.length) return false;
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < str1.length; i++) {
            map1.put(str1[i], map1.getOrDefault(str1[i], 0) + 1);
        }
        for (int i = 0; i < str2.length; i++) {
            map2.put(str2[i], map2.getOrDefault(str2[i], 0) + 1);
        }
        for (Character key : map1.keySet()) {
            if (!map1.get(key).equals(map2.get(key))) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println(isAnagram(s1, t1));
        String s2 = "aacc";
        String t2 = "ccac";
        System.out.println(isAnagram(s2, t2));


    }
}
