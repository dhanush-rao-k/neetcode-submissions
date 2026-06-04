class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=1;
        int[] output = new int[nums.length];
        int zero=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                zero++;
                continue;
            }
            else
                product*=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            if(zero>=2)
                return output;
            if(zero>0 && zero<2)
            {
                if(nums[i]==0)
                    output[i]=product;
                else
                    output[i]=0;
            }
            else
                output[i]=product/nums[i];
        }
        return output;
        
    }
}  
