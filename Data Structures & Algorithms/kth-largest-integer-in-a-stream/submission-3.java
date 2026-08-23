class KthLargest{
    Queue<Integer> queue = new PriorityQueue<>();
    int max;
    public KthLargest(int k, int[] nums) {
        int i=0;
        max=k;
        for(;i<k&&i<nums.length;i++)
        {
            queue.add(nums[i]);
        }
        for(;i<nums.length;i++)
        {
            queue.offer(nums[i]);
            queue.poll();
        }
    }
    
    public int add(int val) {
        if(queue.size()==max)
        {
            queue.offer(val);
            queue.poll();
        }
        else
            queue.offer(val);
        return queue.peek();
    }
}
