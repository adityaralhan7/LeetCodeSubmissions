class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        boolean freq[]=new boolean[nums.length];
        recur(ans,list,freq,nums);
        return ans;
    }

    public static void recur(List<List<Integer>> ans,List<Integer> list,boolean freq[],int nums[]){


        if(list.size()==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }


        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                list.add(nums[i]);
                freq[i]=true;
                recur(ans,list,freq,nums);
                list.remove(list.size()-1);
                freq[i]=false;
            }
        }
    }
}