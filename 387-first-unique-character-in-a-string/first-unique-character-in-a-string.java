class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        ArrayList<Character> ans=new ArrayList<>();
        int index=0;

        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> e:map.entrySet()){
            if(e.getValue()==1){
                ans.add(e.getKey());
            }
        }
        for(char c:s.toCharArray()){
            if(ans.indexOf(c)!=-1) return index;
            index++;
        }
        return -1;
    }
}