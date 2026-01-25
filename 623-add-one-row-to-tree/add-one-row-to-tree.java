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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode newRoot=new TreeNode(val);
            newRoot.left=root;
            return newRoot;
        }
        return solve(root,val,depth,1);
    }
    public TreeNode solve(TreeNode root,int val,int depth,int currDepth){
        if(root==null) return null;
        if(currDepth==depth-1){
            TreeNode newLeft=new TreeNode(val);
            TreeNode newRight=new TreeNode(val);
            TreeNode oldLeft=root.left;
            TreeNode oldRight=root.right;
            root.left=newLeft;
            root.right=newRight;
            newLeft.left=oldLeft;
            newRight.right=oldRight;
        }
        root.left=solve(root.left,val,depth,currDepth+1);
        root.right=solve(root.right,val,depth,currDepth+1);
        return root;
    }
}