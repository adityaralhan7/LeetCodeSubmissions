class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int l=0,r=0;
        for(char c:moves.toCharArray()){
            if(c=='L') l++;
            else if(c=='R') r++;
        }
        int val=0;
        if(l>r) val=-1;
        else val=1;
        int ans=0;
        for(char ch:moves.toCharArray()){
            if(ch=='L') ans--;
            else if(ch=='R') ans++;
            else ans+=val;
        }
        return Math.abs(ans);
    }
}