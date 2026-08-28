class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>>res=new ArrayList<>();
        List<String>path=new ArrayList<>();
        generate(0,path,res,s);
        return res;
    }
    public void generate(int index,List<String>path,List<List<String>>res,String s){
        if(index==s.length()){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(isPalindrome(s,index,i)){
                path.add(s.substring(index,i+1));
                generate(i+1,path,res,s);
            path.remove(path.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s,int start,int end){
        while(start<=end){
        if(s.charAt(start)!=s.charAt(end)){
            return false;
        }
        start++;
        end--;
        
    }
       return true;
    
    }
 
}