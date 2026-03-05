class Solution {
    public int minOperations(String s) {
        int count1=0,count2=0;
        for(int i=0;i<s.length();i++){
            if(i%2==0&&s.charAt(i)=='1') count1++;
            if(i%2!=0&&s.charAt(i)=='0') count1++;
            if(i%2==0&&s.charAt(i)=='0') count2++;
            if(i%2!=0&&s.charAt(i)=='1') count2++;
        }
        return Math.min(count1,count2);
    }
}