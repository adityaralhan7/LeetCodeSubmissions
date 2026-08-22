class Solution {
    public boolean checkDivisibility(int n) {
        int m=n;
        int prod=1;
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit;
            prod*=digit;
            n/=10;
        }
        if((m%(sum+prod))==0){
            return true;
        }
        return false;
    }
}