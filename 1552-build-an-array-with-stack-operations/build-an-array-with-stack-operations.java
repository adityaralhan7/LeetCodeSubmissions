class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> list=new ArrayList<>();
        int i=0;
        int stream=1;
        while(i<target.length&&stream<=n){
            if(target[i]==stream){
                list.add("Push");
                i++;
                stream++;
            }
            else{
                list.add("Push");
                list.add("Pop");
                stream++;
            }
        }
        return list;
    }
}