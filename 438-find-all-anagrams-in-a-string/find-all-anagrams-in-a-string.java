class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int freq[]=new int[26];
        int k=p.length();
        int slen=s.length();
        int plen=p.length();
        if(plen>slen) return new ArrayList<>();
        ArrayList<Integer> result=new ArrayList<>();
        int l=0;
        for(int i=0;i<k;i++) freq[p.charAt(i)-'a']++;
        for(int r=0;r<s.length();r++){
            freq[s.charAt(r)-'a']--;
            if(r-l+1==k){
                if(allzero(freq)) result.add(l);
                 freq[s.charAt(l)-'a']++;
                 l++;
            }
        }
        return result;
    }

    public boolean allzero(int arr[]){
        for(int i:arr) if(i!=0) return false;
        return true;
    }
}