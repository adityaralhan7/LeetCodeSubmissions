class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int index=0;
        int time=0;
        int index_m=-1,index_p=-1,index_g=-1;
        for(String s:garbage){
            time+=s.length();
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(c=='M') index_m=index;
                if(c=='P') index_p=index;
                if(c=='G') index_g=index;
            }
            index++;
        }
        for(int i=1;i<travel.length;i++){
            travel[i]=travel[i]+travel[i-1];
        }
        if(index_m!=-1&&index_m!=0) time+=travel[index_m-1];
        if(index_p!=-1&&index_p!=0) time+=travel[index_p-1];
        if(index_g!=-1&&index_g!=0) time+=travel[index_g-1];
        return time;
    }
}