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
    int mod=1000000007;
    long maxProduct=0;
    long totalSum=0;
    public int maxProduct(TreeNode root) {
      totalSum=sumofTree(root);
      dfs(root);
      return (int)(maxProduct%mod);
        
    }
    public int sumofTree(TreeNode root){
        if(root==null) return 0;
        
        int l= sumofTree(root.left);
        int r=sumofTree(root.right);
        return l+r+root.val;
    }

    public long dfs(TreeNode root){
        if(root==null) return 0;
        long l=dfs(root.left);
        long r=dfs(root.right);
        long subSum=l+r+root.val;
        maxProduct=Math.max(maxProduct,subSum*(totalSum-subSum));
        return subSum;
    }
}