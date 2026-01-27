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
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> ans=new ArrayList<>();
        HashMap<String,Integer> map=new HashMap<>();
        solve(root,map,ans);
        return ans;
    }

    public String solve(TreeNode root,HashMap<String,Integer> map,List<TreeNode> ans){
        if(root==null) return "";
        String s=String.valueOf(root.val)+","+solve(root.left,map,ans)+","+solve(root.right,map,ans);
        if(map.containsKey(s)&&map.get(s)==1) ans.add(root);
        map.put(s,map.getOrDefault(s,0)+1);
        return s;
    }
}