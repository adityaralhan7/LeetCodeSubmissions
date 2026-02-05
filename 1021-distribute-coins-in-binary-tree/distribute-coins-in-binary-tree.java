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
    int moves=0;
    public int distributeCoins(TreeNode root) {
        solve(root);
        return moves;
    }
    public int solve(TreeNode root){
        if(root==null) return 0;
        int l=solve(root.left);
        int r=solve(root.right);
        moves=moves+Math.abs(l)+Math.abs(r);
        return (l+r+root.val)-1;
    }
}