class Solution {
    public int mirrorDistance(int n) {
        int ans=reverse(n);
        return Math.abs(n-ans);
    }
    public int reverse(int n){
        int num=0;
        while(n>0){
            int digit=n%10;
            num*=10;
            num+=digit;
            n/=10;
        }
        return num;
    }
}