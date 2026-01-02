class Solution {
    public int numSubseq(int[] nums, int target) {
        int mod=1000000007;
        Arrays.sort(nums);
        int n=nums.length;
        int power[]=new int[n];
        power[0]=1;
        for(int i=1;i<n;i++) power[i]=(power[i-1]*2)%mod;

        int l=0,r=n-1,ans=0;
        while(l<=r){
            if(nums[l]+nums[r]<=target){
                ans=(ans+power[r-l])%mod;
                l++;
            }
            else r--;
        }
        return ans;
    }
}