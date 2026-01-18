class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb=new StringBuilder();
        int balance=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                balance++;
                sb.append(c);
            }
            else if(c==')'){
                if(balance>0){
                    balance--;
                    sb.append(c);
                }
            }
            else sb.append(c);
        }
        for(int i=sb.length()-1;i>=0;i--){
            if(balance>0&&sb.charAt(i)=='('){
                sb.deleteCharAt(i);
                balance--;
            }
        }
        return sb.toString();
    }
}