class Solution {
    String ans="";
    public String findDifferentBinaryString(String[] nums) {
        HashSet<String> set=new HashSet<>();
        int n=nums[0].length();
        StringBuilder sb=new StringBuilder();
        for(String s:nums) set.add(s);
        generate(n,set,sb);
        return ans;
    }
    public void generate(int n,HashSet<String> set,StringBuilder sb){
        if(ans.length()!=0){
            return;
        }
        if(sb.length()==n){
            if(!set.contains(sb.toString())) ans=sb.toString();
            return;
        }

        sb.append("0");
        generate(n,set,sb);
        sb.deleteCharAt(sb.length()-1);
        sb.append("1");
        generate(n,set,sb);
        sb.deleteCharAt(sb.length()-1);
    }
}