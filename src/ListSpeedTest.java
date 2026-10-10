import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListSpeedTest {
    static final int N = 100_000;

    public static long testTailAdd(List<Integer> list, int n) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        long end = System.currentTimeMillis();

        return end - start;
    }

    public static long testHeadAdd(List<Integer> list, int n) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            list.add(0, i);
        }

        long end = System.currentTimeMillis();

        return end - start;
    }

    public static void main(String[] args) {
        long aTail = testTailAdd(new ArrayList<>(), N);
        long lTail = testTailAdd(new LinkedList<>(), N);
        long aHead = testHeadAdd(new ArrayList<>(), N);
        long lHead = testHeadAdd(new LinkedList<>(), N);

        System.out.println("ArrayList尾部:" + aTail);
        System.out.println("LinkedList尾部:" + lTail);
        System.out.println("ArrayList尾部/LinkedList尾部:" + (aTail / (lTail + 1)));
        System.out.println("ArrayList头部:" + aHead);
        System.out.println("LinkedList头部:" + lHead);
        System.out.println("ArrayList头部/LinkedList头部:" + (aHead / (lHead + 1)));
    }
}
