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
    int len=Integer.MAX_VALUE;
    int curr=1;
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        return trav(root,curr);
    }
    public int trav(TreeNode n,int curr){
        if(n==null){
            return Integer.MAX_VALUE;
        }
        if(n.left==null&&n.right==null){
            len=Math.min(len,curr);
            return len;
        }
        curr++;
        int l=trav(n.left,curr);
        int r=trav(n.right,curr);
        return Math.min(l,r);
    }
}