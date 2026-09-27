class Solution {
    public int maxProduct(int[] nums) {
        int res=nums[0];
        int maxp=1;
        int minp=1;
        for(int i=0;i<nums.length;i++)
        {
            int temp=maxp;
            maxp=Math.max(Math.max(nums[i]*maxp,nums[i]*minp),nums[i]);
            minp=Math.min(Math.min(nums[i]*temp,nums[i]*minp),nums[i]);
            res=Math.max(res,maxp);
        }
        return res;
        
    }
}
