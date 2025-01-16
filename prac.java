package concept;

import java.util.Arrays;

public class prac {
    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int idx = -1;
        for(int i = n-2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                idx = i;
                break;
            }
        }
//        if(idx != -1) {
//            for (int i = n - 1; i >= idx; i--) {
//                if (nums[i] > nums[idx]) {
//                    swap(nums, i, idx);
//                    break;
//                }
//            }
//        }
//        reverse(nums,idx+1,n-1);
        System.out.println(nums[idx]);
    }
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
            int[] nums1 = {2, -1, 0};
            nextPermutation(nums1);
            System.out.println(Arrays.toString(nums1)); // Output: [1, 3, 2]

//            int[] nums2 = {3, 2, 1};
//            nextPermutation(nums2);
//            System.out.println(Arrays.toString(nums2)); // Output: [1, 2, 3]

            int[] nums3 = {1, 1, 5};
            nextPermutation(nums3);
            System.out.println(Arrays.toString(nums3));
        }


}



