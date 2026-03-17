class Solution {
    StringBuilder sb=new StringBuilder();
    int index=-1;
    public String breakPalindrome(String palindrome) {
        if(palindrome.length()==1) return "";
        solve(palindrome);
        if(index==-1){
            sb=new StringBuilder();
            for(int i=index+1;i<palindrome.length();i++) sb.append(palindrome.charAt(i));
            sb.deleteCharAt(sb.length()-1);
            sb.append('b');
            return sb.toString();
        }
        
        for(int i=index+1;i<palindrome.length();i++) sb.append(palindrome.charAt(i));
        return sb.toString();
    }

    public void solve(String palindrome){
        int len=palindrome.length();
        for(int i=0;i<len/2;i++){
            if(palindrome.charAt(i)!='a'){
                sb.append('a');
                index=i;
                return;
            }
            else{
                sb.append(palindrome.charAt(i));
            }
    
}
    }
}