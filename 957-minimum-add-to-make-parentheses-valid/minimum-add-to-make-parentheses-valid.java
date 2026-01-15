class Solution {
    public int minAddToMakeValid(String s) {
        int count=0;
        Stack<Character> ss=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='(') ss.push(c);
            else if(c==')'&&!ss.isEmpty()) ss.pop();
            else count++;
        }
        return ss.size()+count;
    }
}