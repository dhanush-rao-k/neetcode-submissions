class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> combo =new ArrayList<>();
        int i=0;
        dfs(nums,res,combo,target,i);
        return res;
    }
    public void dfs(int[] nums,List<List<Integer>> res,List<Integer> combo,int target,int i)
    {
        if(target<0||i>=nums.length)
            return;
        if(target==0)
        {
            res.add(new ArrayList<>(combo));
            return;   
        }
        combo.add(nums[i]);
        target-=nums[i];
        dfs(nums,res,combo,target,i);
        combo.remove(combo.size()-1);
        target+=nums[i];
        dfs(nums,res,combo,target,i+1);
    }
}
