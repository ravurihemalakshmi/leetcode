class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long total_sum=0;
        int n=nums.length;
        for(int i=0;i<k;i++){
            int curr=nums[n-1-i];
            long multi=(long)curr*mul;
            long addi=(long)curr;
            total_sum+=Math.max(multi,addi);
            mul--;
        }
        return total_sum;
        
    }
}