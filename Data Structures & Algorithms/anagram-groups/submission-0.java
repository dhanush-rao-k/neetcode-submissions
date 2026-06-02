class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0)
            return new ArrayList<>();
        HashMap<String,List<String>> map= new HashMap<>();
        for(String s:strs)
        {
            char[] schar=s.toCharArray();
            Arrays.sort(schar);
            String key=new String(schar);
            if(!map.containsKey(key))
            {
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
        
    }
}
