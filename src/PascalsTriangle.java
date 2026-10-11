import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> listl = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) list.add(1);
                else list.add(listl.get(i - 1).get(j - 1) + listl.get(i - 1).get(j));
            }
            listl.add(list);
        }
        return listl;
    }

    public static void main(String[] args) {
        System.out.println(generate(0));
        System.out.println(generate(1));
        System.out.println(generate(5));
    }

}
