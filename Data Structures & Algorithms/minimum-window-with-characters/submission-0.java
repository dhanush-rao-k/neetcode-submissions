class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> tmap = new HashMap<>(); 
        HashMap<Character,Integer> window = new HashMap<>();  
        int l=0;
        String minstr="";
        for(char c : t.toCharArray())
            tmap.put(c,tmap.getOrDefault(c,0)+1);
        int have=0;
        int[] res={-1,-1};
        int resLen=Integer.MAX_VALUE;
        int need=tmap.size();
        for(int r=0;r<s.length();r++)
        {
            char c=s.charAt(r);
            window.put(c,window.getOrDefault(c,0)+1);
            if(tmap.containsKey(c)&&window.get(c).equals(tmap.get(c)))
            {
                have++;
            }
            while(have==need)
            {
                if((r-l+1)<resLen)
                {
                    resLen=r-l+1;
                    res[0]=l;
                    res[1]=r;
                }
                char leftchar=s.charAt(l);
                window.put(leftchar, window.get(leftchar)-1);
                if(tmap.containsKey(leftchar)&& window.get(leftchar)<tmap.get(leftchar))
                    have--;
                l++;
            }
        }
        return resLen==Integer.MAX_VALUE? "" : s.substring(res[0],res[1]+1);
    }
}
