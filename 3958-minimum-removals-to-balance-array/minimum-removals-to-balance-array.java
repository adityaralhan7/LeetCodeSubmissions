class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int maxLen=0;
        int i=0;
        for(int j=0;j<nums.length;j++){
            while((long)nums[j]>(long)nums[i]*k){
                i++;
            }
            maxLen=Math.max(maxLen,j-i+1);
        }
        return nums.length-maxLen;
    }
}