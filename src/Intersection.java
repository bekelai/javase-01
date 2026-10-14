import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }
        for (int i : nums2) {
            if (set.contains(i)) res.add(i);
        }
        int[] result = new int[res.size()];
        int i = 0;
        for (int n : res) {
            result[i++] = n;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
        int[] nums3 = {4, 5, 9};
        int[] nums4 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(intersection(nums3, nums4)));
    }
}
