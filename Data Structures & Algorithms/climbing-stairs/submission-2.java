class Solution {
    public int climbStairs(int n) {
        int step1=0;
        int step2=1;
        if(n<2)
            return n;
        for(int i=0;i<n;i++)
        {
            int temp=step2;
            step2+=step1;
            step1=temp;
        }
        return step2;
        
    }
}
