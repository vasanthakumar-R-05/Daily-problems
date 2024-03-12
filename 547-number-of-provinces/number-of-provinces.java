class Solution 
{
    public void helper(ArrayList<Integer>[]graph,int src,boolean []vis)
    {
        vis[src]=true;
        for(int e:graph[src])
        {
            if(vis[e]==false)
                helper(graph, e, vis);
        }
    }
    public int gcc(ArrayList<Integer>[]graph,int V)
    {
        boolean []vis=new boolean[V];
        int comp=0;
        for(int i=1;i<V;i++)
        {
            if(vis[i]==false)
            {
                helper(graph,i,vis);
                comp++;
            }
        }
        return comp;
    }
    public int findCircleNum(int[][] isConnected) 
    {
        int n=isConnected.length;
        ArrayList<Integer>[]graph=new ArrayList[n+1];
        for(int i=0;i<=n;i++)
            graph[i]=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(isConnected[i][j]==1 && i!=j)
                {
                    graph[i+1].add(j+1);
                    graph[j+1].add(i+1);
                }
            }
        }    
        return gcc(graph, n+1);
    }
}