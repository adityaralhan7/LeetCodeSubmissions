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
    public int[] findMode(TreeNode root) {
        inOrder(root);
        ArrayList<Integer> res=new ArrayList<>();
        int maxFreq=Collections.max(map.values());
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()==maxFreq) res.add(e.getKey());
        }
        int arr[]=new int[res.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=res.get(i);
        }
        return arr;
    }
    public void inOrder(TreeNode root){
        if(root==null) return;
        inOrder(root.left);
        map.put(root.val,map.getOrDefault(root.val,0)+1);
        inOrder(root.right);
    }
}