class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            maxi=Math.max(nums[i],maxi);
        }
        int low=1;
        int high=maxi;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(divisionSum(nums,mid)<=threshold){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int divisionSum(int[] nums,int divisor){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=Math.ceil((double)nums[i]/(double)divisor);
        }
        return sum;
    }
}