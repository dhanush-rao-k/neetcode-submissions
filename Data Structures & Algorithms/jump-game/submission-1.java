class Solution {
    public boolean canJump(int[] nums) {
        int reqstep=1;
        int i=nums.length-2;
        while(i>=0)
        {
            if(nums[i]>=reqstep)
            {
                reqstep=1;
                i--;
                continue;
            }
            i--;
            reqstep++;
        }
        if(reqstep==1)
            return true;
        return false;
    }
}
