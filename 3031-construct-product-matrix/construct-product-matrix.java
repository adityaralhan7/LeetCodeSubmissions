class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int res[][]=new int[n][m];
        long suffix=1;
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                res[i][j]=(int)suffix;
                suffix=(suffix*grid[i][j])%12345;
            }
        }
        long prefix=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res[i][j]=(int)(res[i][j]*prefix)%12345;
                prefix=(prefix*grid[i][j])%12345;
            }
        }
        return res;
    }
}