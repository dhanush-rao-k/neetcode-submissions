class Solution {
    public int maxArea(int[] heights) {
        int volume=0;
        int left=0;
        int right=heights.length-1;
        int length;
        int breadth;
        while(left<right)
        {   
            length=Math.min(heights[left],heights[right]);
            breadth=right-left;
            volume=Math.max(volume,length*breadth);
            if(heights[left]<heights[right])
                left++;
            else
                right--;

        }
        return volume;
        
    }
}
