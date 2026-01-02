class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
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

        for(int i=index;i<nums.length;i++){
            if(i>index&&nums[i]==nums[i-1]) continue;
            if(nums[i]>target) break;
            list.add(nums[i]);
            combination(nums,ans,list,i,target-nums[i]);
            list.remove(list.size()-1);
    }
    
}
}