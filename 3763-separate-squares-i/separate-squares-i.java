class Solution {
    public double separateSquares(int[][] squares) {
        double totalArea=0.0;
        double low=Double.MAX_VALUE,high=0.0;

        for(int[] s:squares) {
            double y=s[1];
            double l=s[2];
            totalArea+=l*l;
            low=Math.min(low,y);
            high=Math.max(high,y+l);
        }

        double target=totalArea/2.0;

        for (int i=0;i<60;i++) { 
            double mid =(low+high)/2.0;
            double areaBelow=0.0;

            for(int[] s:squares) {
                double y=s[1];
                double l=s[2];

                if(mid>y) {
                    double height=Math.min(l,mid-y);
                    areaBelow+=height*l;
                }
            }

            if(areaBelow<target) {
                low=mid;
            } 
            else{
                high=mid;
            }
        }

        return low;
    }
}