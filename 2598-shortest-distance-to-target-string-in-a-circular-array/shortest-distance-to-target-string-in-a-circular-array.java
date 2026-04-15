class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int ans=Integer.MAX_VALUE;
        
        for(int i=0;i<words.length;i++){
            if(words[i].equals(target)){
                int diff=Math.abs(i-startIndex);
            
                int circular=Math.min(diff,words.length-diff);
                ans=Math.min(ans,circular);
            }
        }
        if(ans==Integer.MAX_VALUE) return -1;
        return ans;
    }
}