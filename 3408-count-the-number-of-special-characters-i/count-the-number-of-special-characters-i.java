class Solution {
    public int numberOfSpecialChars(String word) {
        int arr1[]=new int[26];
        int arr2[]=new int[26];
        int count=0;
        for(char ch:word.toCharArray()){
            if((int)ch<97){
                arr1[ch-'A']=1;
            }
            else{
                arr2[ch-'a']=1;
            }
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]==1&&arr2[i]==1){
                count++;
            }
        }
        return count;
    }
}