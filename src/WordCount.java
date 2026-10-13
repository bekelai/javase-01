import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class WordCount {

    public static Map<String, Integer> countWords(String text) {
        Map<String, Integer> result = new HashMap<>();
        String[] stext = text.toLowerCase(Locale.ROOT).split("\\s+");
        for (int i = 0; i < stext.length; i++) {
            result.put(stext[i], result.getOrDefault(stext[i], 0) + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        String text = "hello world HELLO java world hello";
        Map<String, Integer> result = countWords(text);

        //toString输出
        System.out.println(result);

        //遍历输出
        for (Map.Entry<String, Integer> e : result.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }
    }
}
