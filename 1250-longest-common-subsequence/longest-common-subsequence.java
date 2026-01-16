class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return trav(text1,text2,m-1,n-1,dp);
    }
    public static int trav(String s1,String s2,int m,int n,int dp[][]){
        if(m==-1||n==-1) return 0;
        if(dp[m][n]!=-1) return dp[m][n];
        if(s1.charAt(m)==s2.charAt(n)) return dp[m][n]=1+trav(s1,s2,m-1,n-1,dp);
        return dp[m][n]=Math.max(trav(s1,s2,m-1,n,dp),trav(s1,s2,m,n-1,dp));
    }
}