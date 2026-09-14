class Solution {
    public int countComponents(int n, int[][] edges) {
        if(n==0)
            return 0;
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int[] edge:edges)
        {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        Set<Integer> visited=new HashSet<>();
        int comp=0;
        for(int node=0;node<n;node++)
        {
            if(!visited.contains(node))
            {
                dfs(visited,adj,node);
                comp++;
            }
        }
        return comp;
    }
    public void dfs(Set<Integer> visited,List<List<Integer>> adj,int node)
    {
        visited.add(node);
        for(int nei:adj.get(node))
        {
            if(!visited.contains(nei))
                dfs(visited,adj,nei);
        }
    }
}
