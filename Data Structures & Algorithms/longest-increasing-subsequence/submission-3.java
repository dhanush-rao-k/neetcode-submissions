class Solution {
    int[] dp;
    public int lengthOfLIS(int[] nums) {
        dp=new int[nums.length];
        Arrays.fill(dp,-1);

        int res=1;
        for(int i=0;i<nums.length;i++)
            res=Math.max(res,dfs(nums,i));
        return res;
    }
    public int dfs(int[] nums,int i)
    {
        if(dp[i]!=-1)
            return dp[i];
        
        int res=1;
        for(int j=i+1;j<nums.length;j++)
        {
            if(nums[i]<nums[j])
                res=Math.max(res,1+dfs(nums,j));
        }
        dp[i]=res;
        return res;
    }
}
