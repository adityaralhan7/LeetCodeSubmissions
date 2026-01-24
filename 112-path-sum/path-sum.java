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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return solve(root,targetSum,0);
    }
    public boolean solve(TreeNode root,int target,int curr){
        if(root==null) return false;
        curr+=root.val;
        if(root.left==null&&root.right==null){
            if(curr==target) return true;
            else return false;
        }
        boolean a=solve(root.left,target,curr);
        boolean b=solve(root.right,target,curr);
        return a|b;
    }
}