class Solution {
    public int myAtoi(String s) {
        int ans=0;
        s=s.trim();
        if(s.length()==0) return 0;
        if(s.charAt(0)=='-'){
            for(int i=1;i<s.length();i++){
                char ch=s.charAt(i);
                if(Character.isDigit(ch)){
                    if((ans>Integer.MAX_VALUE/10)||(ans==Integer.MAX_VALUE/10)&&(ch-'0')>=8) return Integer.MIN_VALUE;
                    ans*=10;
                    ans+=ch-'0';
                }
                else return (0-ans);
            }
        }

          else if(s.charAt(0)=='+'){
            for(int i=1;i<s.length();i++){
                char ch=s.charAt(i);
                if(Character.isDigit(ch)){
                    if((ans>Integer.MAX_VALUE/10)||(ans==Integer.MAX_VALUE/10)&&(ch-'0')>=8) return Integer.MAX_VALUE;
                    ans*=10;
                    ans+=ch-'0';
                }
                else return ans;
            }
        }





        else{
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(Character.isDigit(ch)){
                    if((ans>Integer.MAX_VALUE/10)||(ans==Integer.MAX_VALUE/10)&&(ch-'0')>7) return Integer.MAX_VALUE;
                    ans*=10;
                    ans+=ch-'0';
                }
                else return ans;
            }
        }
        if(s.charAt(0)=='-') return 0-ans;
        return ans;

    }
}