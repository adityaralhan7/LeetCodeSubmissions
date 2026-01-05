class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum=0;
        int negCount=0;
        int minAbs=Integer.MAX_VALUE;

        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int value=matrix[i][j];

                sum+=Math.abs(value);
                if(value<0) negCount++;
                minAbs=Math.min(minAbs,Math.abs(value));
            }
        }
        if(negCount%2==0) return sum;
        return sum-2*minAbs;
    }
}