class Solution {
    public int minimumDeleteSum(String s1, String s2) {

        int m=s1.length();
        int n=s2.length();
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    dp[i+1][j+1]=dp[i][j]+s1.charAt(i);
                }
                else{
                    dp[i+1][j+1]=Math.max(dp[i+1][j],dp[i][j+1]);
                }
            }
        }
        int total=0;
        for(char c:s1.toCharArray()) total+=c;
        for(char c:s2.toCharArray()) total+=c;

        return total-2*dp[m][n];
    }
}