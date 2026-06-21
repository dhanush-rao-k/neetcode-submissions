class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int mid=0;
        int minimum=Integer.MAX_VALUE;
        while(l<=r)
        {
            mid=(l+r)/2;
            minimum=Math.min(minimum,nums[mid]);
            if(nums[mid]<nums[r])
            {
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return minimum;
        
    }
}
