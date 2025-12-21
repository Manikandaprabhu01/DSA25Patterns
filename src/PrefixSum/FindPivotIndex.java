package PrefixSum;

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        int pivotIdx = pivotIndex(nums);
        System.out.println(pivotIdx);
    }
    public static int pivotIndex(int[] nums) {
        int total =0;
        for(int num : nums){
            total +=num;
        }
        int leftSum =0;
        for(int i=0;i<nums.length;i++){
            int rightSum = total - leftSum - nums[i];
            if(rightSum == leftSum){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
