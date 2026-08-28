class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>arr=new ArrayList<>();
        generate(0,candidates,target,ans,arr,0);
        return ans;
    }
    public void generate(int index,int[] candidates,int target,List<List<Integer>> ans,List<Integer>arr,int sum){
       
        if(sum>target){
            return;
        }
        if(index==candidates.length){
           if(sum==target){
              ans.add(new ArrayList<>(arr));
           }
           return;
        }
       
        arr.add(candidates[index]);
        sum+=candidates[index];
        generate(index,candidates,target,ans,arr,sum);
        arr.remove(arr.size()-1);
        sum-=candidates[index];
        generate(index+1,candidates,target,ans,arr,sum);

    }
}