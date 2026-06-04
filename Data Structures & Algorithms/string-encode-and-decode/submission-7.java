class Solution {

    public String encode(List<String> strs) {
        String s,encoded="";
        for(int i=0;i<strs.size();i++)
        {
            s=strs.get(i);
            encoded+="#"+s.length()+"#"+s;
        }
        return encoded;
    }

    public List<String> decode(String str) {
        List<String> decoded= new ArrayList<String>();
        int i=0;
        int j=0;
        int length;
        while(i<str.length())
        {
            if(str.charAt(i)=='#')
            {
                j=i+1;
               while(str.charAt(j)!='#')
               {
                    j+=1;
               }
               length=Integer.parseInt(str.substring(i+1,j));
               i=j+1;
               j=i+length;
               decoded.add(str.substring(i,j));
               i=j;
            }
        }
        return decoded;

    }
}
