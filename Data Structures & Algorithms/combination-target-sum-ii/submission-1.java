class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        dfs(candidates,target,0,new ArrayList<>(),0,res);
        return res;
    }
    public void dfs(int[] candidates,int target, int i,List<Integer> cur, int total, List<List<Integer>> res)
    {
        if(total==target)
        {
            res.add(new ArrayList<>(cur));
            return;
        }
        if(total> target || i==candidates.length)
            return;
        cur.add(candidates[i]);
        dfs(candidates,target,i+1,cur,total+candidates[i],res);
        cur.remove(cur.size()-1);
        while(i+1<candidates.length && candidates[i]==candidates[i+1])
            i++;
        dfs(candidates,target,i+1,cur,total,res);
    

    }
}
