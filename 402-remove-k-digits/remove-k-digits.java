class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack=new Stack<>();
        Stack<Character> stack2=new Stack<>();
        for(char c:num.toCharArray()){
            while(!stack.isEmpty()&&k>0&&stack.peek()-'0'>c-'0'){
                stack.pop();
                k--;
            }
            stack.push(c);
        }
        while(k>0){
            stack.pop();
            k--;
        }
        int ans=0;
        while(!stack.isEmpty()) stack2.push(stack.pop());
        StringBuilder sb=new StringBuilder();
        while(!stack2.isEmpty()){
            sb.append(stack2.pop());
        }
        int i=0;
        while(i<sb.length()&&sb.charAt(i)=='0') i++;
        String res=sb.substring(i);
        if(res.length()==0) return "0";
        return res;
    }
}