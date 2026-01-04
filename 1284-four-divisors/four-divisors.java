class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int sum=divisor(nums[i]);
            ans+=sum;
        }
        return ans;
    }
    public static int divisor(int n){

        int count=0,sum=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                count++;
                sum+=i;
                if(i!=n/i){
                    count++;
                    sum+=(n/i);
                }
            }
        }
        if(count==4) return sum;
        return 0;
    }
}