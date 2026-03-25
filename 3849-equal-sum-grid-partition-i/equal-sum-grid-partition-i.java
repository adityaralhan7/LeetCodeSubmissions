class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        long totalSum=0;
        long rowSum=0;
        long colSum=0;
        int rows=grid.length;
        int cols=grid[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                totalSum+=grid[i][j];
            }
        }
        if(totalSum%2!=0){
            return false;
        }
        for(int i=0;i<rows-1;i++){
            for(int j=0;j<cols;j++){
                rowSum+=grid[i][j];
            }
            if(rowSum*2==totalSum){
                    return true;
                }
        }
        for(int i=0;i<cols-1;i++){
            for(int j=0;j<rows;j++){
                colSum+=grid[j][i];
            }
            if(colSum*2==totalSum){
                    return true;
                }
        }
        return false;
    }
}