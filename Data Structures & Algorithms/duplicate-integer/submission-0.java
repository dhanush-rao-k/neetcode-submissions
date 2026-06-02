
class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> HM = new HashMap<>();
        for(int num:nums)
        {
            if(HM.containsKey(num))
            return true;
            else
            HM.put(num,1);
        }
        return false;

    }
}