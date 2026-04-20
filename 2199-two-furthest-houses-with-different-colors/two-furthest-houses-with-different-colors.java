class Solution {
    public int maxDistance(int[] colors) {
        int max=0;
        for(int i=0;i<colors.length;i++){
            if(colors[i]!=colors[0]){
                max=Math.max(max,i);
            }
            if(colors[i]!=colors[colors.length-1]){
                max=Math.max(max,colors.length-i-1);
            }
        }
        return max;
    }
}