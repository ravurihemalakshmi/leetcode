class Solution {
     List<String>ans=new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        generate("",0,0,n);
        return  ans;
        
    }
    public void generate(String curr,int open,int close,int n){
        if(curr.length()==2*n){
            ans.add(curr);
            return;
        }
        if(open<n){
            generate(curr+"(",open+1,close,n);
        }
        if(close<open){
            generate(curr+")",open,close+1,n);
        }
    }
}