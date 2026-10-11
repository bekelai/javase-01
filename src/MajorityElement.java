import java.util.HashMap;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int s : nums) {
            map.put(s, map.getOrDefault(s, 0) + 1);
            if (map.get(s) > nums.length / 2) return s;
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 2, 3};
        System.out.println("多元元素:" + majorityElement(nums1));
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("多元元素:" + majorityElement(nums2));
        int[] nums3 = {6, 6, 6, 7, 7};
        System.out.println("多元元素:" + majorityElement(nums3));
    }
}
