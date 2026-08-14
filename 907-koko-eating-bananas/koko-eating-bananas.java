class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>maxi){
                maxi=piles[i];
            }
        }
        int low=1;
        int high=maxi;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int totaltime=requiredTime(piles,mid);
            if(totaltime<=h){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
        
    }
    public int requiredTime(int[] piles,int speed){
        double totalhours=0;
        for(int i=0;i<piles.length;i++){
            totalhours+=Math.ceil((double)piles[i]/(double)speed);

        }
        return (int)totalhours;
        
    }
}