public class StringSpeedTest {
    public static void main(String[] args) {
        int n = 100000;
        long t1 = testString(n);
        long t2 = testBuilder(n);

        System.out.println("String:" + t1);
        System.out.println("StringBuilder:" + t2);
        System.out.println("倍率:" + t1 / (double) t2);
    }

    static long testString(int n) {
        String str = "Str";
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            str = str + i;
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    static long testBuilder(int n) {
        StringBuilder sb = new StringBuilder();
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            sb.append(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}
