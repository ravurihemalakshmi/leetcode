class Solution {

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        backtrack(0, nums, new ArrayList<>(), result);

        return result;
    }
    public void backtrack(int index,int[] nums,List<Integer>arr,List<List<Integer>>result){
        result.add(new ArrayList<>(arr));
        for(int i=index;i<nums.length;i++){
            if(i>index&&nums[i]==nums[i-1]){
                continue;
            }
            arr.add(nums[i]);
            backtrack(i+1,nums,arr,result);
            arr.remove(arr.size()-1);
        }
    }
}