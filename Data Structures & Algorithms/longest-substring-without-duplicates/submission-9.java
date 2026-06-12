class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> charset=new HashSet<>();
        int l=0;
        int len=0;
        for(int r=0;r<s.length();r++)
        {
            while(charset.contains(s.charAt(r)))
                {
                    charset.remove(s.charAt(l));
                    l++;
                }
            charset.add(s.charAt(r));
            len=Math.max(len,r-l+1);
        }
        return len;
    }
}
