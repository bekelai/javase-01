import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCountStream {
    public static Map<String, Long> countWords(String text) {
        Map<String, Long> map = new HashMap<>();
        map = Arrays.stream(text.toLowerCase(Locale.ROOT).split("\\s+"))
                .collect(Collectors.groupingBy(v -> v, Collectors.counting()));
        return map;
    }

    public static void printSorted(Map<String, Long> counts) {
        counts.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(x -> System.out.println(x.getKey() + ":" + x.getValue()));

    }

    public static void main(String[] args) {
        String text = "hello world HELLO java world hello";
        Map<String, Long> counts = countWords(text);
        printSorted(counts);
    }


}
