class Solution { 
    public String longestPalindrome(String s) {
        String res="";
        int resLen=0;
        int index=0;
        for(int i=0;i<s.length();i++)
        {
            int l=i;
            int r=i;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
            {
                if(r-l+1>resLen)
                {
                    resLen=r-l+1;
                    index=l;
                }
                l--;
                r++;
            }
        }
        for(int i=0;i<s.length();i++)
        {
            int l=i;
            int r=i+1;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
            {
                if(r-l+1>resLen)
                {
                    resLen=r-l+1;
                    index=l;
                }
                l--;
                r++;
            }
        }
        return s.substring(index,index+resLen);
        
    }
}
