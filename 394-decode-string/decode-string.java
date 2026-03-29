class Solution {
    int i=0;
    public String decodeString(String s) {
        return helper(s);
    }
    public String helper(String s){
        int num=0;
       StringBuilder ans=new StringBuilder();
        while(i<s.length()){
            if(Character.isDigit(s.charAt(i))){
                while(s.charAt(i)!='['){
                    num*=10;
                    num+=s.charAt(i)-'0';
                    i++;
                }
                i++;
                 String inner=helper(s);
                 for(int j=0;j<num;j++){
                    ans.append(inner);
                 }
                 num=0;
            }
            else{
                if(s.charAt(i)==']'){
                    i++;
                    return ans.toString();
                }
                if(s.charAt(i)!='['&&s.charAt(i)!=']') ans.append(s.charAt(i));
                i++;
            }
        }
         return ans.toString();
    }
}