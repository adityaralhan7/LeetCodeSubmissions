class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(nums,0,new ArrayList<Integer>(),ans);
        return ans;
    }

    public void backtrack(int nums[],int index,List<Integer> list,List<List<Integer>> ans){
        if(index==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[index]);
        backtrack(nums,index+1,list,ans);
        list.remove(list.size()-1);
        backtrack(nums,index+1,list,ans);
    }
}