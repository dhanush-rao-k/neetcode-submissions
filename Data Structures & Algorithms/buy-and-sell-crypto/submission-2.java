class Solution {
    public int maxProfit(int[] prices) {
        int maxprof=0;
        if(prices.length==1)
            return 0;
        int left=0;
        int right=1;
        int profit=0;
        while(right<prices.length)
        {
            profit=prices[right]-prices[left];
            if(profit<0)
            {
                left=right;
                right=left+1;
            }
            else if(profit>=0)
            {
                maxprof=Math.max(maxprof,profit);
                right++;
            }
        }
        if(maxprof>0)
            return maxprof;
        else 
            return 0;
        
    }
}
