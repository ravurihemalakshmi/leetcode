class Solution {
    public int strStr(String haystack, String needle) {
        int[] lps=new int[needle.length()];
        lps[0]=0;
        int len=0;
        int i=1;
        while(i<needle.length()){
            if(needle.charAt(i)==needle.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else{
                if(len!=0){
                    len=lps[len-1];
                }
                else{
                    lps[i]=0;
                    i++;

                }
                
            }
        }
        int k=0;
        int l=0;
        while(k<haystack.length()){
            if(haystack.charAt(k)==needle.charAt(l)){
                k++;
                l++;
            }
            if(l==needle.length()){
                return k-l;
            }
            else if(k<haystack.length()&&l<needle.length()&&haystack.charAt(k)!=needle.charAt(l)){
                if(l!=0){
                    l=lps[l-1];
                }
                else{
                    k++;
                }
            }
        }
        return -1;
        
    }
}