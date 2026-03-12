class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length; 
        int visited[][]=new int[m][n]; 
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'&&visited[i][j]==0){
                    bfs(i,j,grid,visited,m,n);
                    count++;
                }
            }
        }
        return count;
    }
    public void bfs(int i,int j,char grid[][],int visited[][],int m,int n){
        Queue<Pair<Integer,Integer>> queue=new LinkedList<>();
        queue.add(new Pair<>(i,j));
        while(!queue.isEmpty()){
            Pair<Integer,Integer> p=queue.poll();
            int row=p.getKey();
            int col=p.getValue();
            if(row>0){
                if(visited[row-1][col]==0&&grid[row-1][col]=='1'){
                    queue.offer(new Pair<>(row-1,col));
                    visited[row-1][col]=1;
                }
            }
            if(row<m-1){
                if(visited[row+1][col]==0&&grid[row+1][col]=='1'){
                    queue.offer(new Pair<>(row+1,col));
                    visited[row+1][col]=1;
                }
            }
            if(col>0){
                if(visited[row][col-1]==0&&grid[row][col-1]=='1'){
                    queue.offer(new Pair<>(row,col-1));
                    visited[row][col-1]=1;
                }
            }
            if(col<n-1){
                if(visited[row][col+1]==0&&grid[row][col+1]=='1'){
                    queue.offer(new Pair<>(row,col+1));
                    visited[row][col+1]=1;
                }
            }
        }
    }
}