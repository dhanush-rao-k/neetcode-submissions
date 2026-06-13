class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l=0;
        int r=l+s1.length()-1;
        String s;
        char[] s1c = s1.toCharArray();
        Arrays.sort(s1c);
        while(r<s2.length())
        {
            s=s2.substring(l,r+1);
            char[] sc = s.toCharArray();
            Arrays.sort(sc);
            if(Arrays.equals(s1c,sc))
                return true;
            r++;
            l++;
        }
        return false;
        
    }
}
