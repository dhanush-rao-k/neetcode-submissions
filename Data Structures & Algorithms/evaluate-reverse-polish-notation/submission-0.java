class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        int op1=0;
        int op2=0;
        for(int i=0;i<tokens.length;i++)
        {
            if(tokens[i].equals("*"))
            {
                op2=stk.pop();
                op1=stk.pop();
                stk.push(op1*op2);
            }
            else if(tokens[i].equals("/"))
            {
                op2=stk.pop();
                op1=stk.pop();
                stk.push(op1/op2);
            }
            else if(tokens[i].equals("+"))
            {
                op2=stk.pop();
                op1=stk.pop();
                stk.push(op1+op2);
            }
            else if(tokens[i].equals("-"))
            {
                op2=stk.pop();
                op1=stk.pop();
                stk.push(op1-op2);
            }   
            else
            {
                op1=Integer.parseInt(tokens[i]);
                stk.push(op1);
            }
        }
        return stk.pop();
    }
}
