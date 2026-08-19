class Solution {
    public int maxDepth(String s) {
        int maxdepth=0;
        int depth=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                depth++;
            }
            else if(ch==')'){
                maxdepth=Math.max(maxdepth,depth);
                depth--;
            }
        }
        return maxdepth;
    }
}