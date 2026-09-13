class Solution {
    Map<Integer,List<Integer>> preMap=new HashMap<>();
    Set<Integer> visited=new HashSet<>();
    public boolean canFinish(int numCourses, int[][] pre) {
        for(int i=0;i<numCourses;i++)
        {
            preMap.put(i,new ArrayList<>());
        }
        for(int[] prereq : pre)
        {
            preMap.get(prereq[0]).add(prereq[1]);
        }
        for(int i=0;i<numCourses;i++)
            if(!dfs(i))
                return false;
        return true;
    }
    public boolean dfs(int course)
    {
        if(visited.contains(course))
            return false;
        if(preMap.get(course).isEmpty())
            return true;
        visited.add(course);
        for(int pre:preMap.get(course))
            if(!dfs(pre))
                return false;
        visited.remove(course);
        preMap.put(course,new ArrayList<>());
        return true;
    }
}
