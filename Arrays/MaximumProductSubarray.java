// Problem: Maximum Product Subarray
// Platform: LeetCode
// Difficulty: Medium
// Approach: Two-pass product traversal
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int maxProduct(int[] nums) {

        int n = nums.length;
        int currprdt = 1;
        int maxprdt = nums[0];

        // Left to Right
        for (int i = 0; i < n; i++) {
            currprdt *= nums[i];
            maxprdt = Math.max(maxprdt, currprdt);

            if (currprdt == 0) {
                currprdt = 1;
            }
        }

        currprdt = 1;

        // Right to Left
        for (int i = n - 1; i >= 0; i--) {
            currprdt *= nums[i];
            maxprdt = Math.max(maxprdt, currprdt);

            if (currprdt == 0) {
                currprdt = 1;
            }
        }

        return maxprdt;
    }
}
