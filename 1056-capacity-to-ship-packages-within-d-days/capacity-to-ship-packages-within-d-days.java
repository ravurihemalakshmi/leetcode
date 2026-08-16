class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int mini=Integer.MIN_VALUE;
        int maxi=0;
        for(int i=0;i<weights.length;i++){
            mini=Math.max(mini,weights[i]);
            maxi+=weights[i];
        }
        int low=mini;
        int high=maxi;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            int Dayss=daysRequired(weights,mid); 
            if(Dayss<=days){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;;
            }

        }
        return ans;
    }
    public int daysRequired(int[] weights,int capacity){
        int load=0;
        int days=1;
        for(int i=0;i<weights.length;i++){
            if(load+weights[i]>capacity){
                days++;
                load=weights[i];
            }
            else{
                load+=weights[i];
            }
        }
        return days;
    }
}