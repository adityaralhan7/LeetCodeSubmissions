class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0,ten=0;
        for(int i:bills){
            if(i==5) five++;
            if(i==10){
                if(five==0) return false;
                else{
                    five--;
                    ten++;
                }
            }
            if(i==20){
                if(ten>=1&&five>=1){
                    ten--;
                    five--;
                }
                else if(five>=3) five-=3;
                else return false;
            }
        }
        return true;
    }
}