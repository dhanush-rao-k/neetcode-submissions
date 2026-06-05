class Solution {
    public int longestConsecutive(int[] nums) {
        int[] nums_s = new int[nums.length];
        nums_s=Arrays.copyOf(nums,nums.length);
        Arrays.sort(nums_s);
        int output=Math.min(1,nums.length);
        int maxcon=1;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums_s[i+1]==nums_s[i])
                continue;
            if((nums_s[i+1]-nums_s[i])==1)
            {
                maxcon++;
                output=Math.max(output,maxcon);
            }
            else
                maxcon=1;
            
        }
        return output;
    }
}
