class Solution {
    public List<String> letterCombinations(String digits) {
        List<String>ans=new ArrayList<>();
        String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        generate(0,"",digits,ans,map);
        return ans;
    }
    public void generate(int index,String current,String digits,List<String>ans,String[] map){
        if(index==digits.length()){
            ans.add(current);
            return;
        }
        String letters=map[digits.charAt(index)-'0'];
        for(int i=0;i<letters.length();i++){
            char ch=letters.charAt(i);
            generate(index+1,current+ch,digits,ans,map);
        }
    }
}