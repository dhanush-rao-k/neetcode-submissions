class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> charset=new HashSet<>();
        int left=0;
        int right=1;
        int len=1;
        int maxlen=1;
        char[] str = s.toCharArray();
        if(s.length()==0)
            return 0;
        if(s.length()==1)
            return 1;
        while(right<s.length())
        {   
            charset.add(str[left]);
            if(charset.contains(str[right]))
            {
                left++;
                right=left+1;
                len=1;
                charset.clear();
            }
            else
            {   
                len++;
                maxlen=Math.max(len,maxlen);
                charset.add(str[right]);
                right++;
            }
        }
        return maxlen;
    }
}
