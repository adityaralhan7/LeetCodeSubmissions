class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int start=0;
        int len1 =1,len2=1;
        int max=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                len1++;
                max=Math.max(max,len1);
            }
            else{
                start=i;
                len1=1;
            }
        }
        start=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                len2++;
                max=Math.max(max,len2);
            }
            else{
                start=i;
                len2=1;
            }
        }
        return max;
    }
}