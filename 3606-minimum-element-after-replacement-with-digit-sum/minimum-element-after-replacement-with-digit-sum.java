class Solution {
    public int minElement(int[] nums) {
        int i=0;
        while(i<=nums.length-1){
            int sum=0;
            int num=nums[i];
            while(num>0){
            int digit=num%10;
            sum+=digit;
            num/=10;
        }
            nums[i]=sum;
            i++;
        }
        Arrays.sort(nums);
        return nums[0];
    }
}