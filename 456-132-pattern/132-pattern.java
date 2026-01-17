class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> stack=new Stack<>();
        int num2=Integer.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]<num2) return true;
            while(!stack.isEmpty()&&nums[i]>stack.peek()){
                num2=Math.max(num2,stack.pop());
            }
            stack.push(nums[i]);
        }
        return false;
    }
}