class Solution {
    public boolean parseBoolExpr(String expression) {
        if(expression.equals("t")) return true;
        if(expression.equals("f")) return false;
        boolean ans=false;
        Stack<Character> stack=new Stack<>();
        ArrayList<Character> list=new ArrayList<>();
        for(char c:expression.toCharArray()){
            if(c==')'){
                while(stack.peek()!='('){
                    list.add(stack.pop());
                }
                stack.pop();
                char operation=stack.pop();
                ans=check(list,operation);
                list.clear();
                if(ans==true) stack.push('t');
                else stack.push('f');
            }
            else if(c==',') continue;
            else{
                stack.push(c);
            }
        }
        return ans;
    }
    boolean check(ArrayList<Character> list,char op){
        if(op=='&'){
            if(list.contains('f')) return false;
            else return true;
        }
        else if(op=='|'){
            if(list.contains('t')) return true;
            else return false;
        }
        if(list.get(0)=='f') return true;
        return false;
    }
}