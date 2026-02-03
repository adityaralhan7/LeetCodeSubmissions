class Solution {
    public boolean isTrionic(int[] nums) {
        int p=-1;
        int q=-1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                p=i-1;
                break;
            }
        }
        if(p<1) return false;
        for(int i=p+1;i<nums.length;i++){
            if(nums[i]>=nums[i-1]){
                q=i-1;
                break;
            }
        }
        if(q<=p) return false;
        for(int i=q+1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]) return false;
        }
        return true;
    }
}