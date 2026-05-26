class Solution {
    public int passwordStrength(String password) {
        int ans=0;
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<password.length();i++){
            char ch=password.charAt(i);
            
            if(Character.isLetter(ch)&&!set.contains(ch)){
                if(Character.isUpperCase(ch)){
                    ans+=2;
                    set.add(ch);
                }
                else{
                    ans++;
                    set.add(ch);
                }
            }
            if(Character.isDigit(ch)&&!set.contains(ch)){
                ans+=3;
                set.add(ch);
            }
            if((ch=='!'||ch=='@'||ch=='#'||ch=='$')&&!set.contains(ch)) {
                ans+=5;
                set.add(ch);
            }
        }
        return ans;
    }
}