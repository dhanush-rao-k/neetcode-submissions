class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> Map=new HashMap<>();
        if(s.length()!=t.length())
        return false;
        for(int i=0;i<s.length();i++)
        {
            if(Map.containsKey(s.charAt(i)))
            Map.put(s.charAt(i),Map.get(s.charAt(i))+1);
            else
            Map.put(s.charAt(i),1);
        }
        for(int i=0;i<t.length();i++)
        {
            if(Map.containsKey(t.charAt(i)))
            Map.put(t.charAt(i),Map.get(t.charAt(i))-1);
            else
            return false;
            if(Map.get(t.charAt(i))==0)
            Map.remove(t.charAt(i));
            
        }
        if(Map.isEmpty())
        return true;
        else
        return false;

    }
}
