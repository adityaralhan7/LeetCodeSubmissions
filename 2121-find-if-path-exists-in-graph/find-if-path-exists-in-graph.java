class Solution {
    public boolean validPath(int n, int[][] edge, int source, int destination) {
        List<List<Integer>> edges = new ArrayList<>();
        for(int i=0;i<n;i++) edges.add(new ArrayList<>());
        for(int i=0;i<edge.length;i++){
            int node1=edge[i][0];
            int node2=edge[i][1];
            edges.get(node1).add(node2);
            edges.get(node2).add(node1);
        }

        int visited[]=new int[n];
        bfs(source,edges,visited);
        if(visited[destination]==1) return true;
        return false;
    }
    public void bfs(int start,List<List<Integer>> edges,int visited[]){
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(start);
        visited[start]=1;
        while(!queue.isEmpty()){
            int node=queue.poll();
            for(int ele:edges.get(node)){
                if(visited[ele]==0){
                    visited[ele]=1;
                    queue.offer(ele);
                }
            }
        }
    }
}