class Solution {
    public int singleNumber(int[] nums) {
        int i=0;
        Arrays.sort(nums);
        while(i<nums.length-1){
            if((nums[i]^nums[i+1])==0){
                i+=3;
            }
            else{
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}