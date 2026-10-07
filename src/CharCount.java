public class CharCount {
    public static int[] charCount(String str) {
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                count[ch - 'a']++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "hellojava";
        int[] result = charCount(str);
        for (int i = 0; i < result.length; i++) {
            if (result[i] != 0) {
                System.out.println((char) (i + 'a') + ":" + result[i]);
            }
        }
    }
}
