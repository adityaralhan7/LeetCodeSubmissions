class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]<min) min=arr[i+1]-arr[i];
        }
        for(int i=0;i<arr.length-1;i++){
             if(arr[i+1]-arr[i]==min){
                list.add(arr[i]);
                list.add(arr[i+1]);
                ans.add(new ArrayList<>(list));
                list.clear();
             }
        }
        return ans;
    }
}