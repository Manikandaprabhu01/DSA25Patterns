package SlidingWindow;

import java.util.*;

public class MaximumSumOfDistinctSubArrayLengthK {
    public static void main(String[] args) {
      int[] nums = {1,5,4,2,9,9,9};
      int k = 3;
    long maxValue = maximumSubarraySum(nums,k);
    System.out.print(maxValue);
    }
    public static long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        long curSum=0, maxSum=0;
        int left = 0;
        for(int right = 0; right < nums.length; right++){
            while(set.contains(nums[right]) || set.size() == k){
                set.remove(nums[left]);
                curSum -= nums[left];
                left++;
            }
            set.add(nums[right]);
            curSum += nums[right];
            if(set.size()==k){
                maxSum = Math.max(curSum,maxSum);
            }
        }
        return maxSum;
    }
}
