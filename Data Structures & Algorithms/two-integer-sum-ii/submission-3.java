class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] out= new int[2];
        int diff;
        for(int i=0;i<numbers.length;i++)
        {
            diff=target-numbers[i];
            for(int j=i+1;j<numbers.length;j++)
            {
                if(numbers[j]>diff)
                    break;
                if(numbers[j]==diff)
                {
                    out[0]=i+1;
                    out[1]=j+1;
                }
            } 
        }
        return out;
        
    }
}
