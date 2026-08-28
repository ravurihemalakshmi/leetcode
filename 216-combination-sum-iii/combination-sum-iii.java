class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>result=new ArrayList<>();
        generate(1,k,n,new ArrayList<>(),result);
        return result;
    }
    public void generate(int num,int k,int n,List<Integer>arr,List<List<Integer>>result){
        if(arr.size()==k){
            if(n==0){
                result.add(new ArrayList<>(arr));
            }
            return;
        }
        if(num>9||num<0){
            return;
        }
        arr.add(num);
        generate(num+1,k,n-num,arr,result);
        arr.remove(arr.size()-1);
        generate(num+1,k,n,arr,result);
    }
}