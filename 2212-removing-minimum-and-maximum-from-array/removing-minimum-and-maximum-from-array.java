class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length==1) return 1;
       int max=Integer.MIN_VALUE;
       int min=Integer.MAX_VALUE;
       for(int i:nums){
            max=Math.max(max,i);
            min=Math.min(min,i);
       }
       int front_min=-1;
       int front_max=-1;
       int back_min=nums.length;
       int back_max=nums.length;
       for(int i=0;i<nums.length;i++){
            if(nums[i]==min){
                front_min=i+1;
                back_min=(nums.length-i);
            }
            else if(nums[i]==max){
                front_max=i+1;
                back_max=(nums.length-i);
            }
       }
       int f=Math.max(front_max,front_min);
       int b=Math.max(back_max,back_min);
       int aditya=Math.min(f,b);
        
       return Math.min(aditya,Math.min(front_min,back_min)+Math.min(front_max,back_max));
    }
}