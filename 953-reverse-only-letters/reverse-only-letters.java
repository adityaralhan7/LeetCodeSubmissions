class Solution {
    public String reverseOnlyLetters(String s) {
        char arr[]=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            char ch1=s.charAt(i);
            char ch2=s.charAt(j);
            if(Character.isLetter(ch1)&&Character.isLetter(ch2)){
                arr[i]=ch2;
                arr[j]=ch1;
                i++;
                j--;
            }
            else if(!Character.isLetter(ch1)&&!Character.isLetter(ch2)){
                i++;
                j--;
            }
            else if(!Character.isLetter(ch1)&&Character.isLetter(ch2)){
                i++;
            }
            else{
                j--;
            }
        }   
        String ans="";
        for(char ch:arr) ans+=ch;
        return ans;
    }
}