class Solution {
    public boolean canFinish(int n, int[][] prerequisites) {
        ArrayList<Integer>[] graph = new ArrayList[n];
        int[] indegree = new int[n];
        ArrayList<Integer> ans = new ArrayList();
               
        for (int i = 0; i < n; i++)
            graph[i] = new ArrayList<Integer>();
        
        for (int[] ar: prerequisites)
        {
            graph[ar[1]].add(ar[0]);
            indegree[ar[0]]++;
        }
        
        for (int i = 0; i < n; i++)
            if (indegree[i] == 0)
                ans.add(i);
        
        for (int i = 0; i < ans.size(); i++)
        {
            for (int j: graph[ans.get(i)])
            {
                if (--indegree[j] == 0)
                {
                    ans.add(j);
                }
            }
        }
        return ans.size() == n;
    }
}