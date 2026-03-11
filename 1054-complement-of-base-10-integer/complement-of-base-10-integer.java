class Solution {
    public int bitwiseComplement(int n) {
        String b=Integer.toBinaryString(n);
        String b2="";
        for(char ch:b.toCharArray()){
            if(ch=='1') b2+='0';
            else b2+='1';
        }
        int ans=Integer.parseInt(b2,2);
        return ans;
    }
}