class Solution {
    public double myPow(double x, int n) {
        double ans=1.0;
        long nn=n;
        if(nn<0){
            nn=nn*-1;
        
        }
        double result=calPow(x,nn);
        if(n<0){
            return 1.0/result;
        }
        return (double)result;
        
    }
    public double calPow(double x,long nn){
        if(nn==0){
            return 1;
        }
        else if(nn%2==0){
            return calPow(x*x,nn/2);
        }
        else if(nn%2==1){
            return x*calPow(x*x,nn/2);
        }
        return 1;
    }
}