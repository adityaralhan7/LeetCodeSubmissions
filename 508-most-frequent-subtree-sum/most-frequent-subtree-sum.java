/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    HashMap<Integer,Integer> map=new HashMap<>();
    public int[] findFrequentTreeSum(TreeNode root) {
        sum(root);
        ArrayList<Integer> list=new ArrayList<>();
        int maxFreq=0;
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            int val=e.getKey();
            int freq=e.getValue();
            if(freq>maxFreq){
                maxFreq=freq;
                list.clear();
                list.add(val);
            }
            else if(freq==maxFreq) list.add(val);
        }
        int arr[]=new int[list.size()];
        for(int i=0;i<arr.length;i++) arr[i]=list.get(i);
        return arr;

    }

    public int sum(TreeNode root){
        if(root==null) return 0;
        int l=sum(root.left);
        int r=sum(root.right);
        int sum=l+r+root.val;
        map.put(sum,map.getOrDefault(sum,0)+1);
        return sum;
    }
}