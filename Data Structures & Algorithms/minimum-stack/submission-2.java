class MinStack {
    Stack<Integer> minstack;
    Stack<Integer> minimum=new Stack<>();
    int min=Integer.MAX_VALUE;

    public MinStack() {
        minstack=new Stack<>();
    }
    
    public void push(int val) {
        minstack.push(val);
        if(val<=min)
        {
            min=val;
            minimum.push(min);
        }
    }
    
    public void pop() {
        int p=minstack.peek();
        minstack.pop();
        if(p==min)
        {
            minimum.pop();
            if(minimum.isEmpty())
            {
                min=Integer.MAX_VALUE;
            }
            else
            {
                min=minimum.peek();
            }
        }

        
    }
    
    public int top() {
        return(minstack.peek());
    }
    
    public int getMin() {
        return minimum.peek();
        
    }
}
