class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> q=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<stones.length;i++)
        {
            q.offer(stones[i]);
        }
        while(q.size()>1)
        {
            int s=Math.abs(q.poll()-q.poll());
            if(s==0)
                continue;
            else
                q.offer(s);
        }
        if(q.isEmpty())
            return 0;
        return q.peek();
    }
}
