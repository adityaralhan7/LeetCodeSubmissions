class Solution {
    public int minCost(int n,int[][] edges){
        Map<Integer,List<int[]>> graph=new HashMap<>();

        for(int[] e:edges){
            int u=e[0],v=e[1],c=e[2];
            graph.computeIfAbsent(u,k->new ArrayList<>()).add(new int[]{v,c});
            graph.computeIfAbsent(v,k->new ArrayList<>()).add(new int[]{u,2*c});
        }
        return dijkstra(n,graph);
    }

    private int dijkstra(int n,Map<Integer,List<int[]>> graph){
        int[] dist=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[0]=0;

        boolean[] vis=new boolean[n];
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.offer(new int[]{0,0});

        while(!pq.isEmpty()){
            int[] cur=pq.poll();
            int u=cur[0],cost=cur[1];
            if(u==n-1) return cost;
            if(vis[u]) continue;
            vis[u]=true;

            for(int[] e:graph.getOrDefault(u,Collections.emptyList())){
                int v=e[0],nc=cost+e[1];
                if(nc<dist[v]){
                    dist[v]=nc;
                    pq.offer(new int[]{v,nc});
                }
            }
        }
        return -1;
    }
}
