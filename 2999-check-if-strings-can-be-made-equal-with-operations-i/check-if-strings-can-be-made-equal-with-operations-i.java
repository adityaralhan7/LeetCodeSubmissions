class Solution {
    public boolean canBeEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;
        int flag=1;
        for(int i=0;i<4;i++){
            if(i==0||i==1){
                if(s1.charAt(i)!=s2.charAt(i)&&s1.charAt(i)!=s2.charAt(i+2)) flag=0;
            }
            if(i==2||i==3){
                if(s1.charAt(i)!=s2.charAt(i)&&s1.charAt(i)!=s2.charAt(i-2)) flag=0;
            }
        }
        return flag==1;
    }
}