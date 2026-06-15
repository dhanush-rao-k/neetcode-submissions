class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result=new int[temperatures.length];
        Stack<Integer>stk=new Stack<>();
        for(int i=0;i<temperatures.length;i++)
        {
            if(stk.isEmpty())
            {
                stk.push(i);
            }
            else{
                while(!stk.isEmpty()&&temperatures[i]>temperatures[stk.peek()])
                {
                    result[stk.peek()]=i-stk.peek();
                    stk.pop();
                }
                
            stk.push(i);
            }
        }
        while(!stk.isEmpty())
        {
            result[stk.pop()]=0;
        }
        return result;
        
    }
}
