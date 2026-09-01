class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        int count=(1<<n);
        List<List<Integer>>subsets=new ArrayList<>();
        for(int i=0;i<count;i++){
            List<Integer>sub=new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i&(1<<j))!=0){
                    sub.add(nums[j]);
                }
            }
            subsets.add(sub);
        }
        return subsets;
    }
}