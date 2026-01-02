class Solution {
    public int repeatedNTimes(int[] nums) {
        int n=nums.length/2;
        int count=0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
                if(count+1==n) return nums[i];
            }
            else count=0;
        }
        return nums[0];
    }
}