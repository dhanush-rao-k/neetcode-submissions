
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> op = new ArrayList<>();
        Arrays.sort(nums);
        
        int start = 0;
        int end = 0;
        int a = 0;
        for(int i = 0; i < nums.length - 2; i++)
        { 
            a = nums[i];
            if(i > 0 && a == nums[i-1])
                continue;
                
            start = i + 1;
            end = nums.length - 1;
            
            while(start < end)
            {
                if(a + nums[start] + nums[end] == 0)
                {
                    op.add(List.of(a, nums[start], nums[end]));
                    
                    while(start < end && nums[start] == nums[start + 1]) {
                        start++;
                    }
                    while(start < end && nums[end] == nums[end - 1]) {
                        end--;
                    }
                    start++;
                    end--;
                }
                else if(a + nums[start] + nums[end] > 0)
                {   
                    end--;
                }
                else if(a + nums[start] + nums[end] < 0)
                {   
                    start++;
                }
            }
        }
        return op;
    }
}