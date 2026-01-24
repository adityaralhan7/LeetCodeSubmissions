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
    public int sumRootToLeaf(TreeNode root) {
        return helper(root,0);
    }
    public int helper(TreeNode root,int curr){
        if(root==null) return 0;
        curr=curr*2+root.val;
        if(root.left==null&&root.right==null) return curr;

        int l=helper(root.left,curr);
        int r=helper(root.right,curr);
        return l+r;

    }
}