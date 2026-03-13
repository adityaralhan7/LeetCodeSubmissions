class Solution {
    public int findCircleNum(int[][] adj) {
        int n=adj.length;
        int visited[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(visited[i]==0){
                dfs(i,adj,visited);
                count++;
            }
        }
        return count;
    }
    public void dfs(int i,int[][] adj,int visited[]){
        int n=adj.length;
        visited[i]=1;
        for(int j=0;j<n;j++){
            if(adj[i][j]==1&&visited[j]==0){
                dfs(j,adj,visited);
            }
        }
    }
}