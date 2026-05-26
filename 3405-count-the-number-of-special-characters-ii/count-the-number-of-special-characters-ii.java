class Solution {
    public int numberOfSpecialChars(String word) {
        int small[]=new int[26];
        int big[]=new int[26];
        Arrays.fill(small,-1);
        Arrays.fill(big,Integer.MAX_VALUE);
        for(int i=0;i<word.length();i++){
            int val=(int)word.charAt(i);
            if(val>=65&&val<97){
                big[val-65]=Math.min(big[val-65],i);
            }
            else small[val-97]=i;
        }
        int ans=0;
        for(int i=0;i<26;i++){
            if(small[i]!=-1&&big[i]!=Integer.MAX_VALUE&&small[i]<big[i]) ans++;
        }
        return ans;
    }
}