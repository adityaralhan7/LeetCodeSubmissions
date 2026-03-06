class Solution {
    public boolean checkOnesSegment(String s) {
        int indexof1=-1;
        int indexof0=-1;
        int flag=1;
        for(char ch:s.toCharArray()){
            if(ch=='0') flag=0;
        }
        if(flag==1) return true;
        if(s.length()==1&&s.charAt(0)=='1') return true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                indexof0=i;
                break;
            }
        }
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                indexof1=i;
                break;
            }
        }
        return indexof0>indexof1;
    }
}