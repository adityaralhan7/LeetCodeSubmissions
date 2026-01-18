class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> subset=new ArrayList<>();
        Arrays.sort(nums);
        int i=0;
        backtrack(nums,i,subset,ans);
        return ans;
    }
    public void backtrack(int nums[],int i,List<Integer> subset,List<List<Integer>> ans){
        if(i==nums.length){
            ans.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[i]);
        backtrack(nums,i+1,subset,ans);
        subset.remove(subset.size()-1);
        while(i+1<nums.length&&nums[i]==nums[i+1]) i++;
        backtrack(nums,i+1,subset,ans);
    }
}