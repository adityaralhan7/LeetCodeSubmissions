class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int val=duration-1;
        int ans=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<timeSeries.length-1;i++){
            int time=timeSeries[i];
            int time2=timeSeries[i+1];
            if(time2<=time+val) ans+=time2-time;
            else ans+=duration;
        }
        return ans+=duration;
    }
}