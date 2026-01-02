class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        combination(candidates,ans,new ArrayList<Integer>(),0,target);
        return ans;
    }

    public static void combination(int nums[],List<List<Integer>> ans,List<Integer> list,int index,int target){
        if(target==0){
            ans.add(new ArrayList<Integer>(list));
            return;
        }
        if(index==nums.length||target<0) return;

        if(nums[index]<=target){
            list.add(nums[index]);
            combination(nums,ans,list,index,target-nums[index]);
            list.remove(list.size()-1);
    }
    
        combination(nums,ans,list,index+1,target);
    
}
}