class Solution {
    public int longestBalanced(String s) {
        int freq[]=new int[26];
        int ans=0;
        for(int i=0;i<s.length();i++){
            int maxFreq=0;
            int nayachar=0;
            Arrays.fill(freq,0);
            for(int j=i;j<s.length();j++){
                int index=s.charAt(j)-'a';
                if(freq[index]==0){
                    nayachar++;
                }
                freq[index]++;
                maxFreq=Math.max(maxFreq,freq[index]);
                if(maxFreq*nayachar==j-i+1) ans=Math.max(ans,j-i+1);
            }
        }
        return ans;
    }
}