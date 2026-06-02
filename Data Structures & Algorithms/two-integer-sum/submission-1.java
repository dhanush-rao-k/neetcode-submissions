class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> HM = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            HM.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(HM.containsKey(diff)&&HM.get(diff)!=i)
                return new int[]{i,HM.get(diff)};
        }
        return new int[0];
    }
}
