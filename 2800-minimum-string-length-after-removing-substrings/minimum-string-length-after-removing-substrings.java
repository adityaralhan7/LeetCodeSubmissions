class Solution {
    public int minLength(String s) {
        int ans=s.length();
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!stack.isEmpty()&&s.charAt(i)=='B'&&stack.peek()=='A'){
                ans-=2;
                stack.pop();
            }
            else if(!stack.isEmpty()&&s.charAt(i)=='D'&&stack.peek()=='C'){
                ans-=2;
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        return ans;
    }
}