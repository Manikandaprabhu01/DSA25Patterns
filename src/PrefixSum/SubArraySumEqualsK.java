package PrefixSum;

import java.util.Map;
import java.util.HashMap;


public class SubArraySumEqualsK {
    public static void main(String[] args) {
        int k = 2; int[] nums = {1,1,1};
       int sumvalue = subarraySum(nums,k);
       System.out.println(sumvalue);
    }
    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int sum=0;
        int count =0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(sum-k)){
                count += map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
