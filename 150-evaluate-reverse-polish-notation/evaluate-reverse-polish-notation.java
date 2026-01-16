class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String s:tokens){
            int op=isOperation(s);
            if(op==0){
                int val=Integer.parseInt(s);
                stack.push(val);
            }
            else{
                int val1=stack.pop();
                int val2=stack.pop();
                if(op==1) stack.push(val2+val1);
                else if(op==2) stack.push(val2-val1);
                else if(op==3) stack.push(val2*val1);
                else stack.push(val2/val1);
            }
        }
        return stack.peek();
    }
    public int isOperation(String s){
        if(s.equals("+")) return 1;
        else if(s.equals("-")) return 2;
        else if(s.equals("*")) return 3;
        else if(s.equals("/")) return 4;
        return 0;
    }
}
