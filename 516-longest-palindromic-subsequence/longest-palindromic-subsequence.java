class Solution {
    public int longestPalindromeSubseq(String s) {
        String s1=new StringBuilder(s).reverse().toString();
        int m=s.length();
        int n=s.length();
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        int ans=trav(s,s1,m-1,n-1,dp);
        return ans;
    }
    public int trav(String s1,String s2,int m,int n,int dp[][]){
        if(m==-1||n==-1) return 0;
        if(dp[m][n]!=-1) return dp[m][n];
        if(s1.charAt(m)==s2.charAt(n)) return dp[m][n]=1+trav(s1,s2,m-1,n-1,dp);
        return dp[m][n]=Math.max(trav(s1,s2,m-1,n,dp),trav(s1,s2,m,n-1,dp));
    }
}