class Solution {
    HashMap<Integer,Integer> dp=new HashMap<>();
    public int coinChange(int[] coins, int amount) {   
        int mincoins=dfs(coins,amount);
        return mincoins==Integer.MAX_VALUE?-1:mincoins;     
    }
    public int dfs(int[] coins, int amount)
    {
        if(amount==0)
            return 0;
        if(dp.containsKey(amount))
            return dp.get(amount);
        int res=Integer.MAX_VALUE;
        for(int coin:coins)
        {
            if(amount>=coin)
            {
                int result=dfs(coins,amount-coin);
                if(result!=Integer.MAX_VALUE)
                    res=Math.min(1+result,res);
            }
        }
        dp.put(amount,res);
        return res;
    }
}
