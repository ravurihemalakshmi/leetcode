class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        StringBuilder ans=new StringBuilder();
        Stack<String>st=new Stack<String>();
        StringBuilder word=new StringBuilder();
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)!=' '){
                word.append(s.charAt(i));
            }
            else{
                if(word.length()>0){
                    st.push(word.toString());
                    word.setLength(0);
                }
            }
        }
        if(word.length()>0){
            st.push(word.toString());
            word.setLength(0);
        }
        while(!st.empty()){
            ans.append(st.pop());
            if(!st.empty()){
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}