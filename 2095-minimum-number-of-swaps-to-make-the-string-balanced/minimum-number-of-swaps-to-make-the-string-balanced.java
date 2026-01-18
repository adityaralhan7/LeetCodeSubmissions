class Solution {
    public int minSwaps(String s) {
       int balance=0;
       int ans=0;
       for(char c:s.toCharArray()){
            if(c=='[') balance++;
            else if(c==']'){
                if(balance>0){
                    balance--;
                }
                else{
                    ans++;
                }
            }
       } 
       return (ans+1)/2;
    }
}