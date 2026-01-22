class Solution {
    public int minimumPairRemoval(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int ops=0;
        for(int n:nums) list.add(n);
        while(!arrayisSorted(list)){
            int minSum=Integer.MAX_VALUE;
            int index=-1;
            for(int i=0;i<list.size()-1;i++){
                if(list.get(i)+list.get(i+1)<minSum){
                    minSum=list.get(i)+list.get(i+1);
                    index=i;
                }
            }
            list.set(index,minSum);
            list.remove(index+1);
            ops++;
        }
        return ops;
    }
    public boolean arrayisSorted(ArrayList<Integer> nums){
        for(int i=0;i<nums.size()-1;i++){
            if(nums.get(i+1)<nums.get(i)) return false;
        }
         return true;
    }
}