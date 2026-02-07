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
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        TreeNode n=delete(root,target);
        return n;
    }
    public TreeNode delete(TreeNode root,int target){
        if(root==null) return root;
        root.left=delete(root.left,target);
        root.right=delete(root.right,target);
        if(root.left==null&&root.right==null&&root.val==target){
            return null;
        }
        return root;

    }
}