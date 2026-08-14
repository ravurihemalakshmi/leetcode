class Solution {
    public int minDays(int[] bloomDay,int m,int k){
        int mini=Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            mini=Math.min(mini,bloomDay[i]);
            maxi=Math.max(maxi,bloomDay[i]);
        }
        if(bloomDay.length<m*k) return -1;
        int low=mini;
        int high=maxi;
        int ans=-1;
        while(low<=high){
            
            int mid=low+(high-low)/2;
            if(canMake(bloomDay,m,k,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
        
    }
    public boolean canMake(int[] bloomDay,int m,int k,int day){
        int cnt=0;
        int boq=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=day){
                cnt++;
            }
            else{
                boq+=cnt/k;
                cnt=0;
            }
        }
        boq+=cnt/k;
        if(boq>=m) return true;
        else{
            return false;
        }
    }
}