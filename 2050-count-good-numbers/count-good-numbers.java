class Solution {
    public int countGoodNumbers(long n) {
        long MOD=1000000007;
        long evenindices=(n+1)/2;
        long oddindices=n/2;
        long ans1=power(5,evenindices,MOD);
        long ans2=power(4,oddindices,MOD);
        return (int)((ans1*ans2)%MOD);
    }
    public long power(long x,long n,long MOD){
        if(n==0){
            return 1;
        }
        if(n%2==0){
            return power((x*x)%MOD,n/2,MOD);
        }
        else if(n%2==1){
            return (x*power((x*x)%MOD,n/2,MOD))%MOD;
        }
        return 1;
    }
}