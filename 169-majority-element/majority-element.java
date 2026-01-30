class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        int ans=0;
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
            if(map.get(n)!=0){
                if(map.get(n)>max){
                    max=map.get(n);
                    ans=n;
                }
        }
        }
        return ans;
    }
}