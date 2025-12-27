class Solution {
    public int bestClosingTime(String customers) {
        
        int score=0,maxScore=0,pos=-1;
        for(int i=0;i<customers.length();i++){
            char c=customers.charAt(i);

            if(c=='Y') score+=1;
            else score-=1;
            if(score>maxScore){
                maxScore=score;
                pos=i+1;
            }
        }
        return Math.max(pos,0);


    }
}