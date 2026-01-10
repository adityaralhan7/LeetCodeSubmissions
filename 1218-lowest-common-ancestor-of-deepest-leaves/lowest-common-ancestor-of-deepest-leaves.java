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
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        int l=height(root.left);
        int r=height(root.right);
        if(l>r){
            return lcaDeepestLeaves(root.left);
        }
        else if(r>l){
            return lcaDeepestLeaves(root.right);
        }
        return root;
    }

    public int height(TreeNode root){
        if(root==null) return 0;
        int l=height(root.left);
        int r=height(root.right);
        return Math.max(l,r)+1;
    }
}