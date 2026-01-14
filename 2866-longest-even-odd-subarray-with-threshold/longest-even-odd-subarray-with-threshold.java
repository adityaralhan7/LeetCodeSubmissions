class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int n=nums.length;
        int i=0;
        int max=0;
        while(i<n){
            if(nums[i]%2==0&&nums[i]<=threshold){
                int start=i;
                i++;
                while(i<n&&nums[i]%2!=nums[i-1]%2&&nums[i]<=threshold){
                    i++;
                }
                max=Math.max(max,i-start);
            }
            else i++;
        }
        return max;
    }
}