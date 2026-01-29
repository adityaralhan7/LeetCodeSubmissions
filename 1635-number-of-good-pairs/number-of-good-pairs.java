class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            if(map.containsKey(n)){
                ans+=map.get(n);
                map.put(n,map.get(n)+1);
            }
            else{
                map.put(n,1);
            }
            
    }
    return ans;
}
}