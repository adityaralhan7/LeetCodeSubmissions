class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(nums.length==1) return 0;
        Arrays.sort(nums);
        int left=0;
        int min=Integer.MAX_VALUE;
        for(int right=k-1;right<nums.length;){
            int diff=nums[right]-nums[left];
            if(diff<min){
                min=diff;
            }
                left++;
                right++;
        }
        return min;
    }
}