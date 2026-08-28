class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>arr=new ArrayList<>();
        findCombo(candidates,0,target,ans,arr);
        return ans;
    }
    public void findCombo(int[] candidates,int index,int target,List<List<Integer>>ans,List<Integer>arr){
        if(target==0){
            ans.add(new ArrayList<>(arr));
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if(i>index&&candidates[i]==candidates[i-1]){
                continue;
            }
            if(candidates[i]>target){
                break;
            }
            arr.add(candidates[i]);
           
            findCombo(candidates,i+1,target-candidates[i],ans,arr);
            arr.remove(arr.size()-1);
        }
    }
}