class Solution {
    public long minimumCost(String source,String target,
                            char[] original,char[] changed,int[] cost){
        long ans=0;
        long[][] mincost=new long[26][26];

        for(long[] r:mincost) Arrays.fill(r,Integer.MAX_VALUE);

        for(int i=0;i<original.length;i++){
            int u=original[i]-'a';
            int v=changed[i]-'a';
            mincost[u][v]=Math.min(mincost[u][v],cost[i]);
        }

        for(int k=0;k<26;k++){
            for(int i=0;i<26;i++){
                for(int j=0;j<26;j++){
                    mincost[i][j]=Math.min(mincost[i][j],mincost[i][k]+mincost[k][j]);
                }
            }
        }

        for(int i=0;i<source.length();i++){
            int s=source.charAt(i)-'a';
            int d=target.charAt(i)-'a';
            if(s==d) continue;
            if(mincost[s][d]==Integer.MAX_VALUE) return -1;
            ans+=mincost[s][d];
        }
        return ans;
    }
}
