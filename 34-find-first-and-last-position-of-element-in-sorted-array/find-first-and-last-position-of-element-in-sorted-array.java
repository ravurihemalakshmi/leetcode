class Solution {
    public int[] searchRange(int[] nums, int target) {
        int f=firstOccurence(nums,target);
        int l=lastOccurence(nums,target);
        return new int[]{f,l};
        
    }
    public int firstOccurence(int[] nums,int target){
        int ans=-1;
        int low=0;
        int n=nums.length;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                ans=mid;
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    public int lastOccurence(int[] nums,int target){
        int n=nums.length;
        int ans=-1;
        int low =0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                ans=mid;
                low=mid+1;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}