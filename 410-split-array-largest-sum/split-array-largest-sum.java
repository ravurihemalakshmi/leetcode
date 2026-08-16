class Solution {
    public int splitArray(int[] nums, int k) {
        int low=Integer.MIN_VALUE;
        int high=0;
        if(k>nums.length) return -1;
        for(int i=0;i<nums.length;i++){
            low=Math.max(low,nums[i]);
            high+=nums[i];
        }
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(splitPossible(nums,mid,k)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
        
    }
    public boolean splitPossible(int[] nums,int maxsum,int k){
        int elements=1;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>maxsum) return false;
            if(nums[i]+sum>maxsum){
                elements++;
                sum=nums[i];
            }
            else{
                sum+=nums[i];
            }
        }
        if(elements<=k){
            return true;
        }
        else{
            return false;
        }

    }
}