public class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums.length <= 1)
            return 1;
        int middleIndex = nums.length / 2;
        if (target == nums[middleIndex])
            return middleIndex;

        if (target > nums[middleIndex]) {
            int[] nextNums = new int[nums.length - middleIndex];
            for (int i = 0; i < nums.length - middleIndex; i++) {
                nextNums[i] = nums[i+middleIndex];
            }
            return middleIndex + searchInsert(nextNums, target);
        }

        if (target < nums[middleIndex]) {
            int[] nextNums = new int[middleIndex];
            for (int i = 0; i < middleIndex; i++) {
                nextNums[i] = nums[i];
            }
            return searchInsert(nextNums, target);
        }

        return 0;
    }
    
}
