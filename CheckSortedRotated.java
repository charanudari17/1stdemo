
/*
 * LeetCode 1752 - Check if Array Is Sorted and Rotated
 * Solved on: 2026-06-04
 * Notes:
 *  - Approach: find the first "drop" where nums[i] > nums[i+1]. If none, array
 *    is already sorted. Otherwise ensure the subarray after the drop is
 *    non-decreasing and that nums[0] >= nums[n-1] to allow the circular rotation.
 *  - This implementation matches the provided Solution.check(...) logic.
 *  - Time complexity: O(n). Space complexity: O(1).
 *  - Tested with sample arrays in main().
 */

import java.util.Arrays;

public class CheckSortedRotated {

    static class Solution {
        public boolean check(int[] nums) {
            int n = nums.length;
            int drop = -1;
            for (int i = 0; i < n - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    drop = i;
                    break;
                }

            }
            if (drop == -1) {
                return true;
            }

            for (int i = drop + 1; i < n - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    return false;
                }

            }
            return nums[0] >= nums[n - 1];
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] tests = {
                { 3, 4, 5, 1, 2 },
                { 2, 1, 3, 4 },
                { 1, 2, 3 },
                { 1, 1, 1 },
                { 2, 1 },
                { 10, 20, 30, 5, 7 }
        };

        for (int[] t : tests) {
            System.out.printf("%s -> %b\n", Arrays.toString(t), sol.check(t));
        }

        if (args.length > 0) {
            System.out.println("\nCustom inputs from args:");
            for (String s : args) {
                String[] parts = s.split(",");
                int[] a = new int[parts.length];
                for (int i = 0; i < parts.length; i++)
                    a[i] = Integer.parseInt(parts[i].trim());
                System.out.printf("%s -> %b\n", Arrays.toString(a), sol.check(a));
            }
        }
    }
}
