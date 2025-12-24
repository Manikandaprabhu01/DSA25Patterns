package SlidingWindow;

public class MinimumSizeSubArraySum {
    public static void main(String[] args) {
         int[]  nums = {2,3,1,2,4,3};
         int target = 7;
       int minValue = minSubArrayLen(target,nums);
       System.out.println(minValue);
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int left = 0;
        int currSum = 0;

        for(int right=0; right<nums.length;right++){
            currSum += nums[right];
            while(currSum >= target) {
                if(right-left+1 < minLen){
                    minLen = right-left+1;
                }
                currSum -= nums[left];
                left++;
            }
        }
        return minLen != Integer.MAX_VALUE ? minLen : 0;
    }
}





//Given an array of positive integers nums and a positive integer target,
// return the minimal length of a subarray whose sum is greater than or equal to target.
// If there is no such subarray, return 0 instead.
//
//
//
// Example 1:
//
//Input: target = 7, nums = [2,3,1,2,4,3]
//Output: 2
//Explanation: The subarray [4,3] has the minimal length under the problem constraint.
//Example 2:
//
//Input: target = 4, nums = [1,4,4]
//Output: 1
//Example 3:
//
//Input: target = 11, nums = [1,1,1,1,1,1,1,1]
//Output: 0
//
//
//Constraints:
//
//        1 <= target <= 109
//        1 <= nums.length <= 105
//        1 <= nums[i] <= 104
//
//
//Follow up: If you have figured out the O(n) solution, try coding another solution of which the time complexity is O(n log(n)).