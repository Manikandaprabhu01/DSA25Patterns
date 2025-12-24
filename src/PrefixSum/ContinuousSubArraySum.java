package PrefixSum;

import java.util.HashMap;
import java.util.Map;

public class ContinuousSubArraySum {
    public static void main(String[] args) {
         int[] nums = {23,2,4,6,7};
         int k = 6;
       boolean resultVal =  checkSubarraySum(nums,k);
       System.out.println(resultVal);

    }

    public static boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> remainderIndex = new HashMap<>();
        int sum = 0;
        remainderIndex.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int remainder = sum % k;
            if (remainderIndex.containsKey(remainder)) {
                if (i - remainderIndex.get(remainder) > 1) {
                    return true;
                }
            } else {
                remainderIndex.put(remainder, i);
            }
        }
        return false;
    }
}
