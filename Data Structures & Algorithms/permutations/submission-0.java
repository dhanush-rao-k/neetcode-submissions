class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(new ArrayList<>(),res,nums, new boolean[nums.length]);
        return res;
    }
    public void dfs(List<Integer> perm,List<List<Integer>> res,int[] nums, boolean[] pick){
        if(perm.size()==nums.length)
        {
            res.add(new ArrayList<>(perm));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!pick[i])
            {
                perm.add(nums[i]);
                pick[i]=true;
                dfs(perm,res,nums,pick);
                perm.remove(perm.size()-1);
                pick[i]=false;
            }
        }
    }
}
