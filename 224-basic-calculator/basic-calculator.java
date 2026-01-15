class Solution {
    public int calculate(String s) {
        Stack<Integer> stack=new Stack<>();
        int number=0;
        int result=0;
        int sign=1;

        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                int num=c-'0';
                number=number*10+num;
            }
            else if(c=='-'||c=='+'){
                result=result+number*sign;
                if(c=='+') sign=1;
                else sign=-1;
                number=0;
            }
            else if(c=='('){
                result=result+number*sign;
                stack.push(result);
                stack.push(sign);
                number=0;
                sign=1;
                result=0;
            }
            else if(c==')'){
                result=result+number*sign;
                result*=stack.pop();
                result+=stack.pop();
                number=0;
                sign=1;
            }
        }
        return result+sign*number;
    }
}