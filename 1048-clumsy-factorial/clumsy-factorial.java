class Solution {
    public int clumsy(int n) {
        Stack<Integer> stack=new Stack<>();
        stack.push(n);
        n--;
        int index=0;
        while(n>0){
            if(index==0) stack.push(stack.pop()*n);
            if(index==1) stack.push(stack.pop()/n);
            if(index==2) stack.push(n);
            if(index==3) stack.push(-n);
            n--;
            index=(index+1)%4;
        }
        int ans=0;
        while(!stack.isEmpty()) ans+=stack.pop();
        return ans;
    }
}