class Solution {
    public int binaryGap(int n) {
        String binary=Integer.toBinaryString(n);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<binary.length()-1;i++){
            if(binary.charAt(i)=='1'){
                int len=0;
                int j=i+1;
                while(j<binary.length()&&binary.charAt(j)=='0'){
                    len++;
                    j++;
                }
                if(j!=binary.length()) max=Math.max(max,len+1);
            }
        }
        return Math.max(0,max);
    }
}