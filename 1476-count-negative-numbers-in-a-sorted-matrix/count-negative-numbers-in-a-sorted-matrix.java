class Solution {
    public int countNegatives(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        int i=rows-1;
        int j=0;
        int result=0;
        while(i>=0&&j<cols){
            if(grid[i][j]<0){
                i--;
                result+=cols-j;
            }
            else{
                j++;
            }
        }
        return result;
    }
}