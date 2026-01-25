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
    int maxDiff=Integer.MIN_VALUE;
    public int maxAncestorDiff(TreeNode root) {
        if(root==null) return 0;
        diffRoot(root);
        return maxDiff;
    }
    public void findMaxDiff(TreeNode root,TreeNode child){
        if(root==null||child==null) return;
        maxDiff=Math.max(maxDiff,Math.abs(root.val-child.val));
        findMaxDiff(root,child.left);
        findMaxDiff(root,child.right);
    }
    public void diffRoot(TreeNode root){
        if(root==null) return;
        findMaxDiff(root,root.left);
        findMaxDiff(root,root.right);

        diffRoot(root.left);
        diffRoot(root.right);
    }
}