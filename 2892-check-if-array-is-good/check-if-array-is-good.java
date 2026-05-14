class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int max=nums[nums.length-1];
        if(nums.length<max+1||nums.length>max+1) return false;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]&&nums[i]!=max) return false;
            if(nums.length>=3){if(nums[nums.length-2]==nums[nums.length-1]&&nums[nums.length-3]==nums[nums.length-1]) return false;
        
        }}
        return true;
    }
}